public class Main {
    public static void main(String[] args) {

        // Задача 1.

        int monthPay = 15000;
        int totalPay = 0;
        int month = 1;
        while (totalPay <= 2459000) {
            month += 1;
            totalPay = totalPay + totalPay/100;
            totalPay = totalPay + monthPay;
            System.out.println("Месяц " + month + " Сумма накоплений = " + totalPay);
        }

        // Задача 2.

        int a = 0;
        while (a < 10) {
            a += 1;
            System.out.print(" " + a);
        }
        System.out.println();

        for (a = 10; a > 0; a--) {
            System.out.print(" " + a);
        }






    }
}