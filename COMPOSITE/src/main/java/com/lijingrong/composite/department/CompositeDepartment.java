package com.lijingrong.composite.department;

import java.util.List;

public class CompositeDepartment implements Department {

    private String name;
    private List<Department> childrenDepartments;

    public CompositeDepartment(String name, List<Department> childrenDepartments) {
        this.name = name;
        this.childrenDepartments = childrenDepartments;
    }

    @Override
    public void printName() {
        System.out.println(name);
        childrenDepartments.forEach(Department::printName);
    }
}
