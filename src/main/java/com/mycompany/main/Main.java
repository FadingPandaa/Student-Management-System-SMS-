/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author ST10437711
 */
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        //Loop to keep the application running until the user chooses to exit.
        while (true) {
            displayMenu();
            //Read the user's menu choice.
            String choice = scanner.nextLine();

            //This will perform an action based on the user's choice.
            switch (choice) {
                case "1":
                    captureStudent(system, scanner);
                    break;
                case "2":
                    System.out.print("Enter the student ID to search: ");
                    String searchId = scanner.nextLine();
                    system.searchStudent(searchId);
                    break;
                case "3":
                    System.out.print("Enter the student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    system.deleteStudent(deleteId);
                    break;
                case "4":
                    system.studentReport();
                    break;
                case "5":
                    system.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Enter (1) to launch menu or any other key to exit: ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equals("1")) {
                break; //Exit the loop if the user chooses not to continue.
            }
        }
    }

    //This will displays the main menu of the Student Management System.
    private static void displayMenu() {
        System.out.println("\nSTUDENT MANAGEMENT APPLICATION");
        System.out.println("**************************************");
        System.out.println("(1) Capture a new student.");
        System.out.println("(2) Search for a student.");
        System.out.println("(3) Delete a student.");
        System.out.println("(4) Print student report.");
        System.out.println("(5) Exit Application.");
        System.out.print("Please select one of the menu items: ");
    }

    //This will store the details of a new student and saves the students in the system.
    private static void captureStudent(StudentManagementSystem system, Scanner scanner) {
        System.out.println("\nCAPTURE A NEW STUDENT");
        System.out.println("*************************");

        //Prompt the user to enter student details.
        System.out.print("Enter the student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        //Get and validate the student's age.
        int age = getValidAge(scanner);

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        //Create a new Student object with stored details.
        Student student = new Student(studentId, name, age, email, course);
        //Save the student in the system.
        system.saveStudent(student);
    }

    //Prompts the user to enter a valid age for the student and handle invalid input.
    private static int getValidAge(Scanner scanner) {
        while (true) {
            System.out.print("Enter the student age: ");
            try {
                //Attempt to reviw the entered age as an integer.
                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) { 
                    //Return the age if it is valid (16 or older).
                    return age;
                } else {
                    System.out.println("You have entered an incorrect student age!!! Please re-enter the student age >> ");
                }
                //Handle invalid age input (non-integer values).
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!! Please re-enter the student age >> ");
            }
        }
    }
}