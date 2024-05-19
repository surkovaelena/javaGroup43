package lec_06;

public class Main_hw5 {
    public static void main(String[] args) {
        System.out.println("\nДан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива" +
                " (пропусков быть не должно");
        int[] numbers = {10, 12, 10, 15, 14, 10};
        int numb = 10;

        //1 Какой длинны --намотать count
        int count =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numb)
                count++;
                  }

        //2 Создаем новый массив на кол чисел без 10
           int[] newNum = new int[count];
            for (int j = 0; j <numbers.length ; j++) {/// запуст цикл  на длину массива numbers
                if(numbers[j] != numb) {
                    for (int i = 0; i < newNum.length; i++) {/// запустили цикл на длину массыива newNum
                        if (newNum[i] == 0) {

                            newNum[i] = numbers[j];//запись числа не 10 на новый массив
                            break;
                        }
                    }
                }
                }
                               System.out.println();
        numbers =newNum;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            }

        }



