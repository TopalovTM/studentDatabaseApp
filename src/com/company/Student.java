package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
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

        System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear + " " + this.studentID);

    }

    //generate an ID
    private void setStudentId(){
        id++;
        this.studentID = this.gradeYear + "" + id;
    }

    //enroll in courses

    //view balance

    //pay tuition

    //Show information

}
