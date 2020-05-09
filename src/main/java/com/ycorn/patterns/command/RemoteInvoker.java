package com.ycorn.patterns.command;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 16:14
 */

public class RemoteInvoker {
    // 打开命令数组
    Command[] onCommands = new Command[5];
    // 关闭命令数组
    Command[] offCommands = new Command[5];
    // 上一个执行命令 用于执行undo
    Command preCommand = new NoCommand();

    // 初始化全部为空命令 避免了非空判断
    public RemoteInvoker() {
        // 初始化
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置命令
     * @param index 命令存在位置 相当于遥控器上面的哪一个按钮
     * @param isOn 是不是开命令
     * @param command 具体哪个命令
     */
    public void setCommand(int index, boolean isOn, Command command) {
        if (isOn) {
            onCommands[index] = command;
        } else {
            offCommands[index] = command;
        }
    }

    /**
     * 按开命令
     * @param index 哪一个命令
     */
    public void pressOffButton(int index) {
        offCommands[index].execute();
        preCommand = offCommands[index];
    }

    /**
     * 按关闭命令
     * @param index
     */
    public void pressOnButton(int index){
        onCommands[index].execute();
        preCommand = onCommands[index];
    }

    /**
     * 取消上一次操作
     */
    public void undo(){
        preCommand.undo();
    }
}
