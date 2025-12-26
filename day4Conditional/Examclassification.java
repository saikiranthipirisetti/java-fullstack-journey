package day4Conditional;
import java.util.Scanner;
public class Examclassification {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks : ");
    double marks = sc.nextDouble();
    System.out.print("Result :");

    if(marks>=40){
        if(marks>=80){
            System.out.println("passed , Garde A");

        }
        else if(marks>=60&&marks<=79){
            System.out.println("passed , Garde B");

        }
        else{
            System.out.println("passed ");
        }

    }
    else{
        System.out.println(" Failed ");

    }
}
}
