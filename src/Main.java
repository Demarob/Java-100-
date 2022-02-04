public class Main {
    public static void main(String[] args) {

        int initial = 900000;
        int Introduction = 20;

        int refill;
        if (Introduction >= 1000) {
            refill = Introduction * 1 / 100;

        } else {
            refill = 0;
        }

        int balance = initial + refill + Introduction;

        System.out.println(balance);

        System.out.println(refill);
    }
}