package com.charwayh.proxy.dynamicproxy;

import com.charwayh.proxy.staticproxy.RentHouseImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.proxy.dynamicproxy
 * @date:2023/5/26
 * cglib 动态代理
 */
public class CglibProxy {
    public static void main(String[] args) {
        final RentHouseImpl rentHouse = new RentHouseImpl();
        RentHouseImpl rentHouseProxy = (RentHouseImpl)Enhancer.create(rentHouse.getClass(), new MethodInterceptor() {

            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                System.out.println("找中介，让中介帮忙租房子...");
                // 调用原有业务逻辑
                result = method.invoke(rentHouse, objects);
                System.out.println("租到了房子...");
                return result;
            }
        });
        rentHouseProxy.rentHouse();

    }
}
