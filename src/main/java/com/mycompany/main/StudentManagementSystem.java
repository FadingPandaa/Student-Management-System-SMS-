/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ST10437711
 */
public class StudentManagementSystem {
    
    //List to store student objects.
    private List<Student> students;

    //Function to set the student list.
    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    //This will save the students details.
    public void saveStudent(Student student) {
        students.add(student);
        System.out.println("Student details have been successfully saved!");
    }

    //This will search for the students using their ID.
    public void searchStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println(student);
                return;
            }
        }
        //If the student was not found this message will display.
        System.out.println("Student with Student ID: " + studentId + " was not found!");
    }

    //This will delete the student from the system using their ID.
    public void deleteStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                Scanner scanner = new Scanner(System.in);
                
                //Asking for confirmation before deleting the student.
                System.out.print("Are you sure you want to delete student " + studentId + " from the system? Yes (y) to delete: ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("y")) {
                    
                    //If confirmed, remove the student from the list.
                    students.remove(student);
                    System.out.println("Student with Student ID: " + studentId + " WAS deleted!");
                }
                return;
            }
        }
        //If student ID was not found, display this message.
        System.out.println("Student with Student ID: " + studentId + " was not found!");
    }

    //A report of all students in the system.
    public void studentReport() {
        if (students.isEmpty()) {
            //If students are not avaliabe, display this message.
            System.out.println("No students available to report.");
        } else {
             //Loop through the list of students and print details of each student.
            for (int i = 0; i < students.size(); i++) {
                System.out.println("STUDENT " + (i + 1));
                System.out.println(students.get(i));
                System.out.println("------------------------------");
            }
        }
    }
    //This will exit the application.
    public void exitStudentApplication() {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }
}