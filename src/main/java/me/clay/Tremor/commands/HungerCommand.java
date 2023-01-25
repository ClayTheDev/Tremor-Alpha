package me.clay.Tremor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class HungerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 500, 9));
            p.sendMessage(ChatColor.RED + "You've gone hungry, Better eat some food!");
        }
        return true;
    }
}
