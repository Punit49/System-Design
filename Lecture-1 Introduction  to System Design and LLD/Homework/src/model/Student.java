package model;
import enums.StudentGrade;

public class Student {
    private static int rollNumberCounter = 0;
    private static int totalStudents = 0;
    private final int rollNumber;
    private StudentGrade grade;
    
    public Student(StudentGrade grade){
        rollNumberCounter++;
        totalStudents++;
        this.rollNumber = rollNumberCounter;
        this.grade = grade;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public int getRollNumberCounter(){
        return rollNumberCounter;
    }

    public int getTotalStudents(){
        return Student.totalStudents;
    }

    public StudentGrade getGrade(){
        return this.grade;
    }
}
