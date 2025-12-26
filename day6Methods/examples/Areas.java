package day6Methods.examples;
import java.util.Scanner;
//Finding the areas by giving choices and after evry iteration u need to ask the evry time he wants to continur again or not.

public class Areas {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    int choice =0;
   // String s = "yes";
    int n = 1;
  
    while(n==1){
    System.out.println("Enter ur choice what u want to perform \n1.Rectangle \n2.Square \n3.Circle ");
     choice= sc.nextInt();

   switch (choice) {
        case 1:
            Rectangle();
            break;
        case 2:
            Square();
            break;
        case 3:
            Circle();
            break;
        
        default:
            System.out.println(" Enter Valid number.");
            
    }
    System.out.println("Do u want to continue or not ? 1 or 0 : ");
    
    n = sc.nextInt();

}
    
}

public static void Rectangle(){
    System.out.println("Enter length of rectagle : ");
    double a = sc.nextDouble();
    System.out.println("Enter the bredth of rectangle : ");
    double b = sc.nextDouble();
    double area = a*b;
    System.out.println("Area of Rectangle = "+area);

}
public static void Square(){
    System.out.println("Enter the side of square : ");
    double a = sc.nextDouble(); 
    double area = a*a;
    System.out.println("Area of Square = "+area);
}

public static void Circle(){
    System.out.println("Enter the radius of circle : ");
    double r = sc.nextDouble();    
    double area = 3.14*r*r;
    System.out.println("Area of Triangle = "+area);
}

    
}
