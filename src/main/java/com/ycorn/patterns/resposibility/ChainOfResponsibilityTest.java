package com.ycorn.patterns.resposibility;

/**
 * 描述:
 * 职责连测试
 *
 * @author JimWu
 * @create 2020-04-28 22:33
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        ApplyRequest applyRequest = new ApplyRequest(3000, "老王");

        DeptManagerHandlerChain deptManagerHandlerChain = new DeptManagerHandlerChain("部门经理小王");
        CFOHandlerChain cfoHandlerChain = new CFOHandlerChain("财务总监中王");
        BossHandlerChain bossHandlerChain = new BossHandlerChain("总经理大王");

        // 设置责任链环 让责任链串联成一个闭环
        deptManagerHandlerChain.setNextChain(cfoHandlerChain);
        cfoHandlerChain.setNextChain(bossHandlerChain);
        bossHandlerChain.setNextChain(deptManagerHandlerChain);

        deptManagerHandlerChain.handler(applyRequest);
    }

}