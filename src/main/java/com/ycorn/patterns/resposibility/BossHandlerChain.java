package com.ycorn.patterns.resposibility;

/**
 * 描述:
 * 总经理审批5000以上
 *
 * @author JimWu
 * @create 2020-04-28 22:31
 */
public class BossHandlerChain extends HandlerChain {

    public BossHandlerChain(String handlerName) {
        super(handlerName);
    }

    @Override
    public void handler(ApplyRequest request) {
        if (request.getMoney() < 5000) {
            nextChain.handler(request);
        } else {
            System.out.println(request.getApplier() + "提交的申请被" + this.handlerName + "审批");
        }
    }
}