package day4Conditional;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the no of items : ");
        int items = sc.nextInt();
        int cost = items*100;
        if(cost>1000){
            int final_cost = cost - cost/10;
            System.out.println("U got discount of " +(cost/10) + "rupees");
            System.out.println("Final cost of items = "+final_cost);
        }
        else{
            System.out.println("U dont Avail any discount discount will be given to above 1000 ");
            System.out.println("Total bill = "+cost);
        }
        sc.close();
    }
}
