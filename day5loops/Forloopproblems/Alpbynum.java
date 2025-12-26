package day5loops.Forloopproblems;
import java.util.Scanner;
public class Alpbynum {
    //write a program to print the alphabet by reading number.
    //example : I/P :  25 then o/p : E
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1&&n<=26){
            System.out.println((char)(n+64));
        }
    }
}
