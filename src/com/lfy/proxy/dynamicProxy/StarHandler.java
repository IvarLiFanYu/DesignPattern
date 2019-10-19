package com.lfy.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    private RealStar realStar;

    public StarHandler(RealStar realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
       // Object object = null;
        //if(method.equals("sing")){
        method.invoke(realStar,objects);
        //}
        return null;
       // return object;
    }
}
