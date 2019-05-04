package com.example.ismai.firebasetutorial;

public class Student {

    String id;
    String name, department;


    public Student(){

    }

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
