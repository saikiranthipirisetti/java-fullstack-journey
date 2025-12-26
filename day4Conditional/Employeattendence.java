package day4Conditional;
import java.util.Scanner;
        /*      
2.Emoployee Attendence System
An employe is marked: "(present) if wkinghours more than 8", "(half-day) if orking hours bet4and 8 ",
 "Absent if working hours less than 4" Question: Write a java decision logic to display attendence status
         */
public class Employeattendence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employee : ");
        String name = sc.nextLine();
        System.out.print("Enter Woking hours of Employe : ");
        int wh = sc.nextInt();//working hours
        if(wh>8){
            System.out.println(name+ " attendence marked :  Present ");
        }
        else if(wh>=4&&wh<=8){
            System.out.println(name +" attendence marked : Half day ");

        }
        else{
            System.out.println(name+ " attendence marked : Absent ");
        }



    }
}
