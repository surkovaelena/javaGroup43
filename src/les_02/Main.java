package les_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коля собрал штангу на 127кг потом добавил 2кг. Сколько весит штанга");
        byte barbell = 127;
       //byte barbell2 = barbell +2;
       // barbell = barbell +2;
        barbell += 2;// одно и тоже что  barbell = barbell +2;

        System.out.println("вес штанги"+barbell );
        System.out.println("Хитрый бухгалтер поделил две кассы");
        int money = 5;
        int payWindow = 2;
        //int moneyInOnePayWindow =money / payWindow; //5._/2._=2._ поэтому ответ 2 или 2.0 если float
        //float moneyInOnePayWindow = (money / payWindow);
        float moneyInOnePayWindow =(float)money / payWindow;

        System.out.println("Денег в одной кассе:"+ moneyInOnePayWindow);

        System.out.println("Есть два числа 10 и 3. проверим точность float  и вщгиду");
    float a =(float) 10/3;
    double b =(double) 10/3;
    float d = 10.0f/3;
        System.out.println("Точность типов float:"+ a+ "\n Точность типов double:"+b);
        System.out.println(10.00/3.00);
        System.out.println(d);

        char symbol ='s';
        String str =" Точность";// String F4(провалиться в библиотеки) служебное название. str просто переменная
//ASCII

        char symbolCode = 115;
        System.out.println(symbolCode);
        System.out.println(symbol + " -тоже самое- " + symbolCode);

        System.out.println("Дано 10 красных яблок и 5 зеленных. " +
                "Вопрос: верно ли что красных яблок больше чем зеленных");
        int redApple=10, greenApple=55;
        boolean result = redApple > greenApple;
        System.out.println("Утверждение: " + result);
/**
Математические операторы:
        "+", "-", "/", "*",
        "++" инкремент (увеличение на 1),  i=1 i=i+1 i++  х++ постфиксная форма, ++х префиксная форма,
        "--" декремент (уменьшает на 1), х-- постфиксная форма, --х префиксная форма,
        "%" остаток целочисленного деления или деление по модулю,// 5 яблок разделить их на 3 детей но целыми яблоками 5%3=2

                Арифметические операции с присваиванием:
        +=   Сложение с присваиванием
        -=     Вычитание с присваиванием
         *=     Умножение с присваиванием
        /=     Деление с присваиванием
         %=     Деление по модулю с присваиванием
                */

        /**Операторы сравнения:

        "==" равно,
         "!=" не равно,
        ">" больше,
         "<" меньше,
         ">=" больше или равно,
         "<=" меньше или равно,
         */

        /**Логические операторы:
        "&&" условный И,
        "||" условный ИЛИ,

         &  Логическая операция И (AND) или конъюнкция.
        AND (&) - результат будет true, только если и A, и B равны true.
         Пример: для того чтобы свадьба состоялась, и невеста (A) и жених (B) должны явиться на бракосочетание,
         иначе оно не состоится.

         |  Логическая операция ИЛИ (OR) или дизъюнкция.
         OR (|) - результат будет true, если хотя бы одно значение равно true. Пример: для того, чтобы забрать
        ребенка из садика, должна прийти либо мать, либо отец, либо оба - в любом случае результат будет
        положительный. Если же никто не придет, ребенка не заберут - результат будет отрицательный.

         ^  Логическая операция исключающее ИЛИ (XOR).
         XOR (^) - результат будет true, только если или A равно true, или В равно true. Пример: у двух друзей на
        двоих один велосипед, поездка на велосипеде состоится только если один из них поедет на нем. Вдвоем они
        ехать не могут.

        !  Логическая унарная операция НЕ (NOT).
         NOT (!) - инвертирование значения. Если значение было true, то станет false, и наоборот.

         || Укороченная логическая операция ИЛИ (short-circuit)
         && Укороченная логическая операция И (short-circuit)

         &= Логическая операция И с присваиванием
         |= Логическая операция ИЛИ с присваиванием
         ^= Логическая операция исключающее ИЛИ с присваиванием

        Чаще всего в языке Java используются так называемые укороченные логические операторы (short-circuit):
         ||   -  Укороченный логический оператор ИЛИ
         &&  - Укороченный логический оператор И
        Правый операнд сокращенных операций вычисляется только в том случае, если от него зависит результат операции,
         то есть если левый операнд конъюнкции имеет значение true, или левый операнд дизъюнкции имеет значение false.
         В формальной спецификации языка Java укороченные логические операции называются условными.
         В следующем примере правый операнд логического выражения вычисляться не будет, так как условие num8!=0
        не выполняется и нет смысла дальше вычислять это выражение:
         */

        System.out.println("Расчет покупок в магазине  на все наличные деньги ");
        double cash =1500; // наличние
        double priceOfPizza =230;  //цена пиццы
        double priceOfGum =26;  ///цена жвачки
        double priceOfCondies =2.5; // цена конфет
                //сколько купим пиццы
        int countOfPizza = (int) (cash/ priceOfPizza);
        System.out.println(" пиццы: "+ countOfPizza + "шт");
        //сдача после покупки пиццы
        double balanceOfPizza = cash % priceOfPizza;
        // тоже самое что и double balanceAfPizza = cash -(priceOfPizza +countOfPizza);
        System.out.println(" Сдача: "+ balanceOfPizza + "руб");

        //сколько купим жвачки
        int countOfGum = (int) (balanceOfPizza/ priceOfGum);
        System.out.println(" пиццы: "+ countOfGum + "шт");
        //Сдачу после жвачки
        double balanceOfGum = balanceOfPizza % priceOfGum;
        System.out.println(" Сдача: "+ balanceOfGum + "руб");

        //сколько купим конфет
        int countOfCondies = (int) (balanceOfGum/ priceOfCondies);
        System.out.println(" пиццы: "+ countOfCondies + "шт");
        //Сдачу после конфет
        double balanceOfCodies = balanceOfGum % priceOfCondies;
        System.out.println(" Сдача: "+ balanceOfCodies + "руб");
    }
}
