package com.ycorn.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 描述: 组合模式
 *
 * @author JimWu
 * @create 2020-04-17 21:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrgComponent {

    public void add(OrgComponent orgComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(OrgComponent orgComponent){
        throw new UnsupportedOperationException();
    }

    public List<OrgComponent> getChild(){
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    private String name;

    private String desp;

}