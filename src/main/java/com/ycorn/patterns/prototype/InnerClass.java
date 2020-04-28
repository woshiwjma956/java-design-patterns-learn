package com.ycorn.patterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/27 15:34
 */

@Setter
@Getter
@ToString
public class InnerClass implements Cloneable, Serializable {

    private String innerName;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new InnerClass();
    }
}
