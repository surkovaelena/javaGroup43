package lec_10;

public class Main {

    public static void main(String[] args) {
        int[][] numbers1 = {{1, 2, 5},
                {4, 6, 8},
                {6, 3, 7}};

        int[][] numbers2 = {{15, 24, 53, 45},
                {44, 46, 84, 54},
                {36, 33, 47, 98}};

        System.out.println("����� 1. �������� �� ������� ���������� ������� ����� �����");

        MassiveUtils.pritMassivToConsole(numbers1);
        MassiveUtils.pritMassivToConsole(numbers2);

//        MassiveUtils name= new MassiveUtils();
//        name.pritMassivToConsole
//  ����.��������()  ------- ��� ������ �����  ��� ���
//       ���� ���� = new ����();  ��� ������
//    ����.��������(eng); ��� ����� ������ �� ���������� � �������

        System.out.println("//����� 2. ������� ���������� ������ ����� � ��������� ������� ����� �����");
   int count1 =MassiveUtils.countEvenNumbers(numbers1);
        int count2= MassiveUtils.countEvenNumbers(numbers2);
        System.out.println(count1);
        System.out.println(count2);

        System.out.println("����� 3. �������� ������� ������� �� ����� ������");
        String text= "Some text in English";
        char[] arraySymbols = MassiveUtils.charGlassFromText(text);
        System.out.println(arraySymbols);


    }


}
