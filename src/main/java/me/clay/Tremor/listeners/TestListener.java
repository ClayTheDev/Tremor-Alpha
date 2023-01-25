package me.clay.Tremor.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;


public class TestListener implements Listener {
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent Player){
        System.out.println(Player.getRespawnLocation() + " is the players respawn location.");
    }

}
