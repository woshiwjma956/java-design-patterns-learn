package com.ycorn.patterns.flyweight;

import sun.java2d.pipe.SpanIterator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/30 10:47
 */

public class FlyweightTest {

    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website newWebSite = websiteFactory.getWebsite("新闻");
        newWebSite.use(new User("z3"));
        newWebSite.use(new User("w5"));
        Website newWebSite2 = websiteFactory.getWebsite("新闻");
        newWebSite2.use(new User("l4"));

        Website peWebsite = websiteFactory.getWebsite("体育");
        peWebsite.use(new User("z3"));
        peWebsite.use(new User("w6"));

        System.out.println(websiteFactory.getWebsiteCount());
    }
}
