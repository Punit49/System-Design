import enums.AccountType;
import model.BankAccount;

public class Main {
    public static void main(String[] args) {
        // Student s1 = new Student(Grade.A);
        // Student s2 = new Student(Grade.C);
        // Student s3 = new Student(Grade.D);
        // System.out.println(s3.getGrade());

        BankAccount b1 = new BankAccount(250, AccountType.SAVINGS);
        BankAccount b2 = new BankAccount(300, AccountType.CURRENT);
        BankAccount b3 = new BankAccount(950, AccountType.SAVINGS);
        BankAccount b4 = new BankAccount(1050, AccountType.CURRENT);

        try {
            b2.deposit(40);
            b3.withdraw(880);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(b2.getBalance());
        System.out.println(b3.getBalance());
    }
}
