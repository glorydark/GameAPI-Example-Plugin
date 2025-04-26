package cn.glorydark.nukkit.example;

import cn.glorydark.nukkit.example.command.ExampleCommand;
import cn.glorydark.nukkit.example.listener.BedFightListener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import com.smallaswater.npc.variable.VariableManage;
import gameapi.listener.base.GameListenerRegistry;
import cn.glorydark.nukkit.example.utils.RsNPCVariable;
import cn.glorydark.nukkit.example.utils.TipsVariable;
import tip.utils.Api;

/**
 * @author glorydark
 */
public class GameMain extends PluginBase {

    public static String path;

    public static GameMain instance;

    public static final String GAME_NAME = "test";

    public static String backSpawn;

    @Override
    public void onEnable() {
        instance = this;
        path = this.getDataFolder().getPath();
        this.saveDefaultConfig();
        this.reload();
        GameListenerRegistry.registerEvents(GAME_NAME, new BedFightListener(), this);
        this.getServer().getCommandMap().register("", new ExampleCommand("test"));
        Api.registerVariables(GAME_NAME, TipsVariable.class);
        VariableManage.addVariableV2(GAME_NAME, RsNPCVariable.class);
        this.getLogger().info("test loaded!");
    }

    public void reload() {
        Config config = new Config(path + "/config.yml", Config.YAML);
        backSpawn = config.getString("back_spawn");
    }
}
