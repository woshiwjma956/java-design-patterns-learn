package com.ycorn.patterns.singleton;

/**
 * 枚举单例 枚举在java中与普通类一样，都能拥有字段与方法，而且枚举实例创建是线程安全的，在任何情况下，它都是一个单例
 */
public enum EnumSingleTone {


    INSTANCE;

    private String sayHello(String name){
        return "hello" +name;
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleTone.INSTANCE.sayHello("world"));
    }
}
