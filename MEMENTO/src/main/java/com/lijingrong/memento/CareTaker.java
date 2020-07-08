package com.lijingrong.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private final Map<String, Memento> savePointStorage = new HashMap<>();

    public void saveMemento(String savePointName, Memento memento) {
        System.out.println("Save state..." + savePointName);
        savePointStorage.put(savePointName, memento);
    }

    public Memento getMemento(String savePointName) {
        System.out.println("Undo at..." + savePointName);
        return savePointStorage.get(savePointName);
    }

    public void clearSavePoints(){
        System.out.println("Clearing all save points...");
        savePointStorage.clear();
    }


}
