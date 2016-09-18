package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class pauseCommand implements Command {

    Player player;

    public pauseCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
