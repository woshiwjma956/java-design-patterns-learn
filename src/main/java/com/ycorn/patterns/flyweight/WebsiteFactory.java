package com.ycorn.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/30 10:45
 */

public class WebsiteFactory {

    private Map<String, Website> pool = new HashMap<>();

    public Website getWebsite(String type) {
        if (pool.containsKey(type)) {
            return pool.get(type);
        } else {
            ConcreteWebsite concreteWebsite = new ConcreteWebsite(type);
            pool.put(type, concreteWebsite);
            return concreteWebsite;
        }
    }

    public int getWebsiteCount(){
        return pool.size();
    }
}
