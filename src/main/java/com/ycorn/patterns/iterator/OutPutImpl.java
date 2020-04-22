package com.ycorn.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 * 使用迭代模式屏蔽了不同数据结构遍历方式不同的问题,将数据的存在和数据的遍历解耦
 * @author JimWu
 * @create 2020-04-22 22:39
 */
public class OutPutImpl {

    List<Collage> collages;

    public OutPutImpl(List<Collage> collages) {
        this.collages = collages;
    }

    public void printCollage(){
        collages.forEach(c-> {
            System.out.println("==============="+c+"==================");
            printDept(c.createIterator());
        });
    }

    public void printDept(Iterator<Dept> deptIterator){
        while (deptIterator.hasNext()){
            System.out.println(deptIterator.next());
        }
    }

    public static void main(String[] args) {
        List<Collage> collages = new ArrayList<>();
        collages.add(new ComputerCollageAgg());
        collages.add(new MathCollageAgg());
        OutPutImpl outPut = new OutPutImpl(collages);
        outPut.printCollage();
    }
}