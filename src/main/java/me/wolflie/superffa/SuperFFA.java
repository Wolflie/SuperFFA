package me.wolflie.superffa;

import org.bukkit.plugin.java.JavaPlugin;

public class SuperFFA extends JavaPlugin {

    private static SuperFFA instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SuperFFA getInstance() {
        return instance;
    }
}
