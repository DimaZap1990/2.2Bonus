public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int receipts = 1600;
        int total = balance + receipts;
        int bonus;
        if (receipts > 1000) {
            bonus = receipts / 100;
            System.out.println(bonus + " руб. Бонус");}
        System.out.println(total + " руб. Баланс");

    }
}
