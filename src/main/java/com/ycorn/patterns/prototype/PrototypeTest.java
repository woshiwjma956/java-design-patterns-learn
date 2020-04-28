package com.ycorn.patterns.prototype;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/27 15:18
 */

public class PrototypeTest {

    public static void main(String[] args) {
        PrototypeClass prototypeClass1 = new PrototypeClass();
        prototypeClass1.setName("test");
        InnerClass innerClass = new InnerClass();
        innerClass.setInnerName("innerClass");
        prototypeClass1.setInnerClass(innerClass);
        System.out.println(prototypeClass1.toString() + prototypeClass1.getInnerClass().hashCode());

        PrototypeClass prototypeClass2 = (PrototypeClass) prototypeClass1.clone();
        System.out.println(prototypeClass2.toString() + prototypeClass2.getInnerClass().hashCode());

        PrototypeClass prototypeClass3 = (PrototypeClass) prototypeClass1.clone();
        System.out.println(prototypeClass3.toString() + prototypeClass3.getInnerClass().hashCode());

        PrototypeClass prototypeClass4 = (PrototypeClass) prototypeClass1.clone();
        System.out.println(prototypeClass4.toString() + prototypeClass4.getInnerClass().hashCode());
    }
}
