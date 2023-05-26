package com.charwayh.proxy.dynamicproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: create by CharwayH
 * @description: com.lagou.edu.test
 * @date:2022/3/6
 */
public class ProxyFactory {
    private ProxyFactory() {
    }

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    /**
     * JDK动态代理
     */
    public Object getJDKProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    // 开启事务
//                    TransactionManager.getInstance().beginTransaction();

                    result = method.invoke(proxy, args);

                    // 提交事务
//                    TransactionManager.getInstance().commit();
                } catch (Exception e) {
                    //事务回滚
//                    TransactionManager.getInstance().rollback();
                    // 抛出异常便于上层servlet捕获
                    throw e;
                }
                return result;
            }
        });
    }

    /**
     * cglib动态代理
     */
    public Object getCglibProxy(Object obj){
        return Enhancer.create(obj.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                try {
                    // 开启事务
//                    TransactionManager.getInstance().beginTransaction();
                    result = method.invoke(o, objects);
                    // 提交事务
//                    TransactionManager.getInstance().commit();
                } catch (Exception e) {
                    //事务回滚
//                    TransactionManager.getInstance().rollback();
                    // 抛出异常便于上层servlet捕获
                    throw e;
                }
                return result;
            }
        });
    }
}
