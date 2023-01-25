package me.clay.Tremor.commands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class AnnouncementCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("announce")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please provide a message to announce, " + ChatColor.YELLOW + p.getDisplayName() );
                return true;
            }
            String message = String.join(ChatColor.YELLOW +" ", args);
            Bukkit.broadcastMessage(ChatColor.RED + "[BROADCAST] " + ChatColor.YELLOW + message);
            return true;
        }
        return true;
    }
}