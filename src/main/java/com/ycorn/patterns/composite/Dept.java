package com.ycorn.patterns.composite;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-17 21:24
 */
public class Dept extends OrgComponent {

    public Dept(String name, String desp) {
        super(name,desp);
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}