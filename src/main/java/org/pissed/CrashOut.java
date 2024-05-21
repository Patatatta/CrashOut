package org.pissed;

import org.bukkit.plugin.java.JavaPlugin;

public final class CrashOut extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("spawn").setExecutor(new SpawnCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
