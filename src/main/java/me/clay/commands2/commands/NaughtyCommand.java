package me.clay.commands2.commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NaughtyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;

            p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 5, 4));
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 500, 9));
            p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 2));
            p.sendMessage(ChatColor.RED + "" + p.getDisplayName() + ", Naughty, Naughty, Naughty.");
        }
        return true;
    }
}
