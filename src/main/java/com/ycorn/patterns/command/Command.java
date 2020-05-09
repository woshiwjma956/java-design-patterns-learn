package com.ycorn.patterns.command;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 15:55
 */

public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
