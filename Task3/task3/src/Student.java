import java.util.Scanner;

public class Student {
    Scanner scan= new Scanner(System.in);
    private float totalSum=0f;
    public void run(){
        System.out.println("enter your grade in Math: " );
        totalSum += scan.nextInt();
        System.out.println("enter your grade in English: " );
        totalSum += scan.nextInt();
        System.out.println("enter your grade in Science: " );
        totalSum += scan.nextInt();

        float averagePercentage = averagePercentage(totalSum);

        System.out.println("your total Sum is: "+ totalSum);
        System.out.println("your average Percentage is: "+averagePercentage+"%");
        correspondingGrade(averagePercentage);

    }
    public float averagePercentage(float totalSum){

        return (totalSum/300)*100;

    }
    public void correspondingGrade(float marks){

        if (marks>=90)
            System.out.println("your grad is: A+");
        else if(marks>=96 && marks <=98)
            System.out.println("your grad is: A");
        else if(marks>=93 && marks <=95)
            System.out.println("your grad is: A-");
        else if(marks>=90 && marks <=92)
            System.out.println("your grad is: B+");
        else if(marks>=87 && marks <=89)
            System.out.println("your grad is: B");
        else if(marks>=84 && marks <=86)
            System.out.println("your grad is: B-");
        else if(marks>=81 && marks <=83)
            System.out.println("your grad is: C+");
        else if(marks>=78 && marks <=80)
            System.out.println("your grad is: C");
        else
            System.out.println("your grad is: Fail");
    }


}
