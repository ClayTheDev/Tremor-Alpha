package me.clay.Tremor.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;

public class WorldListener implements Listener {
    @EventHandler
    public void onWorldSave(WorldSaveEvent world ){
        System.out.println(world.getWorld().getPlayers() + " Players");
    }

}
