package lec_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Расчет площади или периметра разных фигур.");
        System.out.println("Выберим фиругу себе :");
        System.out.println("1-круг");
        System.out.println("2-овал");
        System.out.println("3-квадрат");
        System.out.println("4-треуголник");
        System.out.println("5-трапеция");

        //int number =5;
//int [] arrayNew = new int [x];
        Scanner scanner1 = new Scanner(System.in);//создали объект типа сканер с именем scanner1
        int inputvalue1= scanner1.nextInt(); // на переменную будут записаны символы с клав до нажатия enter/ выбор фигуры

if (inputvalue1<=5){
        System.out.println("Что подсчитать");
        System.out.println("1-площадь");
        System.out.println("2- периметр");

       int inputvalue2 =scanner1.nextInt();// ответ на что считаем
if(inputvalue2<=2) {
    //Решение
    switch (inputvalue1) {
        case 1:// круг
            System.out.println("ВВедите радиус");
            int inputRadius = scanner1.nextInt();
            if (inputvalue2 == 1) {
                System.out.println("Площадь круга = " + ((inputRadius * inputRadius) * Math.PI)); // если площадь
            } else if (inputvalue2 == 2) {
                System.out.println(" Окружность =" + (inputRadius * 2 * Math.PI));
            }
            break;

        case 2: // овал

            System.out.println("ВВедите радиус1");
            int inputRadius1 = scanner1.nextInt();
            System.out.println("ВВедите радиус2");
            int inputRadius2 = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("Площадь овала = " + ((inputRadius1 * inputRadius2) * Math.PI)); // если площадь
            } else if (inputvalue2 == 2) {
                System.out.println(" Окружность овала =" + (Math.PI * 2 * Math.sqrt((Math.pow(inputRadius1, 2) + Math.pow(inputRadius2, 2)) / 2)));
            }
            break;
        case 3: // квадрат
            System.out.println("ВВедите сторону");
            int inputside = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("Площадь квадрата = " + (Math.pow(inputside, 2))); // если площадь
            } else if (inputvalue2 == 2) {
                System.out.println(" Периметр квадрата  =" + (inputside * 4));
            }
            break;

        case 4: // треугольник
            System.out.println("ВВедите основание");
            int inputbase = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("ВВедите высоту");
                int inputtall = scanner1.nextInt();
                System.out.println("Площадь треугольника = " + ((inputbase * inputtall) / 2)); // если площадь
            } else if (inputvalue2 == 2) {
                System.out.println("ВВедите сторону 1");
                int inputside1 = scanner1.nextInt();
                System.out.println("ВВедите всторону 2");
                int inputside2 = scanner1.nextInt();
                System.out.println(" Периметр треугольника  =" + (inputbase + inputside1 + inputside2));
            }
            break;

        case 5: // трапеция

            System.out.println("ВВедите основание1");
            int inputbase1 = scanner1.nextInt();
            System.out.println("ВВедите основание2");
            int inputbase2 = scanner1.nextInt();
            if (inputvalue2 == 1) {
                System.out.println("ВВедите высоту");
                int inputtall = scanner1.nextInt();
                System.out.println("Площадь трапеции = " + ((inputbase1 + inputbase2) / 2 * inputtall)); // если площадь
            } else if (inputvalue2 == 2) {
                System.out.println("ВВедите сторону 1");
                int inputside1 = scanner1.nextInt();
                System.out.println("ВВедите всторону 2");
                int inputside2 = scanner1.nextInt();

                System.out.println(" Периметр трапеции =" + (inputbase1 + inputbase2 + inputside1 + inputside2));
            }

            break;

        default:
            System.out.println("Такой фигуры нет");
    }
}else System.out.println("Ошибка");
        }else System.out.println("Такой фигуры нет");
    }
}
