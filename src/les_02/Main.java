package les_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("���� ������ ������ �� 127�� ����� ������� 2��. ������� ����� ������");
        byte barbell = 127;
       //byte barbell2 = barbell +2;
       // barbell = barbell +2;
        barbell += 2;// ���� � ���� ���  barbell = barbell +2;

        System.out.println("��� ������"+barbell );
        System.out.println("������ ��������� ������� ��� �����");
        int money = 5;
        int payWindow = 2;
        //int moneyInOnePayWindow =money / payWindow; //5._/2._=2._ ������� ����� 2 ��� 2.0 ���� float
        //float moneyInOnePayWindow = (money / payWindow);
        float moneyInOnePayWindow =(float)money / payWindow;

        System.out.println("����� � ����� �����:"+ moneyInOnePayWindow);

        System.out.println("���� ��� ����� 10 � 3. �������� �������� float  � ������");
    float a =(float) 10/3;
    double b =(double) 10/3;
    float d = 10.0f/3;
        System.out.println("�������� ����� float:"+ a+ "\n �������� ����� double:"+b);
        System.out.println(10.00/3.00);
        System.out.println(d);

        char symbol ='s';
        String str =" ��������";// String F4(����������� � ����������) ��������� ��������. str ������ ����������
//ASCII

        char symbolCode = 115;
        System.out.println(symbolCode);
        System.out.println(symbol + " -���� �����- " + symbolCode);

        System.out.println("���� 10 ������� ����� � 5 ��������. " +
                "������: ����� �� ��� ������� ����� ������ ��� ��������");
        int redApple=10, greenApple=55;
        boolean result = redApple > greenApple;
        System.out.println("�����������: " + result);
/**
�������������� ���������:
        "+", "-", "/", "*",
        "++" ��������� (���������� �� 1),  i=1 i=i+1 i++  �++ ����������� �����, ++� ���������� �����,
        "--" ��������� (��������� �� 1), �-- ����������� �����, --� ���������� �����,
        "%" ������� �������������� ������� ��� ������� �� ������,// 5 ����� ��������� �� �� 3 ����� �� ������ �������� 5%3=2

                �������������� �������� � �������������:
        +=   �������� � �������������
        -=     ��������� � �������������
         *=     ��������� � �������������
        /=     ������� � �������������
         %=     ������� �� ������ � �������������
                */

        /**��������� ���������:

        "==" �����,
         "!=" �� �����,
        ">" ������,
         "<" ������,
         ">=" ������ ��� �����,
         "<=" ������ ��� �����,
         */

        /**���������� ���������:
        "&&" �������� �,
        "||" �������� ���,

         &  ���������� �������� � (AND) ��� ����������.
        AND (&) - ��������� ����� true, ������ ���� � A, � B ����� true.
         ������: ��� ���� ����� ������� ����������, � ������� (A) � ����� (B) ������ ������� �� ��������������,
         ����� ��� �� ���������.

         |  ���������� �������� ��� (OR) ��� ����������.
         OR (|) - ��������� ����� true, ���� ���� �� ���� �������� ����� true. ������: ��� ����, ����� �������
        ������� �� ������, ������ ������ ���� ����, ���� ����, ���� ��� - � ����� ������ ��������� �����
        �������������. ���� �� ����� �� ������, ������� �� ������� - ��������� ����� �������������.

         ^  ���������� �������� ����������� ��� (XOR).
         XOR (^) - ��������� ����� true, ������ ���� ��� A ����� true, ��� � ����� true. ������: � ���� ������ ��
        ����� ���� ���������, ������� �� ���������� ��������� ������ ���� ���� �� ��� ������ �� ���. ������ ���
        ����� �� �����.

        !  ���������� ������� �������� �� (NOT).
         NOT (!) - �������������� ��������. ���� �������� ���� true, �� ������ false, � ��������.

         || ����������� ���������� �������� ��� (short-circuit)
         && ����������� ���������� �������� � (short-circuit)

         &= ���������� �������� � � �������������
         |= ���������� �������� ��� � �������������
         ^= ���������� �������� ����������� ��� � �������������

        ���� ����� � ����� Java ������������ ��� ���������� ����������� ���������� ��������� (short-circuit):
         ||   -  ����������� ���������� �������� ���
         &&  - ����������� ���������� �������� �
        ������ ������� ����������� �������� ����������� ������ � ��� ������, ���� �� ���� ������� ��������� ��������,
         �� ���� ���� ����� ������� ���������� ����� �������� true, ��� ����� ������� ���������� ����� �������� false.
         � ���������� ������������ ����� Java ����������� ���������� �������� ���������� ���������.
         � ��������� ������� ������ ������� ����������� ��������� ����������� �� �����, ��� ��� ������� num8!=0
        �� ����������� � ��� ������ ������ ��������� ��� ���������:
         */

        System.out.println("������ ������� � ��������  �� ��� �������� ������ ");
        double cash =1500; // ��������
        double priceOfPizza =230;  //���� �����
        double priceOfGum =26;  ///���� ������
        double priceOfCondies =2.5; // ���� ������
                //������� ����� �����
        int countOfPizza = (int) (cash/ priceOfPizza);
        System.out.println(" �����: "+ countOfPizza + "��");
        //����� ����� ������� �����
        double balanceOfPizza = cash % priceOfPizza;
        // ���� ����� ��� � double balanceAfPizza = cash -(priceOfPizza +countOfPizza);
        System.out.println(" �����: "+ balanceOfPizza + "���");

        //������� ����� ������
        int countOfGum = (int) (balanceOfPizza/ priceOfGum);
        System.out.println(" �����: "+ countOfGum + "��");
        //����� ����� ������
        double balanceOfGum = balanceOfPizza % priceOfGum;
        System.out.println(" �����: "+ balanceOfGum + "���");

        //������� ����� ������
        int countOfCondies = (int) (balanceOfGum/ priceOfCondies);
        System.out.println(" �����: "+ countOfCondies + "��");
        //����� ����� ������
        double balanceOfCodies = balanceOfGum % priceOfCondies;
        System.out.println(" �����: "+ balanceOfCodies + "���");
    }
}
