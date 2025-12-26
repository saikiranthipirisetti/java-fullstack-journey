package day4Conditional;

public class Railwayticket {
    public static void main(String[] args) {
        int seats_avalible = 100;
        boolean rac = true;
        
        if(seats_avalible>0){
            System.out.println("Your ticet is confirmed");
        }
        else if(seats_avalible==0&&rac){
            System.out.println("Your ticket is in weightlisted.");

        }
        else{
            System.out.println("Your ticket is cancelled.");
        }
    }
}
