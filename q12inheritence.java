// Parent Class
class BankAccount {

    void deposit() {
        System.out.println("Money Deposited");
    }
}

// Child Class
class SavingsAccount extends BankAccount {

    void deposit() {
        System.out.println("Money Deposited with Interest.");
    }
}

// Child Class
class CheckingAccount extends BankAccount {

    void deposit() {
        System.out.println("Money Deposited in Checking Account.");
    }
}

public class q12inheritence {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        CheckingAccount c = new CheckingAccount();

        s.deposit();
        c.deposit();
    }
}