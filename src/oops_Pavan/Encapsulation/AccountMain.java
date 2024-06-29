package oops_Pavan.Encapsulation;

public class AccountMain {

public static void main(String [] args){
    Account acc= new Account();

    acc.setAccountNumber(20144);
    System.out.println("Account Number: "+acc.getAccountNumber());

    acc.setAccountName("Mahendra");
    System.out.println("Account Name: "+acc.getAccountName());

    acc.setAmount(600000);
    System.out.println("Amount: "+acc.getAmount());

}
}
