package com.ycorn.patterns.resposibility;

/**
 * 描述: 财务总监审批1000-5000
 *
 * @author JimWu
 * @create 2020-04-28 22:30
 */
public class CFOHandlerChain extends HandlerChain {

    public CFOHandlerChain(String handlerName) {
        super(handlerName);
    }

    @Override
    public void handler(ApplyRequest request) {
        if (request.getMoney() > 1000f && request.getMoney() <= 5000) {
            System.out.println(request.getApplier() + "提交的申请被" + this.handlerName + "处理");
        } else {
            System.out.println("金额大于5000提交总经理审批");
            nextChain.handler(request);
        }
    }
}