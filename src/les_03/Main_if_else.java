package les_03;

public class Main_if_else {
    public static void main(String[] args) {
        System.out.println("������� ����� ������� ������� �� ������");
        int mark = 3;
//     if(     ){
//
//     }
//        if(mark == 5){
//            System.out.println("�������!");
//        } else if (mark == 4) {
//            System.out.println("������!");
//        } else if (mark == 3) {
//            System.out.println("����� �����������");
//        }else if (mark== 2){
//            System.out.println("��� ����������!");
//        }else {
//            System.out.println("�������� �����");
//        }

//        switch (mark){
//            case 5:
//                System.out.println("�������");
//                break;
//            case 4:
//                System.out.println("������");
//                break;
//            case 3:
//                System.out.println("�������� ��� ���");
//                break;
//
//            case 2:
//                System.out.println("��� ����������!");
//                break;
//            default:
//                System.out.println("��������� �����!");
//        }
        System.out.println("����� ���� ��������� if  ��� else");
        int num1 = 0;
        int num2 = 10;
        if((num1 !=0) &&((num2 /num1)>=10)){
            System.out.println("��������� ���� If");
        }else {
            System.out.println("��������� ���� else");
        }
        System.out.println("����� �, ��� ������ ���� � ��������� ����� � � �");
        int a = 1;
        int b = 3;
        int x = 2;
        System.out.println("����� � ��������� ����� � � �? :" +(a < x && x<b));
        boolean result = (a<x && x<b);
        System.out.println(result);


        System.out.println("������. ��������� ������ �� �� ������� � ���?" +
                "����: ��������� ���� (tourPrice) 40��. \" +\n" +
        "\"���������� (cash) 20��. " +
                "�������� (monthlySalary) 100��." +
                 "������� �� ����������� (monthsBeforeTheTrip) 5.\" + \n" +
                "\"����������� ������� (monthlyExpenses) 7.5��.");
        // ����
        int tourPrice = 40000;
        int cash  = 20000;
        int monSallary = 100000;
        int monBefTrip = 5;
        int monExpe = 7500;
        //�������
        //1������ �������
        int monProfit =monSallary -monExpe;
        //2 ������� �������
        int accMon = monProfit* monBefTrip;
        //3 �������� ������ �� ��� ����� �� �����������
        if((accMon+cash)>tourPrice){
            System.out.println("��� ���� � ������ b ����!");
        }else if((accMon+cash)==tourPrice) {
            System.out.println("��� ���� � ������ b ����!");
        }  else{
            System.out.println("��� ���� ��� ����������!");
        }

    }

    }

