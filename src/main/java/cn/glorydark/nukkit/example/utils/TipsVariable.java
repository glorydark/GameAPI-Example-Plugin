package cn.glorydark.nukkit.example.utils;

import cn.nukkit.Player;
import tip.utils.variables.BaseVariable;

/**
 * @author glorydark
 */
public class TipsVariable extends BaseVariable {

    public TipsVariable(Player player) {
        super(player);
    }

    @Override
    public void strReplace() {
        this.addStrReplaceString("{test_test}", "233");
    }
}
