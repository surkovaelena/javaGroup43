package les_05;

public class Main_array {
    public static void main(String[] args) {

//������� �������� ������� ����� � ���������� ����������

        int[] numbers = {56,5,567,45,8,6};

        System.out.println("������ ������� ��� �����");
        System.out.println(numbers[0]);// 0 ������ ������ 56
        System.out.println(numbers[0] + ","+ numbers);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);


        System.out.println("������ � ������");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+",");


            }
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[j]+",");
        }

        System.out.println("������ 3. ���������� ������ � ��������: ������ ������ ����� �������");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + ",");
            }
        }


        // ������� �������� �������������� ������� � ��������� ���������� �����

        //int[] numbers = {56,5,567,45,8,6};
        int[] numbers2 = new int[6]; //int[] numbers = {0,0,0,0,0,0};
        int[] numbers3 = new int[numbers.length]; //������
        numbers2[0]=5;//int[] numbers = {5,0,0,0,0,0};
        numbers2[1]=10; //int[] numbers = {5,10,0,0,0,0};
        numbers2[2]=15; //int[] numbers = {5,10,15,0,0,0};
        numbers2[3]=20; //int[] numbers = {5,10,15,20,0,0};
        numbers2[4]=25; //int[] numbers = {0,0,0,0,0,25,0};
        numbers2[5]=35; //int[] numbers = {0,0,0,0,0,25,35};



        System.out.println("���������� ������� � ������� �����");
     int[] numbers4 =new int[6];

     int value =5;
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = value;
            value +=5;

            System.out.println(numbers4[i]);
        }
        System.out.println("----------");
        for (int i = 0; i < numbers4.length; i++) {
            System.out.println(numbers4[i]+ ",");
        }
        System.out.println();

        System.out.println("������ 6 char ���������� ������� � ������� ����� for each");
            char[] symbols = {'f', 'g', 'a','p'};
        for (char var:symbols) {
            System.out.print(var +",");


        }

    }


    }


