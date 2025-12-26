package day2assigmnets;

public class QuantityLimit {
    public static void main(String[] args) {
        int quantity = 6;

        String result = quantity <= 5 ? "Order allowed" : "Quantity limit exceeded";
        System.out.println(result);
    }
}
