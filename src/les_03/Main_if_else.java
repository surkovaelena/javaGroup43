package les_03;

public class Main_if_else {
    public static void main(String[] args) {
        System.out.println("Выбрать фразу похвалы ребенка за оценку");
        int mark = 3;
//     if(     ){
//
//     }
//        if(mark == 5){
//            System.out.println("Отлично!");
//        } else if (mark == 4) {
//            System.out.println("Хорошо!");
//        } else if (mark == 3) {
//            System.out.println("Нужно постараться");
//        }else if (mark== 2){
//            System.out.println("Так получилось!");
//        }else {
//            System.out.println("Проверте число");
//        }

//        switch (mark){
//            case 5:
//                System.out.println("Отлично");
//                break;
//            case 4:
//                System.out.println("Хорошо");
//                break;
//            case 3:
//                System.out.println("Попробуй еще раз");
//                break;
//
//            case 2:
//                System.out.println("Так получилось!");
//                break;
//            default:
//                System.out.println("Проверьте число!");
//        }
        System.out.println("Какой блок сработает if  или else");
        int num1 = 0;
        int num2 = 10;
        if((num1 !=0) &&((num2 /num1)>=10)){
            System.out.println("Сработало тело If");
        }else {
            System.out.println("Сработало тело else");
        }
        System.out.println("Число х, оно должно быть в диапазоне между а и б");
        int a = 1;
        int b = 3;
        int x = 2;
        System.out.println("Число х находится между а и б? :" +(a < x && x<b));
        boolean result = (a<x && x<b);
        System.out.println(result);


        System.out.println("Задача. Посчитать сможем ли мы поехать в тур?" +
                "Дано: Стоимость тура (tourPrice) 40тр. \" +\n" +
        "\"Сбережения (cash) 20тр. " +
                "Зарплата (monthlySalary) 100тр." +
                 "Месяцев до путешествия (monthsBeforeTheTrip) 5.\" + \n" +
                "\"Ежемесячные расходы (monthlyExpenses) 7.5тр.");
        // Дано
        int tourPrice = 40000;
        int cash  = 20000;
        int monSallary = 100000;
        int monBefTrip = 5;
        int monExpe = 7500;
        //Решение
        //1Ежемес прибыль
        int monProfit =monSallary -monExpe;
        //2 накопим прибыль
        int accMon = monProfit* monBefTrip;
        //3 Проверка хватит ли нам денег на путешествие
        if((accMon+cash)>tourPrice){
            System.out.println("Ура едим в отпуск b едим!");
        }else if((accMon+cash)==tourPrice) {
            System.out.println("Ура едим в отпуск b едим!");
        }  else{
            System.out.println("Увы надо еще поработать!");
        }

    }

    }

