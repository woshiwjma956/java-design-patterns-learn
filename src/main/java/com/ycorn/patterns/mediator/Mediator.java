package com.ycorn.patterns.mediator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 17:50
 */

public interface Mediator {

    void registry(Colleague colleague);

    void getMessage(Colleague colleague, String msg);

}
