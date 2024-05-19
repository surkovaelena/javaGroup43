package les_17;

import java.util.Random;

public class RockPaperScissors {
    //pole
    //constryctor

    public RockPaperScissors() {
    }

    //metod
    public void gameCheck(int subj) {
        if (subj==1){
            System.out.println("Вы выбрали Камень");
        }else if (subj==2){
            System.out.println("Вы выбрали Ножницы");
        }else if (subj==3){
            System.out.println("Вы выбрали Бумага");
        }else {
            System.out.println("Вы неправильно выбрали число");
//            System.exit(0);//можно переписать на перезапуск или рекурсию

        }
    }

    public void addSubjPC(int subj) {

        Random random =new Random();
        int result = random.nextInt(3)+1;//random.nextInt(1,4)
        if(result==1 && subj!=1 && subj!=3){
            System.out.println("Ты проиграл. Камень бьют ножницы");
        }else if(result==2&& subj!=2&&subj!=1){
            System.out.println("Ты проиграл ножницы режут бумагу");
        }else if(result==subj){
            System.out.println("Ничья");
        }else if (result==3&& subj!=3&& subj!=2){
            System.out.println("Ты проиграл бумага кроет камень");
        }else if (result == 1 && subj == 3) {
            System.out.println("Ты выиграл. Бумага кроет камень ");

        } else if (result == 2 && subj == 1) {
            System.out.println("Ты выиграл. Камень бьет ножницы");

        } else if (result == 3 && subj == 2) {
            System.out.println("Ты выиграл.Ножницы режут бумагу");

        } else
            System.out.println();
    }

    }

