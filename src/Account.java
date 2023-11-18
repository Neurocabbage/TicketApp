public class Account {
    private Long userAccountID;
    private double balance;

    public Account(Long userAccountID, double balance) {
        this.userAccountID = userAccountID;
        this.balance = balance;
    }

    public Long getUserAccountID() {
        return userAccountID;
    }

    public void setUserAccountID(Long userAccountID) {
        this.userAccountID = userAccountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
