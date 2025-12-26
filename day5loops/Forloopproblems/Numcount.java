package day5loops.Forloopproblems;
import java.util.Scanner;
public class Numcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();
        //count the numbers which are divisible  by 5 and 7 between n1 and n2
        int sum =0;

        for(int i =n1;i<=n2;i++){
            if(i%5==0){
                System.out.print(" "+i);
                sum=sum+i;

            }
            
        }
        System.out.println(" Sum : "+ sum);
    }
}
