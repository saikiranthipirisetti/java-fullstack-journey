package day2assigmnets;

public class FraudDetection {
    public static void main(String[] args) {
        int orderAmount = 15000;
        int averageOrderValue = 8000;

        String result = orderAmount > averageOrderValue ? "Flag for Review" : "Normal Order";
        System.out.println(result);
    }
}

