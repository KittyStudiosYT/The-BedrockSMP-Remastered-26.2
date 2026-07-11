package net.itskittyyoutube.kitty.command.permissions;

import java.util.Set;

public class TBSPermissions {
    public static final net.minecraft.server.permissions.Permission COMMANDS_MODERATOR = new net.minecraft.server.permissions.Permission.HasCommandLevel(net.minecraft.server.permissions.PermissionLevel.MODERATORS);
    public static final net.minecraft.server.permissions.Permission COMMANDS_GAMEMASTER = new net.minecraft.server.permissions.Permission.HasCommandLevel(net.minecraft.server.permissions.PermissionLevel.GAMEMASTERS);
    public static final net.minecraft.server.permissions.Permission COMMANDS_ADMIN = new net.minecraft.server.permissions.Permission.HasCommandLevel(net.minecraft.server.permissions.PermissionLevel.ADMINS);
    public static final net.minecraft.server.permissions.Permission COMMANDS_OWNER = new net.minecraft.server.permissions.Permission.HasCommandLevel(net.minecraft.server.permissions.PermissionLevel.OWNERS);
    public static final net.minecraft.server.permissions.Permission NOCOMMANDS_MEMBER = new net.minecraft.server.permissions.Permission.HasCommandLevel(net.minecraft.server.permissions.PermissionLevel.ALL);
    public static final net.minecraft.server.permissions.Permission COMMANDS_ENTITY_SELECTORS = net.minecraft.server.permissions.Permission.Atom.create("commands/entity_selectors");
    public static final net.minecraft.server.permissions.Permission CHAT_SEND_MESSAGES = net.minecraft.server.permissions.Permission.Atom.create("chat/send_messages");
    public static final net.minecraft.server.permissions.Permission CHAT_SEND_COMMANDS = net.minecraft.server.permissions.Permission.Atom.create("chat/send_commands");
    public static final net.minecraft.server.permissions.Permission CHAT_RECEIVE_PLAYER_MESSAGES = net.minecraft.server.permissions.Permission.Atom.create("chat/receive_player_messages");
    public static final net.minecraft.server.permissions.Permission CHAT_RECEIVE_SYSTEM_MESSAGES = net.minecraft.server.permissions.Permission.Atom.create("chat/receive_system_messages");
    public static final Set<net.minecraft.server.permissions.Permission> CHAT_PERMISSIONS = Set.of(
            CHAT_SEND_MESSAGES, CHAT_SEND_COMMANDS, CHAT_RECEIVE_PLAYER_MESSAGES, CHAT_RECEIVE_SYSTEM_MESSAGES
    );
}
