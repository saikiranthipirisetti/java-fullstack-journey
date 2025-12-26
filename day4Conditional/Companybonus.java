package day4Conditional;
import java.util.Scanner;
public class Companybonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Experience in years : ");
        double experience = sc.nextDouble();
        System.out.println("Enter your rating : ");
        double rating = sc.nextDouble();
        if(experience>=5&&rating>=4){
            System.out.println("U are eligible for bonus.");
        }
        else{
            System.out.println("U are not eligible. ");
        }

    }
}
