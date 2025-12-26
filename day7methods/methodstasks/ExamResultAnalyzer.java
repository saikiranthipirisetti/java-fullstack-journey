package day7methods.methodstasks;
import java.util.Scanner;
public class ExamResultAnalyzer {
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter sem1 cgpa : ");
            double sem1 = sc.nextDouble();
            System.out.println("Enter sem2 cgpa : ");
            double sem2 = sc.nextDouble();
            System.out.println("Enter sem3 cgpa : ");
            double sem3 = sc.nextDouble();
            System.out.println("Enter sem4 cgpa : ");
            double sem4 = sc.nextDouble();
           System.out.println("Grade : "+ grade(sem1,sem2,sem3,sem4));
           Eligibility(grade(sem1, sem2, sem3, sem4));
        
    }

    public static  char grade(double a,double b,double c,double d){
        char result = ' ' ;
        double avg = a+b+c+d/4;
        if(avg>9) result='A';
        else if(avg>8&&avg<=9)  result ='B';
        else if(avg>7&&avg<=8)  result='C';
        else result = 'F';
        return result;
    }
    public static void Eligibility(char c){
        if (c=='A'||c=='B'||c=='c'){
            System.out.println("You are Eligible for placement");
        }
        else System.out.println("You are not Eligible for placement.");
    }
}
