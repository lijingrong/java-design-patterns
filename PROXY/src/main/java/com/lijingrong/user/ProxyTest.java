package com.lijingrong.user;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        UserService userService = getUserService();
        String username = userService.getUsername();
        System.out.println(username);
    }

    private static UserService getUserService(){
        //return new UserServiceImpl();
        //return new UserServiceProxyImpl(new UserServiceImpl());
        return userServiceFactoryByDynamicProxy();
    }

    private static UserService userServiceFactoryByDynamicProxy() {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(new UserServiceImpl());
        return (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class},
                myInvocationHandler);
    }
}
