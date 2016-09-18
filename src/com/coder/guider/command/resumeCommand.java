package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class resumeCommand implements Command {
    Player player;

    public resumeCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.resume();
    }
}
