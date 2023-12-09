import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i=0;
        int randomNumber = random.ints(1,101).findFirst().getAsInt() ;
        System.out.println("Enter Number: ");
        int number = scan.nextInt();

            while(i < 5) {
                if (number == randomNumber) {
                    System.out.println("congratulations, You guessed correctly");
                    break;
                } else if (number > randomNumber) {
                    System.out.println("The number you guessed is too high..");
                } else if (number < randomNumber) {
                    System.out.println("The number you guessed is too low..");
                }
                Scanner scan2 = new Scanner(System.in);
                number = scan2.nextInt();
                i++;
                if (i==5){
                    System.out.println("you guessed wrong, if you want to continue write 1 else write 0");
                    Scanner scan3 = new Scanner(System.in);
                    int answer = scan3.nextInt();
                    if (answer == 1) {
                        i = 0;

                    }
                    else
                        System.out.println("The correct number is "+number);
                }
            }
    }
}