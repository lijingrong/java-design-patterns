package com.lijingrong.composite.department;

import com.sun.tools.javac.util.List;

public class Main {

    public static void main(String[] args) {
        Department dev1 = new SimpleDepartment("研发一部");
        Department dev2 = new SimpleDepartment("研发二部");
        Department devDepartment = new CompositeDepartment("研发部", List.of(dev1, dev2));
        devDepartment.printName();
    }
}
