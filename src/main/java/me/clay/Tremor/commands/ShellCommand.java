package me.clay.Tremor.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShellCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 5000, 10));
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 5000, 3));
            p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 2500, 25));
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 5000,10));
        }
        return true;
    }
}
