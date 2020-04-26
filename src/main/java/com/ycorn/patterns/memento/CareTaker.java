package com.ycorn.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-25 22:55
 */
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento){
        this.mementos.add(memento);
    }

    public Memento get(int index){
        return this.mementos.get(index);
    }

}