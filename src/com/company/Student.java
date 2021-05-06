package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private List<String> courses = new ArrayList<>();
    private int tuitionBalance = 0;
    private static int costToEnroll = 600;
    private static int id = 1000;



    // constructor to enter the name and the year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class level ");
        this.gradeYear = in.nextInt();

        setStudentId();
    }

    //generate an ID
    private void setStudentId(){
        id++;
        this.studentID = this.gradeYear + "" + id;
    }

    //enroll in courses
    public void enroll(){
        // Get inside a loop. user hits 0
        while(true){
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses.add(course);
                tuitionBalance += costToEnroll;
            }
            else{break;}
        }
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: " + tuitionBalance);
    }

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        boolean isValid = true;
        int payment = in.nextInt();
        while(isValid){
            if (payment > tuitionBalance || payment < 0){
                System.out.println("Please enter a valid amount!");
                payment = in.nextInt();
            }
            else{
                isValid = false;
            }
        }
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    //Show information
    public String showInfo(){
        return "Name: " + this.firstName + " " + this.lastName +
                "\nGrade Level: " + this.gradeYear +
                "\nStudent ID: " + this.studentID +
                "\nCourses Enrolled: " + this.courses +
                "\nBalance: " + this.tuitionBalance;
    }

}
