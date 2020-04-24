package com.ycorn.patterns.factory.abstractfacotry;

import com.ycorn.patterns.factory.Pizza;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 17:59
 */

public class BJPizzaFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String type) {
      if("meat".equals(type)){
          return new CQMeatPizza();
      }else if("fruit".equals(type)){
          return new CQFruitPizza();
      }
      return null;
    }
}
