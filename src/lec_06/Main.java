package lec_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("������ 1. ������ ������� ��� ��������� ������ �����.");
        System.out.println("������� ������ ���� :");
        System.out.println("1-����");
        System.out.println("2-����");
        System.out.println("3-�������");
        System.out.println("4-����������");
        System.out.println("5-��������");

        //int number =5;
//int [] arrayNew = new int [x];
        Scanner scanner1 = new Scanner(System.in);//������� ������ ���� ������ � ������ scanner1
        int inputvalue1= scanner1.nextInt(); // �� ���������� ����� �������� ������� � ���� �� ������� enter/ ����� ������

if (inputvalue1<=5){
        System.out.println("��� ����������");
        System.out.println("1-�������");
        System.out.println("2- ��������");

       int inputvalue2 =scanner1.nextInt();// ����� �� ��� �������
if(inputvalue2<=2) {
    //�������
    switch (inputvalue1) {
        case 1:// ����
            System.out.println("������� ������");
            int inputRadius = scanner1.nextInt();
            if (inputvalue2 == 1) {
                System.out.println("������� ����� = " + ((inputRadius * inputRadius) * Math.PI)); // ���� �������
            } else if (inputvalue2 == 2) {
                System.out.println(" ���������� =" + (inputRadius * 2 * Math.PI));
            }
            break;

        case 2: // ����

            System.out.println("������� ������1");
            int inputRadius1 = scanner1.nextInt();
            System.out.println("������� ������2");
            int inputRadius2 = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("������� ����� = " + ((inputRadius1 * inputRadius2) * Math.PI)); // ���� �������
            } else if (inputvalue2 == 2) {
                System.out.println(" ���������� ����� =" + (Math.PI * 2 * Math.sqrt((Math.pow(inputRadius1, 2) + Math.pow(inputRadius2, 2)) / 2)));
            }
            break;
        case 3: // �������
            System.out.println("������� �������");
            int inputside = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("������� �������� = " + (Math.pow(inputside, 2))); // ���� �������
            } else if (inputvalue2 == 2) {
                System.out.println(" �������� ��������  =" + (inputside * 4));
            }
            break;

        case 4: // �����������
            System.out.println("������� ���������");
            int inputbase = scanner1.nextInt();

            if (inputvalue2 == 1) {
                System.out.println("������� ������");
                int inputtall = scanner1.nextInt();
                System.out.println("������� ������������ = " + ((inputbase * inputtall) / 2)); // ���� �������
            } else if (inputvalue2 == 2) {
                System.out.println("������� ������� 1");
                int inputside1 = scanner1.nextInt();
                System.out.println("������� �������� 2");
                int inputside2 = scanner1.nextInt();
                System.out.println(" �������� ������������  =" + (inputbase + inputside1 + inputside2));
            }
            break;

        case 5: // ��������

            System.out.println("������� ���������1");
            int inputbase1 = scanner1.nextInt();
            System.out.println("������� ���������2");
            int inputbase2 = scanner1.nextInt();
            if (inputvalue2 == 1) {
                System.out.println("������� ������");
                int inputtall = scanner1.nextInt();
                System.out.println("������� �������� = " + ((inputbase1 + inputbase2) / 2 * inputtall)); // ���� �������
            } else if (inputvalue2 == 2) {
                System.out.println("������� ������� 1");
                int inputside1 = scanner1.nextInt();
                System.out.println("������� �������� 2");
                int inputside2 = scanner1.nextInt();

                System.out.println(" �������� �������� =" + (inputbase1 + inputbase2 + inputside1 + inputside2));
            }

            break;

        default:
            System.out.println("����� ������ ���");
    }
}else System.out.println("������");
        }else System.out.println("����� ������ ���");
    }
}
