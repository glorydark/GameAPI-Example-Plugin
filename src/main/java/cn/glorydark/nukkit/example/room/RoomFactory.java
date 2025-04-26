package cn.glorydark.nukkit.example.room;

import cn.glorydark.nukkit.example.GameMain;
import cn.nukkit.command.CommandSender;
import gameapi.manager.RoomManager;
import gameapi.room.Room;
import gameapi.room.RoomRule;
import gameapi.room.RoomStatus;
import gameapi.tools.WorldTools;

/**
 * @author glorydark
 */
public class RoomFactory {

    public static Room loadRoom(CommandSender commandSender, String roomName, String password, boolean allowStart, String forceMap, int gameTime) {
        RoomRule roomRule = new RoomRule(0);
        // roomRule.setAllowFoodLevelChange(false);
        // roomRule.setRespawnCoolDownTick(60);
        // roomRule.setAllowBreakBlock(false);
        // roomRule.setAutoStartTeleport(false);
        // roomRule.setAllowFallDamage(false);
        // roomRule.setEnableRoomChatSystem(false);
        // roomRule.getTipHideElements().remove(TipElementType.CHAT);

        Room room = new Room(GameMain.GAME_NAME, roomRule, 1);
        room.setResetMap(true);
        room.setTemporary(true);
        room.setMinPlayer(1);
        room.setMaxPlayer(16);

        room.setRoomName(roomName);
        room.setAllowedToStart(allowStart);
        room.setJoinPassword(password);
        room.setGameTime(gameTime);
        room.setWaitTime(3);
        room.setGameWaitTime(3);

        room.setEndSpawn(GameMain.backSpawn);

        // You need to set a room name

        if (!WorldTools.loadLevelFromBackup(forceMap + "_" + WorldTools.getNewBackUpLoadId(GameMain.GAME_NAME), GameMain.GAME_NAME + "/" + forceMap)) {
            return null; // If map is loaded failed, the room will not be constructed
        }
        room.setRoomLevelBackup(forceMap);
        RoomManager.loadRoom(room, RoomStatus.ROOM_STATUS_WAIT);

        return room;
    }
}
