package com.ycorn.patterns.proxy.jdk;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:32
 */
public class JDKProxyTest
{
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new ProxyInterface() {
            @Override
            public String action(String name) {
                System.out.println(name);
                return name+"666";
            }
        };
        ProxyFactory proxyFactory = new ProxyFactory(proxyInterface);
        ProxyInterface proxyAction = (ProxyInterface) proxyFactory.getProxy();
        String lao_tie_ = proxyAction.action("lao tie ");
        System.out.println(lao_tie_);
    }

}