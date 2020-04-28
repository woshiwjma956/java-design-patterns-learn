package com.ycorn.patterns.resposibility;

/**
 * 描述: 职责连
 *
 * @author JimWu
 * @create 2020-04-28 22:24
 */
public abstract class HandlerChain {

     HandlerChain nextChain;//下一个职责链

    String handlerName;// 处理人

    public HandlerChain(String handlerName) {
        this.handlerName = handlerName;
    }

    public void setNextChain(HandlerChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void handler(ApplyRequest request);

}