package com.ycorn.patterns.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:59
 */
public class DataStructure {

    private List<Person> people = new ArrayList<>();

    public void attach(Person person) {
        this.people.add(person);
    }

    public void deattch(Person person) {
        this.people.remove(person);
    }

    public void display(Action action) {
        people.forEach(p -> p.accept(action));
    }

}