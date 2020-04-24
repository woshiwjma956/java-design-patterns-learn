package com.ycorn.patterns.factory.abstractfacotry;

import com.ycorn.patterns.factory.Pizza;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 17:58
 */

public interface AbstractFactory {

    Pizza createPizza(String type);

}
