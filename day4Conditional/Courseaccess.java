package day4Conditional;
import java.util.Scanner;
public class Courseaccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        4.Online Course Access
a course can be accessed if student have subscription or scholarship and if course is havng validity.

        */
       System.out.print("Have u subscribed to course : True or false");
       boolean issubscribed= sc.nextBoolean();
       System.out.println("Have u subscribed to course : True or false ");
       boolean isActive = sc.nextBoolean();

       if(isActive&&issubscribed){
        System.out.println("u can access course .");
       }
       else{
        System.out.println("u dont have acess to course.");

       }
    }
}
