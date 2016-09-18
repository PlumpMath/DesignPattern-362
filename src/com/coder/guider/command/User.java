package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class User {

    private Command startCommand;
    private Command stopCommand;
    private Command pauseCommand;
    private Command resumeComand;

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setPauseCommand(Command pauseCommand) {
        this.pauseCommand = pauseCommand;
    }

    public void setResumeComand(Command resumeComand) {
        this.resumeComand = resumeComand;
    }

    public void start() {
        startCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

    public void pause() {
        pauseCommand.execute();
    }

    public void resume() {
        resumeComand.execute();
    }
}
