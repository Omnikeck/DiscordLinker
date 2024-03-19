package org.debuff;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Discord extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
        getCommand("discord").setExecutor(this);
        Bukkit.getConsoleSender().sendMessage("Discord Plugin succesfully enabled");
        Bukkit.getConsoleSender().sendMessage("https://discord.gg/debuff");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use the /back command.");
            return true;

        }
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("discord")) {
            if (args.length == 0) {
                if (player.hasPermission("debuff.discord")) {
                    String invitelink = getConfig().getString("discord.invite_link", "https://discord.gg/debuff");
                    String messageFormat = getConfig().getString("discord.message_format", "<#0084ff>Join the DebuffNetwork Discord Community\n<#0084ff>\u00bb <gray>%invite_link%");
                    messageFormat = messageFormat.replace("%invite_link%", invitelink);
                    player.sendMessage(MiniMessage.miniMessage().deserialize(messageFormat));

                }
            }

            }
            if (args.length >= 1 && args[0].equalsIgnoreCase("reload")) {
                if(player.hasPermission("debuff.discord.reload")){
                    player.sendMessage(ChatColor.GREEN + "Sucessfully reloaded the config!");
                    reloadConfig();
        }
            }
        return true;
    }
        @Override
        public void onDisable () {
            // Plugin shutdown logic
        }
    }
