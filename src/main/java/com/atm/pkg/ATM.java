package src.main.java.com.atm.pkg;

import java.util.HashMap;

public class ATM {
        private HashMap<String, User> users;

        public ATM(HashMap<String, User> users) {
            this.users = users;
        }

        public double checkBalance(String userID) {
            return users.get(userID).getAccountBalance();
        }

        public void withdraw(String userID, double amount) {
            double currentBalance = users.get(userID).getAccountBalance();
            if (currentBalance >= amount) {
                users.get(userID).setAccountBalance(currentBalance - amount);
                System.out.println("Withdrawal successful. Remaining balance: " + users.get(userID).getAccountBalance());
            } else {
                System.out.println("Insufficient funds.");
            }
        }

        public void deposit(String userID, double amount) {
            double currentBalance = users.get(userID).getAccountBalance();
            users.get(userID).setAccountBalance(currentBalance + amount);
            System.out.println("Deposit successful. New balance: " + users.get(userID).getAccountBalance());
        }
    }

