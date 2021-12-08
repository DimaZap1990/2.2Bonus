public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int receipts = 1600;
        int total = balance + receipts;
        int bonus;
        if (receipts > 1000) {
            bonus = receipts / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus + total + " руб.");
    }
}
