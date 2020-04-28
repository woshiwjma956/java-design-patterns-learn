package com.ycorn.patterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/27 15:35
 */
@Setter
@Getter
@ToString
public class PrototypeClass implements Cloneable,Serializable {
    private String name;

    private InnerClass innerClass;

//    @Override
//    protected Object clone() {
//        try {
//            PrototypeClass clone = (PrototypeClass) super.clone();
////            clone.innerClass = (InnerClass) innerClass.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return new PrototypeClass();
//    }


    @Override
    protected Object clone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 写出去
            oos.writeObject(this);
            // 重新写回来
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
