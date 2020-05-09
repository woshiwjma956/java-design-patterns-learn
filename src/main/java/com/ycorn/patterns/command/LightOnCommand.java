package com.ycorn.patterns.command;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 16:13
 */

public class LightOnCommand implements Command {

    private final LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
