package com.ycorn.patterns.memento;

import lombok.Data;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-25 22:52
 */
@Data
public class Original {

    private String state;

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void rollback(Memento memento) {
        this.state = memento.getState();
    }
}