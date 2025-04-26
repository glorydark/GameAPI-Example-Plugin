package cn.glorydark.nukkit.example.form;

import cn.nukkit.Player;
import gameapi.form.AdvancedFormWindowSimple;
import gameapi.form.element.ResponsiveElementButton;

/**
 * @author glorydark
 */
public class FormFactory {

    public static void showMain(Player player) {
        AdvancedFormWindowSimple simple = new AdvancedFormWindowSimple("test");
        simple.addButton(
                new ResponsiveElementButton("test")
                        .onRespond(player1 -> player1.sendMessage("You clicked test!"))
        );
    }
}
