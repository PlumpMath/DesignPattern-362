package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class startCommand implements Command {
    private Player player;

    public startCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.start();
    }
}
