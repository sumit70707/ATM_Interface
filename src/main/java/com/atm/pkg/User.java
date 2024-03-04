package src.main.java.com.atm.pkg;

public class User {
    private String userId;
    private String userPIN;
    private  double accountBalance;

    public User(String userId,String userPIN,double accountBalance) {
        this.userId = userId;
        this.userPIN=userPIN;
        this.accountBalance=accountBalance;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPIN() {
        return userPIN;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
