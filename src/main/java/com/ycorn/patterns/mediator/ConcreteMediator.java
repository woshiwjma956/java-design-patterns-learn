package com.ycorn.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 17:52
 */

public class ConcreteMediator implements Mediator {
    List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }

    @Override
    public void registry(Colleague colleague) {
        if (!colleagueList.contains(colleague))
            colleagueList.add(colleague);
    }

    @Override
    public void getMessage(Colleague colleague, String msg) {
        System.out.println("接受到" + colleague.getName() + "的信息" + msg);
        System.out.println(" 下面执行处理具体逻辑 xxx");
    }
}
