package day8test.day8task;

public class Happynum {
    public static void main(String[] args) {
    
    
    for(int i =1;i<=500;i++){
        int x =i;
    while(x!=1&&x!=4){
       int sum1=0;
        while(x>0){
        int x1= x%10;
        sum1 = sum1+(x1*x1);
        x=x/10;
        }
        x=sum1;

    }
    if(x==1){System.out.print(i+" ");}
}
}}
    



