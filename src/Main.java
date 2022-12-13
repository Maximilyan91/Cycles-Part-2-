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




    }
}