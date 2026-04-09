/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ST10437711
 */
public class Student {
    
    //Private fields to store students information.
    private String studentId;
    private String name;
    private int age;
    private String email;
    private String course;

    //Function to set the student's details.
    public Student(String studentId, String name, int age, String email, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    //This will fetch the students ID.
    public String getStudentId() {
        return studentId;
    }

    //Thi will provide a string method representation of the student's details.
    @Override
    public String toString() {
        return "STUDENT ID: " + studentId + "\n" +
               "STUDENT NAME: " + name + "\n" +
               "STUDENT AGE: " + age + "\n" +
               "STUDENT EMAIL: " + email + "\n" +
               "STUDENT COURSE: " + course + "\n";
    }
}