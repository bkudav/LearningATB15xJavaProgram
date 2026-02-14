package Test_OOPs_Concepts_10_02;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
    BankAccount P1 = new BankAccount(1000);
        System.out.println("Balance is: " +P1.getBalance());
        P1.deposit();
        P1.withdraw();

    }

    static class BankAccount{
        private int balance;


        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }


        public BankAccount() {
            System.out.println("DC!");
        }
        public BankAccount(int balance) {
            this.balance = balance;
        }

        void deposit()
        {
            System.out.println("Amount Deposited is: ");
            Scanner SC = new Scanner(System.in);
            int deposit = SC.nextInt();
            balance = balance + deposit;
            System.out.println("Balance after deposit: " + balance);
        }

        void withdraw()
        {
            System.out.println("Amount Withdrawn is: ");
            Scanner SC = new Scanner(System.in);
            int withdrawn = SC.nextInt();
            if (withdrawn <= balance) {
                balance = balance - withdrawn;
                System.out.println("Balance after withdrawal: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }


    }
}
