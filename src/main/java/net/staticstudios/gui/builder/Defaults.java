package net.staticstudios.gui.builder;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;

final class Defaults {
    public static final int DEFAULT_SIZE = 27;
    public static final Component DEFAULT_TITLE = Component.text("Static GUI").color(NamedTextColor.RED).decorate(TextDecoration.BOLD);
}
