package com.ycorn.patterns.memento;

import lombok.Getter;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-25 22:52
 */
@Getter
public class Memento {
    public Memento(String state) {
        this.state = state;
    }

    private String state;

}