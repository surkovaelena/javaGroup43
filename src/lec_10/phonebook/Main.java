package lec_10.phonebook;

public class Main {
    public static void main(String[] args) {
        ///code our prog

        ///записать несколько контактов
        Contact vasya = new Contact("Вася", "+56789");
        Contact pety = new Contact();
        Contact masha = new Contact();
Contact vasilisa =new Contact("Василиса");
        ///vasya.name ="Вася"; не работает когда с приватными данными
        vasya.setName("Вася");
        pety.setName("Петя");
        masha.setName("Маша");
        System.out.println();


        System.out.println(vasya.getName());
        System.out.println(pety.getName());
        System.out.println(masha.getName());

        System.out.println();
        Contact email = new Contact();
        Contact email1 = new Contact();
        Contact email2 = new Contact();

        email.setEmail("first@");
        email1.setEmail("second@");
        email2.setEmail("thirst@");
        System.out.println(email.getEmail());
        System.out.println(email1.getEmail());
        System.out.println(email2.getEmail());

        System.out.println();
        Contact number = new Contact();
        Contact number1 = new Contact();
        Contact number2 = new Contact();
        number.setPhoneNumber("+78901");
        number1.setPhoneNumber("+78902");
        number2.setPhoneNumber("+78903");
        System.out.println(number.getPhoneNumber());
        System.out.println(number1.getPhoneNumber());
        System.out.println(number2.getPhoneNumber());

        System.out.println();
        // переобозначила имя

        System.out.println(masha.getName());

                masha.setEmail("first@");

                String name1 = vasya.getName();
            Contact nata =new Contact("Nata");



            ///группировка контактов в телеф книгу
        Phonebook phonebookMy= new Phonebook();
        phonebookMy.addContact(vasya);
        phonebookMy.addContact(masha);
        phonebookMy.addContact(pety);
        phonebookMy.addContact(vasya);


        ////поиск по телефонной книге
//        phonebookMy.sourchContactContains("Ва");
//        phonebookMy.sourchContactContains("+7907");
        phonebookMy.sourchContactSubstring("Вася");

        System.out.println();


        ///ДОМАШКАРЕАЛИЗОВАТЬ МЕТОД ДОБАВЛЕНИЯ КОНТАКТОВ В МАССИВ И МЕТОДА ПОИСКА ПО ИМЕНИ И ТЕЛЕФОН В КЛАССЕ PhoneBook


    }


}
