package me.clay.commands2.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;


public class TestListener implements Listener {
    public void PlayerRespawnEvent(PlayerRespawnEvent Player){
        Player.getRespawnLocation();
        System.out.println(Player.getRespawnLocation());

    }

}
