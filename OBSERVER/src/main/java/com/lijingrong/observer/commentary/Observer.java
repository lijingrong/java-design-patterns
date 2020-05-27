package com.lijingrong.observer.commentary;

/**
 * 观察者模式-观察者接口
 */
public interface Observer {

    /***
     * 订阅
     */
    void subscribe();

    /**
     * 取消订阅
     */
    void unSubscribe();

    /**
     * 当主题变化时，观察者更新信息方法
     * @param desc 描述
     */
    void update(String desc);

}
