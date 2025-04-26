package cn.glorydark.nukkit.example.command;

import cn.glorydark.nukkit.example.command.sub.ExampleSubCommand;
import gameapi.commands.base.EasyCommand;

/**
 * @author glorydark
 */
public class ExampleCommand extends EasyCommand {

    public ExampleCommand(String name) {
        super(name);
        this.registerCommand(new ExampleSubCommand("test"));
    }
}
