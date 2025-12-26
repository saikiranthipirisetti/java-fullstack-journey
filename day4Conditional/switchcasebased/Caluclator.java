package day4Conditional.switchcasebased;
import java.util.Scanner;
public class Caluclator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur choice : 1.Addition 2. Subtraction 3.Multiplication 4.Division : ");
        int c = sc.nextInt();
        System.out.print("Enter num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = sc.nextInt();
        
        switch (c) {
            case 1:
                
                System.out.println("Addition Result : "+n1+n2);
                break;
            case 2:
                
                System.out.println("Subtraction Result : "+(n1-n2));
                break;
            case 3:
                
                System.out.println("Multiplication Result : "+(n1*n2));
                break;
            case 4:
                if(n2>0){
                System.out.println("Division Result : "+(n1/n2));}
                else{
                    System.out.println("Division is not possible because n2 is negative or zero.");
                }
                break;
            
        
            default:
                System.out.println("Please select correct caluclator option ");
                break;
        }
        
    }
    
}
