package les_17;

import java.util.Scanner;

public class StartGame {
    //pole
    //consr
    //metod
    public static void main(String[] args) {

        //1 ������� ����
        RockPaperScissors game = new RockPaperScissors();
        //2 �������� � ������������ ���
        System.out.println("��������: ");
        System.out.println("1- ������ ");
        System.out.println("2 - ������� ");
        System.out.println("3 - ������");
        Scanner scanner = new Scanner(System.in);

        int subj = scanner.nextInt();
        //3 ���������� � ������� ����� ������������
        game.gameCheck(subj);
        //4 ����� ����������

//        System.exit(0);  ��������� ���������

        game.addSubjPC(subj);
    }

}
