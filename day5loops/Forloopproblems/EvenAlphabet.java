package day5loops.Forloopproblems;
import java.util.Scanner;

public class EvenAlphabet {
    //Wap to print the even alphabet by using for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Even alphabets: ");
        for(int i ='A';i<='Z';i++){
            if(i%2==0){
              //  i = char(i);
                System.out.print((char)i + " ");
            }
        }
        System.out.println();
        System.out.print("odd alphabets: ");
        for(int j ='A';j<='Z';j++){
            if(j%2!=0){
                System.out.print((char)j + " ");
            }
        }
    }

}
