package day4Conditional.switchcasebased;
import java.net.Socket;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account number : ");
        long accnum = sc.nextLong();
        System.out.println("Enter Account balance : ");
        double accbalance = sc.nextDouble();
        System.out.println("user selects:\r\n" + //
                        "1-withdraw\r\n" + //
                        "2-Desposit\r\n" + //
                        "3-Balance Enquiry\r\n" + //
                        "4-Exit\r\n" + //
                        "");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Withdrwal in process: ");
                System.out.println("Enter withdrwal amount > 0 : " );
                double wamount = sc.nextDouble();
                if(wamount<=accbalance&&wamount>0){
                System.out.println("Sucessfully withdrawn "+wamount + ". Remaining Balance = " +(accbalance-wamount) );
                accbalance= accbalance-wamount;
                }
                else if(wamount>accbalance) {System.out.println("Withdraw amount  less than ur balance");}
                else System.out.println("Enter valid amount greater than 0 .");
                break;
            case 2:
                System.out.println("Depositing in process: ");
                System.out.println("Enter Deposit amount > 0 : " );
    
                double damount = sc.nextDouble();
                if(damount>0){
                    accbalance=accbalance+damount;
                    System.out.println("Sucessfully Diposited "+damount + ". updated Balance = " +accbalance );
                }
                else System.out.println("Try to deposit more than 0");
                break;
            case 3:
                System.out.println("Balance : "+accbalance);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Thank u for using Sai bank..");

        }
        sc.close();

    }
    
}
