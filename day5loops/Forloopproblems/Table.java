package day5loops.Forloopproblems;
import java.util.Scanner;

class Table{
    public static void main(String[] args) {
        //wap to print the table 
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter n : ");
        int n = sc.nextInt();
        System.out.println("Printing "+n+"th Table : ");
        for(int i =1;i<=10;i++){
            System.out.println(n + " * " + i + " = "+n*i);

        }
        int sum = 0;
        System.out.println(" Printing table : without  using multiolaication operator : ");
        for(int j = 1;j<=10;j++){
            sum = sum + n;
            System.out.println(sum);
        }
    }
}