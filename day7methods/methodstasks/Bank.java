package day7methods.methodstasks;
import java.util.Scanner;
public class Bank {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Welocome to union bank of india.");
System.out.println("Enter Your name : ");
String name = sc.nextLine();
System.out.println("Enter your account number : ");
long accNum = sc.nextLong();
System.out.println("Enter account balance : ");
double accBalance = sc.nextDouble();

int i =1;
while(i!=4){
    System.out.println("Menu : \n1)withdraw \n2)deposit \n3)details \n4)Exit ");
    System.out.println("Enter Your choice from menu : ");
    i=sc.nextInt();
    switch (i) {
        case 1: 
            System.out.println("Enter amount u want to withdraw : ");
            double withdrawlAmount = sc.nextDouble();
            if(withdrawl(accBalance, withdrawlAmount)){
                System.out.println("Entering Withdrawal mode : ");
                accBalance = accBalance-withdrawlAmount;
                System.out.println("Amount Successfully withdrwn. updated balance : "+ accBalance);
            }
            else{
                System.out.println("withdrawl is not possible . Please enter valid amount." );
            }   
            break;
        case 2:
            System.out.println("Enter amount u want to Deposit : ");
            double depositAmount = sc.nextDouble();
            if(deposit(accBalance, depositAmount)){
                System.out.println("Entering Deposit mode : ");
                accBalance = accBalance+depositAmount;
                System.out.println("Amount Successfully Deposited . updated balance : "+ accBalance);
            }
    
            else{
                System.out.println("deposit is not possible . Please enter valid amount." );
            }   
            break;
        case 3:
            display(accBalance, accNum, name);
            break;
        case 4:
            System.out.println("Exiting Banking , Thank u...");
            i=4;
            break;
        default:
            System.out.println("Enter correct input ..");
            break;
    }
}
    
}
public static boolean withdrawl(double accBalance,double withdrawlAmount){
    
    return accBalance>0&&accBalance<=withdrawlAmount;
}
public static boolean deposit(double accBalance,double depositAmount){
    
    return depositAmount>0;
}
public static void display(double accBalance,long accNum,String Name)
{
System.out.println("Account Number : "+accNum);
System.out.println("Account owner : "+Name);
System.out.println("Account Balance : "+ accBalance);

}
    
}
