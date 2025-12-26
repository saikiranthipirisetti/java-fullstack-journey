package day5loops.Forloopproblems;

public class Productoddalph {
    public static void main(String[] args) {
        //product of odd alphbaets
        long product=1;
        for(int i ='A';i<='Z';i++){
            if(i%2!=0){
                product=product*i;
            }

        }
        System.out.println(product);
    }
}
