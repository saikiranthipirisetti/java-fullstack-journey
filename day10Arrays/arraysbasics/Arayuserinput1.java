package day10Arrays.arraysbasics;
import java.util.Arrays;
import java.util.Scanner;
public class Arayuserinput1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array : ");
        // int size = sc.nextInt();
       // int arr1[] = new int[size];
        int arr1[] = new int[sc.nextInt()];
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter element "+ (i+1) + " : ");
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            
            System.out.println(arr1[i]);
        }

        //prinnnt through inbuild class using arrays
        System.out.println(Arrays.toString(arr1)); //static 

    //second formatt
    sc.close();
    }
}
