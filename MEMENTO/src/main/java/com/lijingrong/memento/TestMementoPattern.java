package com.lijingrong.memento;

public class TestMementoPattern {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(1, 2, careTaker);
        originator.setY(6);
        originator.createSavePoint("save1");
        originator.undo();
        System.out.println("State: " + originator);
        originator.setX(10);
        originator.createSavePoint("save2");
        originator.setY(11);
        originator.createSavePoint("save3");
        originator.undo("save2");
        System.out.println("State: " + originator);
    }
}
