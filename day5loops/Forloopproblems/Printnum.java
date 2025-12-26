package day5loops.Forloopproblems;
import java.util.Scanner;
public class Printnum {
    //wap to print numbers from range which are not having 7 in it .
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = sc.nextInt();
        int d = 0;
        for(int i = n1;i<=n2;i++){
            int temp = i;
            int c =0;
            while(temp>0){
                d=temp%10;//u got last element
                if(d==7){
                    c++;
                    break;
                 }
                 temp = temp/10;
        }
        if(c==0){
            System.out.println(i);
        }
     }
    }
}
