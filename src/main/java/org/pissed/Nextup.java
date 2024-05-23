package org.pissed;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Nextup implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond = new ItemStack(Material.AMETHYST_BLOCK, 48);
            player.getInventory().addItem(diamond);
        }
        return true;
    }
    }
