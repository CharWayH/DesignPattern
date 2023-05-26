package com.charwayh.proxy.dynamicproxy;

import com.charwayh.proxy.staticproxy.IRentHouse;
import com.charwayh.proxy.staticproxy.RentHouseImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.proxy.dynamicproxy
 * @date:2023/5/26 JDK动态代理
 * 需要实现被代理对象相同的接口
 */
public class JdkProxy {
    public static void main(String[] args) {
        // 被代理对象(委托对象)
        final RentHouseImpl rentHouse = new RentHouseImpl();

        // 获取代理对象
        IRentHouse proxyInstance = (IRentHouse) Proxy.newProxyInstance(rentHouse.getClass().getClassLoader(), rentHouse.getClass().getInterfaces(), new InvocationHandler() {
            // 增强的横切逻辑
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                System.out.println("找中介，让中介帮忙租房子...");
                // 调用原有业务逻辑
                result = method.invoke(rentHouse, args);
                System.out.println("租到了房子...");
                return result;
            }
        });
        proxyInstance.rentHouse();
    }
}
