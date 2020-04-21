package com.ycorn.patterns.composite;

/**
 * 描述: 组合模式 源码参考HashMap 合适组成树状结构
 *
 * @author JimWu
 * @create 2020-04-17 21:25
 */
public class CompositeTest {

    public static void main(String[] args) {
        OrgComponent university = new University();

        OrgComponent collage = new Collage("c1", "cc1");
        OrgComponent collage2= new Collage("c2", "cc2");
        university.add(collage);
        university.add(collage2);
        university.print();
        System.out.println("================================");
        OrgComponent d1 = new Dept("d1","dept1");
        OrgComponent d2 = new Dept("d2","dept2");
        OrgComponent d3 = new Dept("d3","dept3");

        collage.add(d1);
        collage.add(d2);
        collage2.add(d3);

        System.out.println("================================");

        collage.print();
        collage2.print();
        System.out.println("================================");

        d1.print();

    }

}