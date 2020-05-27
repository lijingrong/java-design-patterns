package com.lijingrong.observer.commentary;

import java.util.List;

public class CommentaryObject implements Commentary, Subject {

    private final List<Observer> observers;
    private String desc;
    private final String subjectDetails;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDesc(String desc) {
        System.out.println("\n赛事比分发生变化");
        this.desc = desc;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return this.subjectDetails;
    }
}
