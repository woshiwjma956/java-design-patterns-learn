package com.ycorn.patterns.resposibility;

/**
 * 描述: 部门经理审批
 *
 * @author JimWu
 * @create 2020-04-28 22:26
 */
public class DeptManagerHandlerChain extends HandlerChain {

    public DeptManagerHandlerChain(String handlerName) {
        super(handlerName);
    }

    @Override
    public void handler(ApplyRequest request) {
        if (request.getMoney() <= 1000f) {
            System.out.println(request.getApplier() + "提交的申请被" + this.handlerName + "处理");
        } else {
            System.out.println("金额大于1000提交财务总监审批");
            nextChain.handler(request);
        }

    }
}