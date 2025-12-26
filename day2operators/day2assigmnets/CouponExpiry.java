package day2assigmnets;

public class CouponExpiry {
    public static void main(String[] args) {
        int currentDay = 5;
        int expiryDay = 7;

        String result = currentDay < expiryDay ? "Coupon Valid" : "Coupon Expired";
        System.out.println(result);
    }
}

