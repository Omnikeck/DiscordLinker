# DiscordLinker

**Overview:**

The Discord Bukkit Plugin is a simple and lightweight plugin for Minecraft servers that allows players to easily access your Discord community from within the game. With this plugin, server owners can customize the Discord invite link and message format to suit their community's needs.

**Features:**

- **Customizable Discord Invite Link:** Server owners can easily configure the Discord invite link to their community server.
  
- **Flexible Message Format:** Customize the message format that players receive when using the `/discord` command. Include dynamic placeholders for the invite link to make it easy to maintain and update.

**Usage:**

1. Install the plugin on your Bukkit/Spigot server.
2. Customize the Discord invite link and message format in the `config.yml` file.
3. Players can use the `/discord` command in-game to access the Discord invite link and join the community.

**Configuration Example:**

```
  discord:
    invite_link: "https://discord.gg/debuff"
    message_format: "<#0084ff>Join the DebuffNetwork Discord Community\n<#0084ff>\u00bb <gray>%invite_link%"
```

**Contributing:**

Contributions to this project are welcome! If you have any suggestions, bug fixes, or feature requests, feel free to open an issue or submit a pull request.

**License:**

This plugin is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

**Author:**

Created by [Omnikeck](https://github.com/omnikeck)
