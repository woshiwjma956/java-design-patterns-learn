package com.ycorn.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-17 21:23
 */
public class Collage extends OrgComponent {

    List<OrgComponent> dept = new ArrayList<OrgComponent>();

    @Override
    public void add(OrgComponent orgComponent) {
        dept.add(orgComponent);
    }

    @Override
    public void remove(OrgComponent orgComponent) {
        dept.remove(orgComponent);
    }

    @Override
    public List<OrgComponent> getChild() {
        this.dept.forEach(System.out::println);
        return this.dept;
    }

    public Collage(String name, String desp) {
        super(name,desp);

    }

    @Override
    public void print() {
        this.dept.forEach(System.out::println);
    }
}