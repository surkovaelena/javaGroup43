package homework3;

public class task3_1 {
    public static void main(String[] args) {
        System.out.println("\nДан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива" +
                " (пропусков быть не должно");

        //Входящие данные -изменчивы
        int[] numbers = {10, 12, 10, 15, 14, 10, 5};
        int numb = 10;
        int summa = 0;

//        Подсчитать какой длины нужен новый массив
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != numb) {

                summa++;//длина 4
            }
        }
//   Создали новый массив
        int[] massiv = new int[summa];

        int count1 = 0;
        for (int j = 0; j < numbers.length; j++) {

//                count1 = numbers[j];
//                count1 = numbers[j++];

            if (numbers[j] != numb) {
                massiv[count1] = numbers[j];
                count1++;


            }



        }
        numbers = massiv;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }


    }
}