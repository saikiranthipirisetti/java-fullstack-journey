package day4Conditional;
import java.util.Scanner;
public class Bankaccountcheck {
    /* 3.Bank Account Status Check
An accountis:
"Active " if balance morethan or equals minimum balance
"low balance" if lance less than min balance
"frozen" ifthe account is flagged
question:write decision making logic to determine acc status. */
        public static void main(String[] args) {
            int minimum_balance = 1000;
            System.out.print("Enter Account balance : ");
            Scanner sc = new Scanner(System.in);
            int balance = sc.nextInt();
            System.out.println("Is account Flagged : true Or false : ");
            boolean status = sc.nextBoolean();
            System.out.print("The status of account is : ");
            if(!status){
            if(balance>=minimum_balance){
                System.out.println("Account is Active ");
            }
            else{
                System.out.println("Account is having low balance .");
            }}
            else{
                System.out.println(" Account is Frozen ");
            }
            
        }
}
