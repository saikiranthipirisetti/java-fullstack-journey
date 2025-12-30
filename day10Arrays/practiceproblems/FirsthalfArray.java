package day10Arrays.practiceproblems;

public class FirsthalfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,};
        System.out.print("First half of array : ");
        for(int i = 0;i<arr.length/2;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Second half : ");
        for(int i=arr.length/2;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
