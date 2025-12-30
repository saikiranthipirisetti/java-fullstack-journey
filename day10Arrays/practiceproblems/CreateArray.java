package day10Arrays.practiceproblems;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
