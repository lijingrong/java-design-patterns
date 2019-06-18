package com.lijingrong.composite.department;

public class SimpleDepartment implements Department {

    private String name;

    public SimpleDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }
}
