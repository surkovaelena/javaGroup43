package lec_06;

public class Main_hw5 {
    public static void main(String[] args) {
        System.out.println("\n��� ������ ����� ����� � ��� ���� ����� �����. ������� ��� ��������� ����� ����� �� �������" +
                " (��������� ���� �� ������");
        int[] numbers = {10, 12, 10, 15, 14, 10};
        int numb = 10;

        //1 ����� ������ --�������� count
        int count =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numb)
                count++;
                  }

        //2 ������� ����� ������ �� ��� ����� ��� 10
           int[] newNum = new int[count];
            for (int j = 0; j <numbers.length ; j++) {/// ������ ����  �� ����� ������� numbers
                if(numbers[j] != numb) {
                    for (int i = 0; i < newNum.length; i++) {/// ��������� ���� �� ����� �������� newNum
                        if (newNum[i] == 0) {

                            newNum[i] = numbers[j];//������ ����� �� 10 �� ����� ������
                            break;
                        }
                    }
                }
                }
                               System.out.println();
        numbers =newNum;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            }

        }



