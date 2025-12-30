package day10Arrays.practiceproblems;

public class MaxEvenIndex {
    public static void main(String[] args) {
        //find the max element from the even index elements 
         int arr[] = {1,2,3,4,5,6};
        int Maxeven=0,Maxodd=0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
            if(arr[i]>Maxeven){
                Maxeven = arr[i];
            }}
            else{
                 if(arr[i]>Maxodd){
                Maxodd = arr[i];
            }      
            }
        }
        System.out.println("Max element in even index  = : " + Maxeven);
        System.out.println("Max element in even index  = : " + Maxodd);

    }
}
