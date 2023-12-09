import java.util.Scanner;

public class BankAccount {
    private double balance;

    BankAccount(double input){
        balance= input;
    }
    Scanner scan = new Scanner(System.in);
    public void checkBalance(){
        System.out.println("your balance = "+ balance);
    }
    public void withdraw(){
        System.out.println("enter Amount");
        double amount = scan.nextDouble();
        if(amount > 0 && amount< balance){
            balance -= amount;
            System.out.println("Withdrawal successful. your balance now is "+ balance);
        }
        else{
            System.out.println("you don't have enough balance");
        }
    }
    public void deposit(){
        System.out.println("enter Amount");
        double amount = scan.nextDouble();
        balance += amount;
        System.out.println("Desposit successful. your balance now is "+ balance);
    }
}
