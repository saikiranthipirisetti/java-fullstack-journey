package day10Arrays.practiceproblems;

import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum =0,EvenSum =0,OddSum=0;

        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index " + (i) + " : ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        int evenSize = (size + 1) / 2;
        int oddSize  = size / 2;

        int Evenarr[] = new int[evenSize];
        int Oddarr[]  = new int[oddSize];

        int j = 0, k = 0;

        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                Evenarr[j++] = arr[i];
                EvenSum+=arr[i];
            } else {
                Oddarr[k++] = arr[i];
                OddSum+=arr[i];
            }
        }

        System.out.println("Org Array        : " + Arrays.toString(arr));
        System.out.println("Sum of all elements in arr : "+sum);
        System.out.println("Even index array : " + Arrays.toString(Evenarr));
        System.out.println("Sum of all elements in Even indexed arr : "+EvenSum);
        System.out.println("Odd index array  : " + Arrays.toString(Oddarr));
        System.out.println("Sum of all elements in odd indexed arr : "+OddSum);

        sc.close();
    }
}
