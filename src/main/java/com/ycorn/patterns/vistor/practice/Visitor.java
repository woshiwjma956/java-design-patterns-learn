package com.ycorn.patterns.vistor.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:30
 */

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
