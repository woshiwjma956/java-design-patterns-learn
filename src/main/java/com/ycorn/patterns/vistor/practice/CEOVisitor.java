package com.ycorn.patterns.vistor.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:41
 */

public class CEOVisitor implements Visitor {


    @Override
    public void visit(Engineer engineer) {
        System.out.println("CTO关注" + engineer.getName() + "KPI " + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CTO关注" + manager.getName() + "的KPI和产品数量 " + manager.getProducts() + " " + manager.getProducts());
    }
}
