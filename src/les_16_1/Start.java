package les_16_1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //Создаем новую игру
        SapperGame sapperGame = new SapperGame();

        System.out.println("Выбери уровень сложности:");
        System.out.println("1 - Высокий");
        System.out.println("2 - Медиум");
        System.out.println("3 - Низкий");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt(); //Записали уровень сложности

        //Нужен метод для раскладки бомб, в зависимости от уровня сложности
        sapperGame.bombsByLevel(level);

        //Расставить цифры вокруг бомб для пользователя
        sapperGame.placeHelpNumberOnMap();

        //Вывести карту в консоль
        sapperGame.printMapGame();

        //Далее цикл игры
        int check = 1;
        while (check >= 1){ //1 и 2 надо снова спросить, а -1 конец игры либо бомба, либо победил
            System.out.println("Выберите координату Х от 1 до 10");
            int pointX = scanner.nextInt()-1;
            System.out.println("Выберите координату Y от 1 до 10");
            int pointY = scanner.nextInt()-1;

            //Проверка не выхода за границы
            if(pointX > 9 || pointY > 9 || pointX < 0 || pointY < 0){
                System.out.println("Вы вышли за пределы поля!");
                continue; //повтор while
            }

            check = sapperGame.checkPointPlayrs(pointY, pointX);
            if(check == 2){
                System.out.println("Вы уже вводили данные координаты, введите еще раз");
            } else if(check == 1){
                sapperGame.printMapGame();
                System.out.println("Следующий ход");
            } else if (check == -1){
                sapperGame.printMapGameOver();
                System.out.println("Бомба! Вы проиграли!!!");
            } else  {
                System.out.println("Поздравляю вы победили!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }

        //1. Добить печати цифр подсказок
        //2. Добиться открытия нулевых у границ массива



    }
}
