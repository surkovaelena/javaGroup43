package homework3;

public class task3 {
    public static void main(String[] args) {
        System.out.println("\n��� ������ ����� ����� � ��� ���� ����� �����. ������� ��� ��������� ����� ����� �� �������" +
                " (��������� ���� �� ������");

        int[] numbers = {10, 12, 10, 15, 14, 10};
        int numb = 10;

        for (int i = 0; i < numbers.length; i++) {

            int summa = 0;

            for (int k = 0; k < numbers.length; k++) {

                if (numbers[k] == numb) {

                    summa = summa + 1;


                }
            }

            int num1 = summa;


//            int num1 = numbers.length;

            int[] massiv = new int[num1];

            int count = 0;

            for (int j = 0; j < massiv.length; j++) {

                count = numbers[i];
                count = numbers[i++];
                if (count != numb) {


                    massiv[j] = count;

                } else massiv[j] = count + count;

                System.out.println(massiv[j]);
            }
        }

    }
}
