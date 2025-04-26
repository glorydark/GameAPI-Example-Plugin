package cn.glorydark.nukkit.example.listener;

import cn.glorydark.nukkit.example.GameMain;
import cn.nukkit.Player;
import gameapi.event.block.RoomBlockBreakEvent;
import gameapi.event.block.RoomBlockPlaceEvent;
import gameapi.event.player.RoomPlayerDeathEvent;
import gameapi.event.player.RoomPlayerJoinEvent;
import gameapi.event.player.RoomPlayerLeaveEvent;
import gameapi.event.player.RoomPlayerRespawnEvent;
import gameapi.event.room.RoomGameEndEvent;
import gameapi.event.room.RoomGameStartEvent;
import gameapi.event.room.RoomGameStartTickEvent;
import gameapi.event.room.RoomPreStartEvent;
import gameapi.listener.base.annotations.GameEventHandler;
import gameapi.listener.base.interfaces.GameListener;
import healthapi.PlayerHealth;

/**
 * @author glorydark
 */
public class TestListener implements GameListener {

    @GameEventHandler
    public void RoomPreStartEvent(RoomPreStartEvent event) {

    }

    @GameEventHandler
    public void RoomGameStartEvent(RoomGameStartEvent event) {

    }

    @GameEventHandler
    public void RoomGameStartTickEvent(RoomGameStartTickEvent event) {

    }

    @GameEventHandler
    public void RoomPlayerDeathEvent(RoomPlayerDeathEvent event) {

    }

    @GameEventHandler
    public void RoomGameEndEvent(RoomGameEndEvent event) {

    }

    @GameEventHandler
    public void onJoin(RoomPlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (GameMain.healthAPIEnabled) {
            PlayerHealth playerHealth = PlayerHealth.getPlayerHealth(player);
            playerHealth.setEnable(true);
        }
    }

    @GameEventHandler
    public void onLeave(RoomPlayerLeaveEvent event) {
        Player player = event.getPlayer();
        if (GameMain.healthAPIEnabled) {
            PlayerHealth playerHealth = PlayerHealth.getPlayerHealth(player);
            playerHealth.setEnable(true);
        }
    }
}
