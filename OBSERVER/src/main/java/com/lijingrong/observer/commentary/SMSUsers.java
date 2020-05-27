package com.lijingrong.observer.commentary;

public class SMSUsers implements Observer {

    private final Subject subject;
    private String desc;
    private final String userInfo;

    public SMSUsers(Subject subject, String userInfo) {
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void subscribe() {
        System.out.println("\n" + userInfo + " 正在订阅 " + subject.subjectDetails() + " ...");
        subject.subscribeObserver(this);
        System.out.println("订阅成功！！！");
    }

    @Override
    public void unSubscribe() {
        System.out.println("\n" + userInfo + " 正在取消订阅 " + subject.subjectDetails() + " ...");
        subject.unSubscribeObserver(this);
        System.out.println("取消订阅成功！！！");
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        System.out.println("[" + userInfo + "] 接收到：" + this.desc);
    }
}
