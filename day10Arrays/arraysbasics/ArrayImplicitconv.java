package day10Arrays.arraysbasics;

public class ArrayImplicitconv {
    public static void main(String[] args) {
        //impleset convertsion
        double arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------------");
        
        int arr2[] = {'A','B','C'};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
