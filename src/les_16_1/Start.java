package les_16_1;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //������� ����� ����
        SapperGame sapperGame = new SapperGame();

        System.out.println("������ ������� ���������:");
        System.out.println("1 - �������");
        System.out.println("2 - ������");
        System.out.println("3 - ������");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt(); //�������� ������� ���������

        //����� ����� ��� ��������� ����, � ����������� �� ������ ���������
        sapperGame.bombsByLevel(level);

        //���������� ����� ������ ���� ��� ������������
        sapperGame.placeHelpNumberOnMap();

        //������� ����� � �������
        sapperGame.printMapGame();

        //����� ���� ����
        int check = 1;
        while (check >= 1){ //1 � 2 ���� ����� ��������, � -1 ����� ���� ���� �����, ���� �������
            System.out.println("�������� ���������� � �� 1 �� 10");
            int pointX = scanner.nextInt()-1;
            System.out.println("�������� ���������� Y �� 1 �� 10");
            int pointY = scanner.nextInt()-1;

            //�������� �� ������ �� �������
            if(pointX > 9 || pointY > 9 || pointX < 0 || pointY < 0){
                System.out.println("�� ����� �� ������� ����!");
                continue; //������ while
            }

            check = sapperGame.checkPointPlayrs(pointY, pointX);
            if(check == 2){
                System.out.println("�� ��� ������� ������ ����������, ������� ��� ���");
            } else if(check == 1){
                sapperGame.printMapGame();
                System.out.println("��������� ���");
            } else if (check == -1){
                sapperGame.printMapGameOver();
                System.out.println("�����! �� ���������!!!");
            } else  {
                System.out.println("���������� �� ��������!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }

        //1. ������ ������ ���� ���������
        //2. �������� �������� ������� � ������ �������



    }
}
