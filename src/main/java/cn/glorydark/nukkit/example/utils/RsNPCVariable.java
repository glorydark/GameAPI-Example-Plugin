package cn.glorydark.nukkit.example.utils;

import cn.nukkit.Player;
import com.smallaswater.npc.data.RsNpcConfig;
import com.smallaswater.npc.variable.BaseVariableV2;

/**
 * @author glorydark
 */
public class RsNPCVariable extends BaseVariableV2 {

    @Override
    public void onUpdate(Player player, RsNpcConfig rsNpcConfig) {
        this.addVariable("{test_test}", "233");
    }
}
