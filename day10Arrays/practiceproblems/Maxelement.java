package day10Arrays.practiceproblems;

public class Maxelement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,};
        int Max=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        System.out.println("Max element = : " + Max);

    }
}
