package lec_10.phonebook;

public class Contact {
    // ����
    // ������������
    // ������


    ///����
   private String name;
   private String email;
   private String phoneNumber;


    //���-�  �� ���������� ������
public Contact(){
    // ��������� ����������� �� ���������
}
public Contact(String name){
    this.name =name;
}
public Contact(String name, String phoneNumber){
    this.name=name;
    this.phoneNumber=phoneNumber;

}
    // ������ ������ ���� ����� ��� �������������
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
