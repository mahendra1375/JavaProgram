package oops_Pavan.Encapsulation;

public class Account {

    private int accountNumber;       //Variables declared as private to achive Encapuslation
    private String AccountName;      //Variables declared as private to achive Encapuslation
    private double amount;           //Variables declared as private to achive Encapuslation

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
