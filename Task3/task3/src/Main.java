import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();

        Student student= new Student();
        student.run();

    }
}