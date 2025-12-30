package day10Arrays.practiceproblems;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int arr[] = {8,2,3,4,5,6,};
      
        for(int i = 0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];

                arr[i] = arr[j];
                arr[j] = temp;
            }
        }}
        System.out.println(" Desending order arr element = : " + Arrays.toString(arr));
        System.out.println("Second hight element : " + arr[1]);
        System.out.println("Second lowest element : "+ arr[arr.length-2]);

    }
}
