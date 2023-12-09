import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Please enter your PIN number:");
        int pin = scan.nextInt();
        ATM user= new ATM();
        user.menu();
    }
}