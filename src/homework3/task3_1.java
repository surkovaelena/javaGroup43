package homework3;

public class task3_1 {
    public static void main(String[] args) {
        System.out.println("\n��� ������ ����� ����� � ��� ���� ����� �����. ������� ��� ��������� ����� ����� �� �������" +
                " (��������� ���� �� ������");

        //�������� ������ -���������
        int[] numbers = {10, 12, 10, 15, 14, 10, 5};
        int numb = 10;
        int summa = 0;

//        ���������� ����� ����� ����� ����� ������
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != numb) {

                summa++;//����� 4
            }
        }
//   ������� ����� ������
        int[] massiv = new int[summa];

        int count1 = 0;
        for (int j = 0; j < numbers.length; j++) {

//                count1 = numbers[j];
//                count1 = numbers[j++];

            if (numbers[j] != numb) {
                massiv[count1] = numbers[j];
                count1++;


            }



        }
        numbers = massiv;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }


    }
}