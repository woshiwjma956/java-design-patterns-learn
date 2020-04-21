package com.ycorn.patterns.singleton;

/**
 * 描述:
 * 静态内部类的优点是：外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。即当SingleTon第一次被加载时，并不需要去加载SingleTonHolder，只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE,第一次调用getInstance()方法会导致虚拟机加载SingleTonHolder类，这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
 *
 * @author JimWu
 * @create 2020-04-21 22:59
 */
public class StaticInnerClassInstanceHolder {

    private StaticInnerClassInstanceHolder() {
    }

    static class InstanceHolder {
        private static StaticInnerClassInstanceHolder INSTANCE = new StaticInnerClassInstanceHolder();
    }

    public static StaticInnerClassInstanceHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public static void main(String[] args) {
        StaticInnerClassInstanceHolder.getInstance();
    }

}