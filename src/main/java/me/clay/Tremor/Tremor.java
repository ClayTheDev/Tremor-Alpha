package me.clay.Tremor;

import me.clay.Tremor.commands.*;
import me.clay.Tremor.listeners.TestListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tremor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("zeus").setExecutor(new GodlyCommand());
        getCommand("hunger").setExecutor(new HungerCommand());
        getCommand("ping").setExecutor(new PingCommand());
        getCommand("player").setExecutor(new DataCommand());
        getCommand("kicker").setExecutor(new KickCommand());
        getCommand("sex").setExecutor(new NaughtyCommand());
        getCommand("shell").setExecutor(new ShellCommand());
        getCommand("announce").setExecutor(new AnnouncementCommand());
        getServer().getPluginManager().registerEvents(new TestListener(), this);

    }


}
