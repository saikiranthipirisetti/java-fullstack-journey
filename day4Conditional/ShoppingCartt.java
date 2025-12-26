package day4Conditional;
import java.util.Scanner;
public class ShoppingCartt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Count of cart : ");
        int count = sc.nextInt();
        System.out.println("Is delivery is adreess valid ? True or False : ");
        boolean validaddress = sc.nextBoolean();
        if(count>0&&validaddress){
            System.out.println(" Checkout is alowed ");

        }
        else{
            System.out.println(" checkout is not posibble please check the valid address");
        }

    }
}
