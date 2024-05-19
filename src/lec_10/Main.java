package lec_10;

public class Main {

    public static void main(String[] args) {
        int[][] numbers1 = {{1, 2, 5},
                {4, 6, 8},
                {6, 3, 7}};

        int[][] numbers2 = {{15, 24, 53, 45},
                {44, 46, 84, 54},
                {36, 33, 47, 98}};

        System.out.println("Метод 1. Печатает на консоль двумерного массива целых чисел");

        MassiveUtils.pritMassivToConsole(numbers1);
        MassiveUtils.pritMassivToConsole(numbers2);

//        MassiveUtils name= new MassiveUtils();
//        name.pritMassivToConsole
//  Люди.говорить()  ------- это статик метод  эти тип
//       Люди дима = new Люди();  это объект
//    дима.говорить(eng); без слова статик но вызываются у объекта

        System.out.println("//Метод 2. Подсчет количество четных чисел в двумерном массиве целых чисел");
   int count1 =MassiveUtils.countEvenNumbers(numbers1);
        int count2= MassiveUtils.countEvenNumbers(numbers2);
        System.out.println(count1);
        System.out.println(count2);

        System.out.println("Метод 3. Создание массива гласных из строк текста");
        String text= "Some text in English";
        char[] arraySymbols = MassiveUtils.charGlassFromText(text);
        System.out.println(arraySymbols);


    }


}
