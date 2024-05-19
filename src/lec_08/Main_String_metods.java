package lec_08;

import java.util.Scanner;

public class Main_String_metods {
    public static void main(String[] args) {

        System.out.println("Пример 1 Понять что объект класса String  не изменяемый");
        String text ="Первый текст";///в OЗУ записано text =href1
        //java сборщик мусора чистит href1

        text= "Второй текст";///в OЗУ записано text =href2
        text =text + " Третий текст";//href3, href2 deleted
        System.out.println(text);


//        System.out.println("Задача 2. Получить от пользователя любой текст и перевернуть его. \" +\n" +
//                "                \"Например, текст: Папа может! Программа должна вернуть текст: !тежом апаП");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите любой текст для переворота :");
//        // юзер вводит текст а мы его ловим
//        String answer = scanner.nextLine();//берет текст до энтора
//        System.out.println("Перевернутый текст : ");
//        //перевернуть текст
//        for (int i = answer.length()-1; i >=0; i--) {
//            System.out.print(answer.charAt(i));
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 3. Поиск и замена символов в тексте");
        String text2 = "Какой-то&текст&был&скопирован*с*ошибками";
        text2 =text2.replace("&"," ");
        System.out.println(text2);
        text2 =text2.replace("*"," ");
        System.out.println(text2);
        System.out.println(" ");


        System.out.println("Задача 4 Проверка корр введ текста");
        System.out.println(" Введите свой e mail");
        String email=scanner.nextLine();//наш текст


        for (int i = 0; i <email.length(); i++) {
            // проверим наличие собаки @
            //indexOf возвращает индекс символа в int, если не найдет, тогда -1


            //eсли встать на методе indexOf курсором и нажать F4 (или удержать мышь), тогда откроется класс String,
            //и в тексте над методом будет комментарий, поясняющий работу метода. Методы indexOf('@') и indexOf("@") разные
            int indexOfDog=email.indexOf('@');
            //если собаки нет то вернет -1
            if (indexOfDog == -1){//нет собаки
                System.out.println("эмайл не содержит @");
                return;

            }
            //если собака была
            // если собаки больше чем 1

            //Метод split режет по "символу" или по "слову или фразе"
            String[]partsByDog =email.split("@");////ggggg@mail.ru [ggggg][mail.ru]
            //одна @ даст массив из двух индексов 0 и 1, а если не так, то... (показать debug)

            if(partsByDog.length !=2){
                System.out.println("емайл содержит более одной собаки");
              return;

            }
            ////Название почты и домен не могут начинаться или заканчиваться точками (.fffff.@.fffff.ff.)
            //        //методы startsWith и endsWith


            char wordStart ='.';

//
//            String word = String.valueOf(email.startsWith("."));
//                if(email.equals(word)){
//                    System.out.println("Емайл содержит точку ");
//                         return;
//    }

            String partBeforeDog = partsByDog[0];//[123]
            String partAfterDog =  partsByDog[1];//[mail.ru]

            if (partBeforeDog.startsWith(".")||partBeforeDog.endsWith(".") ){//есть ли в partBeforeDog  точка
                System.out.println("майл начинается  и заканчивается с точки до собаки");
                return;
            }
            if(partAfterDog.startsWith(".")||partAfterDog.endsWith(".") ){//есть ли в partAfterDog точка
                System.out.println("майл заканчивается  точкой после собаки");
                return;
            }
            System.out.println("Емайл прошел проверку");


        }

    }

}
