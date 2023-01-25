package me.clay.Tremor.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DataCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            {

                p.sendMessage(p.getDisplayName() + " Is your IGN.\n" + p.getPing() + " Is your ping.\n" + "OP Status: " + p.isOp() + "\nTotal Experience Earned: " + p.getTotalExperience());
            }
        }
            return true;

        }

    }
