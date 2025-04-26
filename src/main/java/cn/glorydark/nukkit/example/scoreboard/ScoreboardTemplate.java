package cn.glorydark.nukkit.example.scoreboard;

import cn.nukkit.Player;
import gameapi.manager.tools.ScoreboardManager;
import gameapi.room.Room;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ScoreboardTemplate {

    public static String objectiveName = "scoreboard.test";

    public static String displayName = "test";

    public static void showScoreboardForPlayers(Room room) {
        List<String> lines = new ArrayList<>();
        for (Player player : room.getPlayers()) {
            ScoreboardManager.drawScoreBoardEntry(objectiveName, displayName, player, lines.toArray(new String[0]));
        }
    }

    public static void showScoreboardForSpectators(Room room) {
        List<String> lines = new ArrayList<>();
        for (Player player : room.getPlayers()) {
            ScoreboardManager.drawScoreBoardEntry(objectiveName, displayName, player, lines.toArray(new String[0]));
        }
    }
}
