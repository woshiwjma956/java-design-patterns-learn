package com.ycorn.patterns.composite.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 15:25
 */

public class Classmate extends Component {

    public Classmate(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("同学" + this.name);
    }
}
