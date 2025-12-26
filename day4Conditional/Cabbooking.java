package day4Conditional;
import java.util.Scanner;
/*
1.online cab booking validation
A cab can be booked only if the drive is avalible, the user locaton is serviceable, and payment mode is selected.
question:frame he desion making logic in java
 */
public class Cabbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("      Avalible Location: 1.Jalandhar(jld), 2.Phagwara(pwg)  ");

        System.out.print("Select ur Preferred location according to city code  1 or 2 :  ");

        int locationselection = sc.nextInt();
        System.out.println("     Avalible drivers : Raj(123),Ram(143),Rahul(144)     ");
        System.out.print("Select ur driver code : ");
        int driverpreference = sc.nextInt();
        System.out.print("Select ur Preferred payment method : 1.cash, 2.Online  : ");
        int paymentmethod = sc.nextInt();

        boolean s1 = locationselection==1||locationselection==2;
        boolean s2 = driverpreference==123||driverpreference==143||driverpreference==144;
        boolean s3 = paymentmethod==1||paymentmethod==2;


        if(s1&&s2&&s3){
            System.out.println("Booking Your cab , Thanku ...");

        }
        else{
            System.out.println("Cab can not be booked");
        }
        sc.close();
    }
    
}
