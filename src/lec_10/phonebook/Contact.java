package lec_10.phonebook;

public class Contact {
    // поля
    // конструкторы
    // методы


    ///поля
   private String name;
   private String email;
   private String phoneNumber;


    //кон-р  не возвращает ничего
public Contact(){
    // невидимый конструктор по умолчанию
}
public Contact(String name){
    this.name =name;
}
public Contact(String name, String phoneNumber){
    this.name=name;
    this.phoneNumber=phoneNumber;

}
    // методы скрыть поля нужно для безопастности
    //set name get name

    public void setName(String name){

        this.name=name;


    }
        public String getName(){

        return this.name;
        }

    public void setEmail(String email){
        this.email=email;
    }
     public  String getEmail(){
        return this.email;
                }

     public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
                        }

        public String getPhoneNumber(){
        return  this.phoneNumber;
        }

}
