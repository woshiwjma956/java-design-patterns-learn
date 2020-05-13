package com.ycorn.patterns.iterator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:36
 */

public class IteratorTest {

    public static void main(String[] args) {
        ComputeCollageAggregate computeCollageAggregate = new ComputeCollageAggregate();
        computeCollageAggregate.add(new Dept("新加的计算机部门"));
        ComputerCollageIterator computeIterator = computeCollageAggregate.createIterator();
        System.out.println("初始元素"+computeCollageAggregate.getDepts());
        System.out.println("删除之前集合数量: "+computeIterator.getSize());
        while (computeIterator.hasNext()){
            Dept next = computeIterator.next();
            if(next.getName().equals("计算机系部门3")){
                System.out.println("删除一个元素");
                computeIterator.remove();
            }else{
                System.out.println(next);
            }
        }
        System.out.println("删除之后集合数量: "+computeIterator.getSize());
        System.out.println("删除之后集合"+computeCollageAggregate.getDepts());


        System.out.println("===========================================");
        MathCollageAggregate mathCollageAggregate = new MathCollageAggregate();
        mathCollageAggregate.add(new Dept("新加的数学部门"));
        MathCollageIterator mathIterator = mathCollageAggregate.createIterator();
        System.out.println("初始元素大小"+mathIterator.getSize());
        System.out.println("初始元素"+mathIterator.getDeptsStr());
        while (mathIterator.hasNext()){
            Dept next = mathIterator.next();
            if("数学系部门3".equals(next.getName())){
                mathIterator.remove();
            }else{
                System.out.println(next);
            }
        }
        System.out.println(" 删除元素大小"+mathIterator.getSize());
        System.out.println("删除元素"+mathIterator.getDeptsStr());
    }
}
