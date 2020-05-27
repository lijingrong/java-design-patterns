package com.lijingrong.observer.commentary;

import java.util.ArrayList;

public class TestObserver {

    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<>(), "足球比赛");
        Observer o1 = new SMSUsers(subject, "张三");
        o1.subscribe();
        Observer o2 = new SMSUsers(subject, "李四");
        o2.subscribe();
        Commentary commentary = (Commentary) subject;
        commentary.setDesc("比分 3:0");
        o2.unSubscribe();
        commentary.setDesc("上半场比分 3:1");

        Observer o3 = new SMSUsers(subject, "王五");
        o3.subscribe();
        commentary.setDesc("全场比分 3:2");
    }
}
