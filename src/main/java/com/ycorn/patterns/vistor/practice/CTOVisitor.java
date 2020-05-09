package com.ycorn.patterns.vistor.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:43
 */

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("CTO关注" + engineer.getName() + "的代码量" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CTO关注" + manager.getName() + "的产品数" + manager.getProducts());
    }
}
