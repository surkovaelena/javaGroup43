package lec_08;

import java.util.Scanner;

public class Main_String_metods {
    public static void main(String[] args) {

        System.out.println("������ 1 ������ ��� ������ ������ String  �� ����������");
        String text ="������ �����";///� O�� �������� text =href1
        //java ������� ������ ������ href1

        text= "������ �����";///� O�� �������� text =href2
        text =text + " ������ �����";//href3, href2 deleted
        System.out.println(text);


//        System.out.println("������ 2. �������� �� ������������ ����� ����� � ����������� ���. \" +\n" +
//                "                \"��������, �����: ���� �����! ��������� ������ ������� �����: !����� ����");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("������� ����� ����� ��� ���������� :");
//        // ���� ������ ����� � �� ��� �����
//        String answer = scanner.nextLine();//����� ����� �� ������
//        System.out.println("������������ ����� : ");
//        //����������� �����
//        for (int i = answer.length()-1; i >=0; i--) {
//            System.out.print(answer.charAt(i));
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("������ 3. ����� � ������ �������� � ������");
        String text2 = "�����-��&�����&���&����������*�*��������";
        text2 =text2.replace("&"," ");
        System.out.println(text2);
        text2 =text2.replace("*"," ");
        System.out.println(text2);
        System.out.println(" ");


        System.out.println("������ 4 �������� ���� ���� ������");
        System.out.println(" ������� ���� e mail");
        String email=scanner.nextLine();//��� �����


        for (int i = 0; i <email.length(); i++) {
            // �������� ������� ������ @
            //indexOf ���������� ������ ������� � int, ���� �� ������, ����� -1


            //e��� ������ �� ������ indexOf �������� � ������ F4 (��� �������� ����), ����� ��������� ����� String,
            //� � ������ ��� ������� ����� �����������, ���������� ������ ������. ������ indexOf('@') � indexOf("@") ������
            int indexOfDog=email.indexOf('@');
            //���� ������ ��� �� ������ -1
            if (indexOfDog == -1){//��� ������
                System.out.println("����� �� �������� @");
                return;

            }
            //���� ������ ����
            // ���� ������ ������ ��� 1

            //����� split ����� �� "�������" ��� �� "����� ��� �����"
            String[]partsByDog =email.split("@");////ggggg@mail.ru [ggggg][mail.ru]
            //���� @ ���� ������ �� ���� �������� 0 � 1, � ���� �� ���, ��... (�������� debug)

            if(partsByDog.length !=2){
                System.out.println("����� �������� ����� ����� ������");
              return;

            }
            ////�������� ����� � ����� �� ����� ���������� ��� ������������� ������� (.fffff.@.fffff.ff.)
            //        //������ startsWith � endsWith


            char wordStart ='.';

//
//            String word = String.valueOf(email.startsWith("."));
//                if(email.equals(word)){
//                    System.out.println("����� �������� ����� ");
//                         return;
//    }

            String partBeforeDog = partsByDog[0];//[123]
            String partAfterDog =  partsByDog[1];//[mail.ru]

            if (partBeforeDog.startsWith(".")||partBeforeDog.endsWith(".") ){//���� �� � partBeforeDog  �����
                System.out.println("���� ����������  � ������������� � ����� �� ������");
                return;
            }
            if(partAfterDog.startsWith(".")||partAfterDog.endsWith(".") ){//���� �� � partAfterDog �����
                System.out.println("���� �������������  ������ ����� ������");
                return;
            }
            System.out.println("����� ������ ��������");


        }

    }

}
