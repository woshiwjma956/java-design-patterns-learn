package com.ycorn.patterns.command;


/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 16:50
 */

public class CommandTest {

    public static void main(String[] args) {
        // 先创建接受者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建命令 聚合就饿守着
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 创建Invoker 命令执行者
        RemoteInvoker remoteInvoker = new RemoteInvoker();
        // 设置命令
        remoteInvoker.setCommand(0, true, lightOnCommand);
        remoteInvoker.setCommand(0, false, lightOffCommand);

        //调用执行
        remoteInvoker.pressOnButton(0);
        remoteInvoker.pressOffButton(0);
        // 撤销操作
        remoteInvoker.undo();
    }
}
