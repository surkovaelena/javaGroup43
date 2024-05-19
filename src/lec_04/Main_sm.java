package lec_04;

public class Main_sm {
    public static void main(String[] args) {

        System.out.println("Напечатать четные  цифры в диапазоне от 0 до 250");

        for (int i = 0; i <= 250; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ";");

            }

        }
        System.out.println();
        System.out.println("Напечатать нечетные в диапозоне от 0 до 250");

        for (int i = 0; i <= 250; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ";");
            }

        }
        System.out.println();

        System.out.println("Напечатать цифры в диапозоне от 100 до 150 который делится на 3 и 5 одновременно");

        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ";");

            }

        }
        System.out.println();

        System.out.println("Посчитать сумму чисел в диапазоне от 10 до 15");
        int summa = 0;
        for (int i = 10; i <= 15; i++) {

            summa += i;
            System.out.println(summa);
        }
        System.out.println();

        System.out.println("вывести цифры в диапозоне от 20 до 0");
        for (int i = 20; i >= 0; i--) {
            System.out.print(i+ ";");

        }System.out.println();


        System.out.println("вывести цифры в диап от 10 до 40. пропустив интервал от 15 до 20");
        for (int i = 10; i <= 40 ; i++) {
            if(i<15||i>20){
                System.out.print(i+ ";");

            }

        }System.out.println();

        System.out.println("7. Вывести на консоль сумму четных чисел  от 10 до 50");
        int summa1 =0;
        for (int i = 10; i <=50; i++) {
            if(i%2==0)
                summa1 += i;


            System.out.print(summa1 +";");

        }System.out.println();
        System.out.println(summa1 +";");
        int sum = 0;

        for (int i = 10; i<=50; i++){
            if (i % 2 == 0) sum += i;
        }

        System.out.printf("Сумма четных чисел от 10 до 50 = %d", sum);
    }

}
