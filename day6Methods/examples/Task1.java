package day6Methods.examples;
//task is we need to print all details of us in one go using only one method with return type.
//theere is only one datatype : string which will take evrything at one go.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(details());
    }
    
    public static String details(){
        String name = "saikiran";
        int age = 18;
        String sec = "btech";
        return "Name : "+ name +"\nage : "+ age+"\nsection : " + sec;
    }

}
