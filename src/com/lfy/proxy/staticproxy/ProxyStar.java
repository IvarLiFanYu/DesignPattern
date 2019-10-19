package com.lfy.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class ProxyStar {

    private Object object;

    public ProxyStar(Object object) {
        this.object = object;
    }

    public Object getStarProxy() {
        /**
         * 1. 指定目标参数使用的类加载器
         * 2. 指定目标参数的接口
         * 3. 指定通过代理执行的目标对象的具体操作
         */
        Object o = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param o
             * @param method
             * @param objects   参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("代理开始...");
                Object invoke = method.invoke(object, objects);
                System.out.println("代理结束...");
                return invoke;
            }
        });
        return o;
    }
}
