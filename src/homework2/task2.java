package homework2;

public class task2 {
    
    //�������� �������
    //������ 1. ������� ������ ������ � �������, ���� ���� ����� ������ 1,5 � 2,5 � ������� 5 � 7

    //������ 2. ���������� ����� ������ �� ������� ������: Lexus LX 23 ���.�, Lexus NX 7 ���.�., Lada Niva 2 ���.�.,\n" +
    //                "���� � ������� ���� 100 �.�., �������� 150 �.�., ������� 75 �.�., � ������ �� ������ 60 �������.
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double ploshad = a*b;

        double c =1.5;
        double d = 2.5;
        double ploshad1 = c* d;

        int count = (int) (ploshad / ploshad1);

        System.out.println( count);

        System.out.println("--------------------------------------------");

        int save = 100000;
        int salary = 150000;
        int pay = 75000;
        int time =60;

        int saveMoh = save +(salary - pay)* 60;
        if (saveMoh>= 23000000) {
            System.out.println("���� ������ Lexus LX");
        }else
            if(saveMoh>=7000000 && saveMoh<23000000){
                System.out.println("���� ������ Lexus NX");
            }else if (saveMoh>=2000000 && saveMoh< 7000000) {
                System.out.println("���� ������ Lada Niva");
            }else {
                System.out.println("����� ������ ���");
            }


    }


}
