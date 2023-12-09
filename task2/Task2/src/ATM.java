import java.util.Scanner;

public class ATM extends BankAccount{
    ATM() {
        super(1000);

    }
    public void menu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("1: check balance");
        System.out.println("2: withdraw money");
        System.out.println("3: deposit money");
        System.out.println("4: Exit");
        System.out.println("Please enter number: ");
        int type = scan.nextInt();
        if(type == 1){
            checkBalance();
        }
        else if(type == 2){
            withdraw();
        }
        else if(type == 3){
            deposit();
        }
        else if(type == 4){
            System.out.println("Thank You");
        }
        else{
                System.out.println("Please enter valid number");
                menu();
            }
        }

    }
