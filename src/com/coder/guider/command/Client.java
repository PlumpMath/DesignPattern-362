package com.coder.guider.command;

/**
 * Created by apple on 16/9/18.
 */
public class Client {
    public static void main(String[] args) {


        Player player = new Player();
        Command startCommand = new startCommand(player);
        Command stopCommand = new stopCommand(player);
        Command pauseCommand = new pauseCommand(player);
        Command resumeConmmand = new pauseCommand(player);


        User user = new User();
        user.setPauseCommand(pauseCommand);
        user.setResumeComand(resumeConmmand);
        user.setStartCommand(startCommand);
        user.setStopCommand(stopCommand);

        user.start();
        user.stop();
        user.resume();
        user.resume();
    }

}
