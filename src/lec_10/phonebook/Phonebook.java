package lec_10.phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class Phonebook {

    //����
    private Contact[] contacts = new Contact[1000];

    //��������

    public Phonebook() {

    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "contacts=" + Arrays.toString(contacts) +
                '}';
    }

    //������
    public void addContact(Contact contactUser) {
        //code
//    System.out.println("-------- ");
//    Scanner scanner = new Scanner(System.in);
//    String name = scanner.nextLine();
//    String [] name1 = new String[1];
//    for (int i = 0; i < name1.length; i++) {
//        name1[i]= name;
//        System.out.println(name1[i]);
//    }
//int count=0;
//for (Contact user: contacts){
//    if (user == null) {
//   contacts[count] =contactUser;
//    break;}
//    count ++;
//    }

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contactUser;
                break;
            }

        }
    }


    //�����
    public void sourchContactContains(String forSorch) {

        for (Contact c : contacts) {
            // ����� �� �����

            /// �������� �� ���� ��� c!= null  �.� ������ ������� �������� �������
            if (c != null) {
                String nameOfCurrentContact = c.getName();///��� �� ����� ���� �� ��� ��������
                if (nameOfCurrentContact != null) {
                    if (nameOfCurrentContact.contains(forSorch)) {
                        System.out.println(c.getName() + " " + c.getPhoneNumber());

                    }
                }

            }

//            String nameOfCurrentContact = c.getName();
            // ����� �� ������
//            nameOfCurrentContact.contains(forSorch); //������������ ��� ��
/// �������� �� ���� ��� c.getName()!= null


        }

    }

    public void sourchContactSubstring(String textSorch) {
        for (Contact user: contacts){
            if (user!= null){
                String text = "";
                String number = " ��� ������";

                if(user.getName()!= null&& user.getPhoneNumber() != null){
                  if(user.getName().length() >= textSorch.length() ){
                      text = user.getName().substring(0,textSorch.length());
                 //break;
                  }

                }
                if(user.getPhoneNumber()!= null){

                        if(user.getPhoneNumber().length() >= textSorch.length() ){
                            text = user.getPhoneNumber().substring(0,textSorch.length());
                        }
                    }
                if (text.equalsIgnoreCase(textSorch)){// ��������� ��� ���������
                    System.out.println(user.getName() + " "+ user.getPhoneNumber());
                }else  if(number.equals("��� ������")){
                    System.out.println(user.getName()+ number);

//                }else if (number.equals(textSorch)){
//                    System.out.println(user.getName()+ " "+ user.getPhoneNumber());
//                }else {
////                    break;
                }

                }

            }
        }
    }
