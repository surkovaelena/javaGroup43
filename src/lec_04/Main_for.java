package lec_04;

public class Main_for {

    public static void main(String[] args) {
        //������� ����� 5 ���
//        System.out.println("������!");
//        System.out.println("������!");
//        System.out.println("������!");
//        System.out.println("������!");
//        System.out.println("������!");


        for(int i=0;i<5;i++) {
            System.out.println("������!");
        }
            System.out.println("���������� ������  ����� � ��������� �� 0 �� 250");
        for (int i =0; i<= 250; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
            System.out.println("���������� �������� � ��������� �� 0 �� 250");
        for (int i =0; i<= 250; i++){
            if(i % 2 !=0) {
                System.out.print(i);
            }
        }

        System.out.println("���������� ����� � ��������� �� 100 �� 150 ������� ������� �� 3 � 5 ������������");
        for (int i= 100; i<=150;i++){
            if((i% 3==0)&&(i%5==0)){
                System.out.println(i +";");
            }
        }

        System.out.println("��������� ����� ����� � ��������� �� 10 �� 15");
        int summa = 0;
        for (int i = 10; i <=15; i++) {
//           summa =summa + i;
           summa += i;
            System.out.print(i+ "."+summa+";");

        }
        System.out.println("�����"+summa+";");


        System.out.println("������� ����� � ��������� �� 20 �� 0");
        for (int i = 20; i > 0; i--) {
            System.out.println(i +";");

        }

        System.out.println("������� ����� � ���� �� 10 �� 40. ��������� �������� �� 15 �� 20");
        for (int i = 10; i <=40 ; i++) {
            if (i<15 || i>20){
                System.out.println(i + ";");
            }

        }
        System.out.println("7. ������� �� ������� ����� ������ �����  �� 10 �� 50");

        for (int i = 10; i < 50; i++) {
            if (i %2==0){
                System.out.println(i + ";");
            }

        }
    }
}
