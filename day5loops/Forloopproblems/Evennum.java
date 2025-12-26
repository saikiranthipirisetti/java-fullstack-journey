package day5loops.Forloopproblems;
import java.util.Scanner;
public class Evennum {
    public static void main(String[] args) {
        //wap to print the even numbers between 60 and 70?
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();
        System.out.print("even numbers between "+ n1 + " and "+ n2 +" are : ");
        for(int i=n1;i<=n2;i++){
            if(i%2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int evensum=0,oddsum=0;

        for(int i =n1;i<=n2; i++){
            if(i%2==0){
                evensum+=i;

            }
            else{
                oddsum+=i;
            }
        }
        System.out.println("Even sum : "+evensum);
        System.out.println("Odd sum : "+oddsum);

        System.out.println();
        long evenproduct=1,oddproduct=1;

        for(int i =n1;i<=n2; i++){
            if(i%2==0){
                evenproduct=evenproduct*i;

            }
            else{
                oddproduct*=i;
            }
        }
        System.out.println("Even Product : "+evenproduct);
        System.out.println("Odd Product : "+oddproduct);


        
    }
}
