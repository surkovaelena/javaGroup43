package les_17;

import java.util.Random;

public class RockPaperScissors {
    //pole
    //constryctor

    public RockPaperScissors() {
    }

    //metod
    public void gameCheck(int subj) {
        if (subj==1){
            System.out.println("�� ������� ������");
        }else if (subj==2){
            System.out.println("�� ������� �������");
        }else if (subj==3){
            System.out.println("�� ������� ������");
        }else {
            System.out.println("�� ����������� ������� �����");
//            System.exit(0);//����� ���������� �� ���������� ��� ��������

        }
    }

    public void addSubjPC(int subj) {

        Random random =new Random();
        int result = random.nextInt(3)+1;//random.nextInt(1,4)
        if(result==1 && subj!=1 && subj!=3){
            System.out.println("�� ��������. ������ ���� �������");
        }else if(result==2&& subj!=2&&subj!=1){
            System.out.println("�� �������� ������� ����� ������");
        }else if(result==subj){
            System.out.println("�����");
        }else if (result==3&& subj!=3&& subj!=2){
            System.out.println("�� �������� ������ ����� ������");
        }else if (result == 1 && subj == 3) {
            System.out.println("�� �������. ������ ����� ������ ");

        } else if (result == 2 && subj == 1) {
            System.out.println("�� �������. ������ ���� �������");

        } else if (result == 3 && subj == 2) {
            System.out.println("�� �������.������� ����� ������");

        } else
            System.out.println();
    }

    }

