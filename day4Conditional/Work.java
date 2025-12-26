package day4Conditional;
import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=20&&age<=60){
        System.out.println("Enter your gender M or F");
        char gender = sc.next().charAt(0);
        if(gender=='F'||gender=='f'){
            System.out.println("You are female your work is in urban only. ");
        }
        else if(gender=='m'||gender=='M'){
            if(age>20&&age<40){
                System.out.println("You are boy, You can work anywhere. ");
            }
            else if(age>=40&&age<60){
                System.out.println("You can work in urban areas only.");
            }
            else{
                System.err.println("ERROR");
            }
        }
        else{
            System.out.println("enter valid gender.");
        }
    }
    else{
        System.out.println("Your age is not aplicable for this work.");
    }
       
    }
}