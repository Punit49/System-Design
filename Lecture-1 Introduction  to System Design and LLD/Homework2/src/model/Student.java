package model;

import enums.Grade;

public class Student {
    private static int totalStudents = 0; 
    private static int rollNumberCounter = 0;
    private final int rollNumber;
    private Grade grade; 

    public Student(Grade grade){
        totalStudents++;
        rollNumberCounter++;
        this.rollNumber = rollNumberCounter;
        this.grade = grade;
    }

    public int getTotalStudents(){
        return totalStudents;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public Grade getGrade(){
        return this.grade;
    }
}
