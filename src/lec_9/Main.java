package lec_9;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача узучить equals() и equalsIgnoreCase()");
            String text1="Java";
            String text2="Java";
            String text3="JAVA";
        System.out.println(text1==text2);//ссылочные типы так сравнивать нельзя
        System.out.println(text1.equals(text2));//true
        System.out.println(text1.equals(text3));//false
        System.out.println(text1.equalsIgnoreCase(text3));//true


        System.out.println("Метод regionMatches (int startIndex, String other, int otherStartIndex, int numChars) - сравнивает между\n" +
        "собой два участка строк this и other с учетом регистра символов");
        String text4="Hello Java!";
        String text5="Java Hello!";

        System.out.println(text4.regionMatches(0,text5,5,5));;// true сравнение двух кусков текста

        System.out.println("Метод indexOf(int ch) возвращает индекс первого вхождения в строку символа ch");

        String text6 = "Java";
        text6.indexOf('a');
        System.out.println(text6.indexOf('v'));//1 тндекс символа в строке  можно в ""
        System.out.println(text6);

        System.out.println("\nМетод lastIndexOf(int ch) возвращает индекс последнего вхождения в строку символа ch");

        System.out.println(text6.lastIndexOf('a')); //3

        System.out.println("\nМетод substring(int beginIndex) - создает новую строку с указанной позиции ");
        String str2 = "This lesson explains class String";
        System.out.println(str2.substring(5));      //lesson explains class String
        System.out.println(str2.substring(5, 11));   //lesson

        System.out.println("\nЗадача 1. Из строки Алгоритмы+Данные=Программы получить строку Алгоритмы=Программы-Данные");
        String source = "Алгоритмы+Данные=Программы"; //source - источник
        int p1 = source.indexOf('+'); // Определяем позицию символа '+‘
        int p2 = source.indexOf('='); // Определяем позицию символа '=‘
        String alg = source.substring(0, p1);// Вырезаем первое слово
        String dat = source.substring(p1 + 1, p2);// Вырезаем второе слово
        String prg = source.substring(p2 + 1);// Вырезаем третье слово
        String target = alg + "=" + prg + "-" + dat;// Сшиваем все по-новому. target - цель
        System.out.println(source);     //It was: Алгоритмы+Данные=Программы
        System.out.println(target);  //Has become: Алгоритмы=Программы-Данные

        System.out.println("\nЗадача 2. Из строки получить все гласные буквы и сохранить их в массив");
        String str3 = "Some text in English";

        char[]str3Array= str3.toCharArray();


        //Чтобы объявить массив, нужно сначала посчитать длину строки
        int countGlass = 0;
        for (char ch : str3.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y'||  ch == 'u'||  ch == 'o' || ch == 'i'||
            ch == 'A' || ch == 'E' || ch == 'Y'||  ch == 'U' || ch == 'O' || ch == 'I') {
                countGlass++;
            }
        }

        //создали массив и начинаем наполнять его
        char[] glassChar = new char[countGlass];
        int currentIndex = 0;
        for (char ch : str3.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o'||  ch == 'i'||
            ch == 'A' || ch == 'E'||  ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {
                glassChar[currentIndex] = ch;
                currentIndex++;
            }
        }
        System.out.println(glassChar);

        System.out.println("\nЗадача 3. Выполнить обратный порядок слов в предложении");
        String text = "работают! все Но совещаний. ни планерок, Ни муравейником. за дня три Наблюдал";
        String[] words = text.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
