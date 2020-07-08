package com.lijingrong.memento;

public class Originator {

    private double x;
    private double y;
    private String lastUndoSavePoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavePoint("initial");
    }

    public void createSavePoint(String savePointName) {
        careTaker.saveMemento(savePointName, new Memento(this.x, this.y));
        this.lastUndoSavePoint = savePointName;
    }

    private void setOriginatorState(String savePointName){
        Memento memento = careTaker.getMemento(savePointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void undo(){
        setOriginatorState(lastUndoSavePoint);
    }

    public void undo(String savePointName){
        setOriginatorState(savePointName);
    }

    public void undoAll(){
        setOriginatorState("initial");
        careTaker.clearSavePoints();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
