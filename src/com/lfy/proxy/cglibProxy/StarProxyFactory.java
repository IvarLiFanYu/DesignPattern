package com.lfy.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class StarProxyFactory implements MethodInterceptor {

    private Object target;

    public StarProxyFactory(Object object) {
        this.target = object;
    }

    public Object getStarInstance() {
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建并返回对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始....");
        Object returnValue = method.invoke(target, args);
        System.out.println("代理结束....");
        return returnValue;
    }
}
