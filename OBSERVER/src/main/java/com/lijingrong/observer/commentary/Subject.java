package com.lijingrong.observer.commentary;

/**
 * 观察者模式-主题接口
 */
public interface Subject {

    /**
     * 增加观察者
     *
     * @param observer 新观察者
     */
    void subscribeObserver(Observer observer);

    /**
     * 取消观察者
     *
     * @param observer 取消订阅的观察者
     */
    void unSubscribeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();

    /**
     * 获取主题详情
     *
     * @return 主题详情
     */
    String subjectDetails();
}
