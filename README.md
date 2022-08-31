# Static-GUI API
A simple and lightweight Minecraft GUI API for developers to use.

# Here is an example of how to use the API:

```java
        StaticGUI gui = GUIBuilder.builder()
                .title("Example GUI")
                .size(45)
                .persistent(false)
                .onOpen((p, g) -> {
                    p.sendMessage("You opened a GUI");
                })
                .onClose((p, g) -> {
                    p.sendMessage("You closed a GUI");
                })
                .fillWith(
                        ButtonBuilder.builder()
                                .name("Placeholder")
                                .icon(Material.LIGHT_BLUE_STAINED_GLASS_PANE)
                                .enchanted(true)
                                .build()
                )
                .onUpdate((g) -> {
                    g.getInventory().getViewers().forEach(p -> p.sendMessage("Updating this GUI..."));
                    g.setButtons(
                            ButtonBuilder.builder()
                                    .name("Click me!")
                                    .icon(Material.DIAMOND)
                                    .enchanted(true)
                                    .onLeftClick(p -> p.sendMessage("You clicked me!"))
                                    .build(),
                            ButtonBuilder.builder()
                                    .name("Click me too!")
                                    .lore(
                                            List.of(
                                            Component.text("I am a line"),
                                            Component.text("I am another line!")
                                            )
                                    )
                                    .icon(Material.EMERALD)
                                    .onLeftClick(p -> p.sendMessage("You clicked me as well!!"))
                                    .build()
                    );
                }, 100)
                .build();
        gui.getSettings().allowPlayerItems(false);


        gui.setButton(0,
                ButtonBuilder.builder()
                        .onLeftClick((p) -> {
                            p.sendMessage("Left click");
                        })
                        .onRightClick((p) -> {
                            p.sendMessage("Right click");
                        })
                        .onMiddleClick((p) -> {
                            p.sendMessage("Middle click");
                        })
                        .icon(Material.BIRCH_BUTTON)
                        .enchanted(true)
                        .build()
        );

```

# Make sure to enable it!
In your plugin's onEnable & onDisable methods, please call the following methods to prevent errors!
```java
    @Override
    public void onEnable() {
        StaticGUI.enable(this);
    }

    @Override
    public void onDisable() {
        StaticGUI.disable();
    }
```

# Current Version: 1.0.0
Requirements:

    - You must be using PaperMC or a fork of it (This will not work with just Spigot/Bukkit!)
    - Curently this API only supports servers running 1.18.1+ (This version limit should be lowered in the near future)
