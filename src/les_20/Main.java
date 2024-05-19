package les_20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ///������� ������ � ��������� ��������� ��������
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        System.out.println("1.��������� ����-���ArrayList "+ numbers);
        System.out.println();

        //����� add  ������� ������ 0 � �������� 99 ����� ���������� ����� ���� ��������
        // �� ���� ������
        numbers.add(0,99);
        System.out.println("2. C�������� ���-��� " +numbers);
        System.out.println();
// ����� add ������� ������ 2 � �������� 99 ����� ������ ����� �� ������� 2
// ���� �������� �� ���� ������ ������
        numbers.add(2,99);
        System.out.println("3. C�������� ���-��� " +numbers);
        System.out.println();
        //4 ����� set  ������� ������ 2 � �������� 88 ����� ����� ��������� 99 �� 88
        numbers.set(2,88);
        System.out.println("4. C�������� ���-��� " +numbers);
        System.out.println();
        //5 ��� ������ �������� � �� ������ ����� ����� ������
        System.out.println("5. ��� ������ � �� ������������ ������ ����� ������: ");
        try {
            numbers.set(20,7);
        }catch (IndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("   ����� �� ������� ArrayList: IndexOutOfBoundsException");
        }
        System.out.println();
//6. ����� size() - ���������� ���������� ��������� � ���������
        System.out.print("6. ����� size() - ���������� ���������� ��������� � ���������: ");
        System.out.println(numbers.size());
        System.out.println();

        //7. ����� get() - ���������� �������� �� �������
        System.out.print("7. ����� get() - ���������� �������� �� ������� 2: ");
        System.out.println(numbers.get(2));
        System.out.println();

        //8. ����� toArray() - ������� ������������� ��������� � ������
        System.out.print("8. ����� toArray() - ������� ������������� ��������� � ������: ");
        Object[] obj = numbers.toArray();
        for(Object v :obj){
            System.out.print(v + "; ");
        }
        System.out.println();
//9. ����� contains() - ����� �������� � ���������, �������� 81:
        System.out.println("9. ����� contains() - ����� �������� � ���������, �������� 81: " + numbers.contains(81));
        System.out.println();
        //10. ����� addAll - �������� ��� �������� � ��������� �� ������ ���������
        System.out.println("10. ����� addAll - �������� ��� �������� � ��������� �� ������ ���������");
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(numbers);
        System.out.println("    � ����� ��������� numbers2 ��������� ��������: " + numbers2);
//11 ����� remove(int index) - ������� �� ������� 2
        System.out.print("11. ����� remove(int index) - ������� �� ������� 2: ");
        numbers.remove(2);
        System.out.println(numbers);

        //12. ����� isEmpty() - boolean ������ �� ���������:
        ArrayList<String> emptyArray = new ArrayList<String>();
        System.out.println("12. ����� isEmpty() - boolean ������ �� ��������� emptyArray: " + emptyArray.isEmpty());
        System.out.println();
        //13. ����� clear() - ������� ��� �������� ���������
        System.out.println("13. ����� clear() - ������� ��� �������� ���������, numbers2 �� ��������: " + numbers2.size());
        numbers2.clear();
        System.out.println("    � ��������� numbers2 ���������� ��������� ����� ��������: " + numbers2.size());
    }
}
