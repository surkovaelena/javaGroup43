package les_11_12_13;



public class Main {
    public static void main(String[] args) {
        /**
         * Вы работаете над программой медиа-библиотеки онлайн кинотеатра EasyUm MediaProduct, где собраны
         * фильмы и музыкальных альбомы.
         * 1. Разобрать классы для хранения информации о:
         *      - музыкальный трек (название, исполнитель, год издания, альбом, количество треков), сами треки
         *      - фильмах (название, год выхода, студия издатель, режиссер, продолжительность в минутах, оценка)
         * 2. Создать массив контента с неоднородным составом (фильма и музыкальные диски),
         *      заполнить его несколькими элементами, вывести все элементы на экран.
         * 3. Найти в массиве самый старый трек/фильм и вывести информацию о нем на экран.
         * 4. Пояснить, где и зачем в данной программе используется полиморфизм, где наследование, а где абстракция.
         */

        Object[] mediaProduct = new Object[2];

        //Создаем фильм 1
        VideoContent film1 = new VideoContent();
        film1.setName("Зеленая миля");
        film1.setDirector("Иванов И.И.");
        film1.setStudio("Голивуд");
        film1.setMins(120);
        film1.setYear(2005);

        //Создаем фильм 2
        VideoContent film2 = new VideoContent("Ну погоди", 1983, "Союз Мультфильм", "Петров А.А", 60);
        film2.setName(" Ну погоди");
        film2.setYear(1983);
        film2.setDirector("Петров А.А.");
        film2.setStudio("Союзмультфильм");
        film2.setMins(60);

        //Дома сделать
        //1. Вернуться в les_10 в PhoneBook доделать метод sourchContactSubstring чтобы при поиске "Ва", не было "Иванова"
        //2. Вернуться в les_11 и в классе AudioContent прописать поля (из задания выше) и сделать сеттеры и геттеры и конструтор + пустой
        //3. Main и создать пару объектов песен
        //4. Класс создать (то есть тип) MediaProduct и в его массив сложить фильмы и песни (Полиморфизм)

        //создадим несколько песен(яв-ся объектом. экземпляр ТИПА)

        AudioContent music1 =new AudioContent();
        music1.setName("Батарейка ");
        music1.setExecutor("Максим");
        music1.setYear(1990);
        music1.setCountofTrack(12);


        AudioContent music2 =new AudioContent();

        music2.setName("Жигули");
        music2.setExecutor("Матрешка");
        music2.setYear(1989);
        music2.setCountofTrack(10);

        AudioContent music3 =new AudioContent();
        music3.setName("Жигул");
        music3.setExecutor("Ма");
        music3.setYear(1977);
        music3.setCountofTrack(10);


        //Создать массив и вложить фильмы и песни  ******полиморфизм
        MediaProduct[] mediaProducts =new MediaProduct[5];
        mediaProducts[0]=film1;
        mediaProducts[1]=film2;
        mediaProducts[2]=music1;
        mediaProducts[3]=music2;
        mediaProducts[4]=music3;

        // Печать на консоль инф о аудио и видео с учетом разности полей(полиморфизм)
       for (MediaProduct product:mediaProducts){

           product.printAllInfo();//проявление полиморфизма

        }
        System.out.println("------------------");
//1/дом задание реази метод для видео и аудио printAllInfo() voi, sout на консоль  и проверить цикл 63-65
// 2метод который опред сам старый продукт  в медиотеке
        ServiceUtilities.printOldestMedia(mediaProducts);
//        ServiceUtilities utilities1 =new ServiceUtilities();
//        utilities1.printOldestMedia(mediaProducts);


//        System.out.println();


    }
}
