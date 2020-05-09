package com.ycorn.patterns.vistor.practice;

import java.util.Random;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:31
 */

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 工程师的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
