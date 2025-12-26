package day7methods.methodstasks;
import java.util.Scanner;
/*
1.Bank Transaction Validation.
Create a parameterized method that accepts account balance and withdrawl amount and decides
 wheather the transaction can proceed.the method should return a meaningful message instead of printing directly.
*/
public class Transaction {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter acc balance: ");
        double a = sc.nextDouble();
        System.out.println("Enter withdrwal amount: ");
        double b = sc.nextDouble();
        bank(a, b);

        
    }
    public static void bank(double accbalance,double withdrwal){
        if(accbalance>=withdrwal){
            accbalance-=withdrwal;
            System.out.println("Transaction Can be possible.");
            System.out.println("Amount withdrawl : "+withdrwal);
            System.out.println("updated acc balance : "+accbalance);

        }
        else{
            System.out.println("Transaction wont be possible. balance is low.");
        }
    }
}
