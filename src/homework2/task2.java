package homework2;

public class task2 {
    
    //ДОМАШНЕЕ ЗАДАНИЕ
    //Задача 1. Сколько столов войдут в комнату, если стол имеет размер 1,5 х 2,5 и комната 5 х 7

    //Задача 2. Рассчитать какую машину вы сможете купить: Lexus LX 23 млн.р, Lexus NX 7 млн.р., Lada Niva 2 млн.р.,\n" +
    //                "если в копилке есть 100 т.р., зарплата 150 т.р., Расходы 75 т.р., и копить Вы будете 60 месяцев.
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double ploshad = a*b;

        double c =1.5;
        double d = 2.5;
        double ploshad1 = c* d;

        int count = (int) (ploshad / ploshad1);

        System.out.println( count);

        System.out.println("--------------------------------------------");

        int save = 100000;
        int salary = 150000;
        int pay = 75000;
        int time =60;

        int saveMoh = save +(salary - pay)* 60;
        if (saveMoh>= 23000000) {
            System.out.println("Могу купить Lexus LX");
        }else
            if(saveMoh>=7000000 && saveMoh<23000000){
                System.out.println("Могу купить Lexus NX");
            }else if (saveMoh>=2000000 && saveMoh< 7000000) {
                System.out.println("Могу купить Lada Niva");
            }else {
                System.out.println("Нужно копить еще");
            }


    }


}
