package day8test.day8task;
public class Disarium {
    public static void main(String[] args) {

        for(int i=1;i<=500;i++){
            int x = i;
            int y = x;
            int z = x;
            int c = 0;
            int sum = 0;

            while(x!=0){
                x = x / 10;
                c++;
            }

            while(y!=0){
                int x1 = y % 10;
                int mul = 1;
                for(int j=0;j<c;j++){
                    mul = mul * x1;
                }
                sum = sum + mul;
                c--;
                y = y / 10;
            }

            if(sum == z)
                System.out.println(i);
        }
    }
}
