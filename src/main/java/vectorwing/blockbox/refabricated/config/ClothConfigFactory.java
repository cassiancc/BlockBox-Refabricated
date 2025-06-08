package vectorwing.blockbox.refabricated.config;


import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import vectorwing.blockbox.BlockBox;
import vectorwing.blockbox.Config;
import java.lang.reflect.Field;
import java.util.function.Consumer;


public class ClothConfigFactory {

    private static final Config DEFAULT_VALUES = new Config();

    private static ConfigCategory createCategory(String section, ConfigBuilder builder) {
        if (section == null) {
            section = "";
        } else {
            section += "_";
        }
        return builder.getOrCreateCategory(Component.translatable("config.blockbox.%stitle".formatted(section)));
    }

    public static Screen create(Screen parent) {
        final var builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Component.translatable("itemGroup.blockbox"));

        addEntries(Config.class.getFields(), createCategory(null, builder), builder.entryBuilder());

        builder.setSavingRunnable(BlockBox.CONFIG::save);
        return builder.build();
    }

    private static void addEntries(Field[] fields, ConfigCategory category, ConfigEntryBuilder entryBuilder) {
        for (var field : fields) {

            if (field.getType() == boolean.class) {
                category.addEntry(entryBuilder.startBooleanToggle(fieldName(field), fieldGet(BlockBox.CONFIG, field))
                        .setSaveConsumer(fieldSetter(BlockBox.CONFIG, field))
                        .setTooltip(fieldTooltip(field))
                        .setDefaultValue((boolean) fieldGet(DEFAULT_VALUES, field)).build());

            }
            else if (field.getType() == String.class) {
                category.addEntry(entryBuilder.startStrField(fieldName(field), fieldGet(BlockBox.CONFIG, field))
                        .setSaveConsumer(fieldSetter(BlockBox.CONFIG, field))
                        .setTooltip(fieldTooltip(field))
                        .setDefaultValue((String) fieldGet(DEFAULT_VALUES, field)).build());
            }
            else if (field.getType() == int.class) {
                category.addEntry(entryBuilder.startIntField(fieldName(field), fieldGet(BlockBox.CONFIG, field))
                        .setSaveConsumer(fieldSetter(BlockBox.CONFIG, field))
                        .setTooltip(fieldTooltip(field))
                        .setDefaultValue((int) fieldGet(DEFAULT_VALUES, field)).build());
            }
        }
    }


    /**
     * Automatically generate translation keys for config options.
     */
    public static Component fieldName(Field field) {
        return Component.translatable("config.%s.config.%s".formatted(BlockBox.MODID, field.getName().toLowerCase()));
    }

    /**
     * Automatically generate translation keys for config tooltips. Relies on custom tooltip wrapping.
     */
    public static Component fieldTooltip(Field field) {
        return Component.translatable("config.%s.config.%s.description".formatted(BlockBox.MODID, field.getName().toLowerCase()));
    }

    /**
     * Get the current value of a config field.
     */
    @SuppressWarnings("unchecked")
    public static <T> T fieldGet(Object instance, Field field) {
        try {
            return (T) field.get(instance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Set a config field.
     */
    public static <T> Consumer<T> fieldSetter(Object instance, Field field) {
        return t -> {
            try {
                field.set(instance, t);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        };
    }
}