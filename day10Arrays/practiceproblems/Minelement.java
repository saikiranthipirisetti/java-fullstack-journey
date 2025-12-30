package day10Arrays.practiceproblems;

public class Minelement {
    public static void main(String[] args) {
        int arr[] = {8,2,3,4,5,6,};
        int Min=arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        System.out.println("Min element = : " + Min);

    }
}
