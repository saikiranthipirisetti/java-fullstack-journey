package day2assigmnets;

public class PaymentVerification {
    public static void main(String[] args) {
        double paidAmount = 500.00;
        double orderAmount = 500.00;

        String result = paidAmount == orderAmount ? "Payment Successful" : "Payment Mismatch";
        System.out.println(result);
    }
}
