package com.yida.test2.temp.d1;

public class SingletonTest {
    private volatile  static SingletonTest singleton;

    private SingletonTest(){}
    
    public static SingletonTest getInstance(){
        if (singleton == null){
            synchronized(SingletonTest.class){
                if(singleton == null){
                    singleton = new SingletonTest();
                }
            }
        }
        return singleton;
    }
}