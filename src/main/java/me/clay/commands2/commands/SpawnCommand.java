/*package me.clay.commands2.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import java.util.Arrays;

public class SpawnCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("spawn")) {
            if (args.length < 2) {
                sender.sendMessage("Please provide a mob type and a number of mobs to spawn.");
                return true;
            }
            String mobType = args[0];
            int numberOfMobs;
            try {
                numberOfMobs = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                sender.sendMessage("Invalid number of mobs.");
                return true;
            }
            EntityType entityType;
            try {
                entityType = EntitiesType.valueOf(mobType.toUpperCase());
            } catch (IllegalArgumentException e) {
                sender.sendMessage("Invalid mob type. Available types: " + Arrays.toString(EntitiesType.values()));
                return true;
            }
            Location location = sender.getLocation();
            for (int i = 0; i < numberOfMobs; i++) {
                location.getWorld().spawnEntity(location, entityType);
            }
            sender.sendMessage("Spawned " + numberOfMobs + " " + entityType + " at your location.");
            return true;
        }
        return true;
    }
}*/