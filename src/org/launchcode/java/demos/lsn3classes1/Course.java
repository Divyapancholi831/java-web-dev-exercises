package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String topic;
    private String instructor;
    private ArrayList<Student> enrolledStudent;


    public static void main(String[] args) {
        Student divya = new Student();
        divya.setName("divya");
        divya.setStudentId(1);
        divya.setGpa(4.0);

        System.out.println(divya.getName());

    }
}
