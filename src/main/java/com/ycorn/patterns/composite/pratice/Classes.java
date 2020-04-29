package com.ycorn.patterns.composite.pratice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 15:20
 */

public class Classes extends Component {

    List<Component> classmates = new ArrayList<>();

    public Classes(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        classmates.add(component);
    }

    @Override
    public void remove(Component component) {
        classmates.remove(component);
    }

    @Override
    public List<Component> children() {
        return classmates;
    }

    @Override
    void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (Component c : classmates) {
            c.print();
        }
    }
}
