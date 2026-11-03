import enums.AccountType;
import model.BankAccount;

import model.Student;
import enums.StudentGrade;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(500, AccountType.SAVINGS);
        BankAccount a2 = new BankAccount(1000, AccountType.CURRENT);
        BankAccount a3 = new BankAccount(1500, AccountType.SAVINGS);

        System.out.println(a1.getBalance());
        // a1.balance = 90; wont work

        System.out.println(a1.getAccountNumber()); // 1
        System.out.println(a2.getAccountNumber()); // 2
        System.out.println(a3.getAccountNumber()); // 3

        // a2.deposit(-250); // wont work
        // a3.withDraw(1800); // wont work
        // a3.withDraw(1500); // wont work

        a3.withDraw(1400);
        System.out.println(a3.getBalance());

        // ? Student - 
        Student s1 = new Student(StudentGrade.A);
        Student s2 = new Student(StudentGrade.C);
        // System.out.println(s2.getRollNumberCounter()); // 2
        Student s3 = new Student(StudentGrade.F);

        System.out.println(s1.getGrade());
        System.out.println(s2.getGrade());
        System.out.println(s3.getGrade());

        System.out.println(s3.getRollNumber());

        // System.out.println(s3.getTotalStudents());

        
    }
}
