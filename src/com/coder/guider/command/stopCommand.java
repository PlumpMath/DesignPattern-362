package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class stopCommand implements Command {

    Player player;

    public stopCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
