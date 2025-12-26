package day7methods.methodstasks;
import java.util.Scanner;

public class OnlineShopping {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Purchase Amount : ");
        double a = sc.nextDouble();
        System.out.println(" customer type : Regular / Premium :");
        System.out.print("Enter 'r' or 'p' : ");
        char c = sc.next().charAt(0);
        Discount(a, c);


    }
    public static void Discount(double a, char c){
        if(c == 'p'){
            System.out.println("Premium customer, 10% discount is applicable");
            System.out.println("Final amount : "+(a-a/10));

        }
        else if(c=='r'){
            System.out.println("Regular Customer no discount .");
             System.out.println("Final amount : "+a);
        }
        else
        {
            System.out.println("Invalid customer type.");
        }

    }
}
