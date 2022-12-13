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
        System.out.println();

        // Задача 3.

        int popylationY = 12_000_000;
        for (int year = 1; year <= 10; year++) {
           int birthRate = (17*12000) - (8*12000);
            popylationY = popylationY + birthRate;
            System.out.println("Год " + year + " численность населения составляет " + popylationY);
        }

        // Задача 4.

        int deposit = 15000;
        int month2 = 0;
        while (deposit <= 12_000_000) {
            month2 +=1;
            deposit = deposit + (deposit/100)*7;
            System.out.println("За месяц " + month2 + " суммма накоплений составляет " + deposit + " рублей");
        }

        // Задача 5.
        int deposit2 = 15000;
        int month3 = 0;
        while (deposit2 <= 12_000_000) {
            month3 +=1;
            deposit2 = deposit2 + (deposit2/100)*7;
            if (month3 % 6 == 0) {

                System.out.println("За месяц " + month3 + " суммма накоплений составляет " + deposit2 + " рублей");
            }
        }
        // Задача 6.

        int depositVasyliy = 15000;
        for (int monthVasiliy = 0; monthVasiliy <= 108; monthVasiliy++) {
            depositVasyliy = depositVasyliy + (depositVasyliy/100)*7;
            if (monthVasiliy % 6 == 0) {
                System.out.println("За " + monthVasiliy + " месяц cумма накоплений составила " + depositVasyliy);
            }
        }




    }
}