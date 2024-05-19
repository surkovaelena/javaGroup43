package lec_07;

public class Main_array_double {
    public static void main(String[] args) {
        //Двухмерные массивы
        int[][] numbers = {{5, 8, 9, 9},
                {6, 0, 9},
                {7, 9, 2, 1, 7}};
        System.out.println("1.Печать двухмерного массива без цикла");
        // 1 стора
        System.out.print(numbers[0][0] + " ");
        System.out.print(numbers[0][1] + " ");
        System.out.print(numbers[0][2] + " ");
        System.out.print(numbers[0][3] + " ");
        // 2 строка
        System.out.println();
        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");

        // 3 строка
        System.out.println();
        System.out.print(numbers[2][0] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][2] + " ");
        System.out.print(numbers[2][3] + " ");
        System.out.print(numbers[2][4] + " ");

        System.out.println();

        System.out.println(" 2 Печать массива циклом");
        for (int i = 0; i < numbers.length; i++) {// обход строк массива
            //обход колонок строки
            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("3 Создать двухмерный массив,  наполнив числами 10 с шагом +5");

        int[][] numbers2 = new int[4][4];
        int a = 10;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = a;
                a += 5;//a =a+5
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("4 Печать диагонали двухмерного массива");
        int[][] numbers3 = new int[5][5];
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                if (i == j) {
                    System.out.print(numbers3[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
        System.out.println("5вывести побольшому треуг");
        int[][] numbers4 = new int[5][5];
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                if (i == j || i == 0 && j >= 1 || i == 1 & j >= 1 || i == 1 && j >= 1 || i == 2 && j >= 2 || i == 3 && j >= 3) {
                    System.out.print(numbers3[i][j] + " ");

                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
        System.out.println("6вывести помаленькому треугольнику");
        int[][] numbers5 = new int[5][5];
        for (int i = 0; i < numbers5.length; i++) {
            for (int j = 0; j < numbers5[i].length; j++) {
                if (i == j || i == 0 && j >= 1 || i == 1 & j >= 1 || i == 1 && j >= 1 || i == 2 && j >= 2 || i == 3 && j >= 3) {
                    System.out.print(" " + " ");

                } else {
                    System.out.print(numbers3[i][j] + " ");
                }

            }
            System.out.println();

        }
        System.out.println("7вывести массив в шахматном порядке");
        int[][] numbers6 = new int[5][5];
        for (int i = 0; i < numbers6.length; i++) {
            for (int j = 0; j < numbers6[i].length; j++) {
                if (i == j || i %2== 0&&j %2==0||i==3&&j==1||i==1&&j==3) {
                    System.out.print(numbers3[i][j] + " ");

                }else {
                    System.out.print(" " + " ");
                }

            }  System.out.println();

        }
        System.out.println("ДЗ печать двумерного массива в виде ромбика");



    }


}

