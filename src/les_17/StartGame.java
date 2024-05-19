package les_17;

import java.util.Scanner;

public class StartGame {
    //pole
    //consr
    //metod
    public static void main(String[] args) {

        //1 создать игру
        RockPaperScissors game = new RockPaperScissors();
        //2 спросить у пользователя ход
        System.out.println("Выберите: ");
        System.out.println("1- Камень ");
        System.out.println("2 - Ножницы ");
        System.out.println("3 - Бумага");
        Scanner scanner = new Scanner(System.in);

        int subj = scanner.nextInt();
        //3 показываем в консоли выбор пользователя
        game.gameCheck(subj);
        //4 выбор компьютера

//        System.exit(0);  остановка программы

        game.addSubjPC(subj);
    }

}
