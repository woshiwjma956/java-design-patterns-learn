package com.ycorn.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-17 21:21
 */
public class University extends OrgComponent {

    List<OrgComponent> collage = new ArrayList<OrgComponent>();

    @Override
    public void add(OrgComponent orgComponent) {
        collage.add(orgComponent);
    }

    @Override
    public void remove(OrgComponent orgComponent) {
        collage.remove(orgComponent);
    }

    @Override
    public List<OrgComponent> getChild() {
        this.collage.forEach(System.out::println);
        return this.collage;
    }

    @Override
    public void print() {
        this.collage.forEach(System.out::println);
    }

    public University() {
        super("University", "大学");
    }
}