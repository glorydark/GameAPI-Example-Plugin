package cn.glorydark.nukkit.example.command.sub;

import cn.glorydark.nukkit.example.form.FormFactory;
import cn.nukkit.command.CommandSender;
import gameapi.commands.base.EasySubCommand;

/**
 * @author glorydark
 */
public class ExampleSubCommand extends EasySubCommand {

    public ExampleSubCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        FormFactory.showMain(commandSender.asPlayer());
        return false;
    }

    @Override
    public boolean hasPermission(CommandSender commandSender) {
        return commandSender.isPlayer();
    }
}
