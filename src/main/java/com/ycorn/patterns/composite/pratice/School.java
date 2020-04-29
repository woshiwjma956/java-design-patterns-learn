package com.ycorn.patterns.composite.pratice;

import com.atguigu.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 15:18
 */

public class School extends Component {
    List<Component> classes = new ArrayList<>();

    public School(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        classes.add(component);
    }

    @Override
    public void remove(Component component) {
        classes.remove(component);
    }

    @Override
    public List<Component> children() {
        return classes;
    }

    @Override
    void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (Component c : classes) {
            c.print();
        }
    }
}
