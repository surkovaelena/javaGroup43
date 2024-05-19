package lec_9;

public class Main {
    public static void main(String[] args) {

        System.out.println("������ ������� equals() � equalsIgnoreCase()");
            String text1="Java";
            String text2="Java";
            String text3="JAVA";
        System.out.println(text1==text2);//��������� ���� ��� ���������� ������
        System.out.println(text1.equals(text2));//true
        System.out.println(text1.equals(text3));//false
        System.out.println(text1.equalsIgnoreCase(text3));//true


        System.out.println("����� regionMatches (int startIndex, String other, int otherStartIndex, int numChars) - ���������� �����\n" +
        "����� ��� ������� ����� this � other � ������ �������� ��������");
        String text4="Hello Java!";
        String text5="Java Hello!";

        System.out.println(text4.regionMatches(0,text5,5,5));;// true ��������� ���� ������ ������

        System.out.println("����� indexOf(int ch) ���������� ������ ������� ��������� � ������ ������� ch");

        String text6 = "Java";
        text6.indexOf('a');
        System.out.println(text6.indexOf('v'));//1 ������ ������� � ������  ����� � ""
        System.out.println(text6);

        System.out.println("\n����� lastIndexOf(int ch) ���������� ������ ���������� ��������� � ������ ������� ch");

        System.out.println(text6.lastIndexOf('a')); //3

        System.out.println("\n����� substring(int beginIndex) - ������� ����� ������ � ��������� ������� ");
        String str2 = "This lesson explains class String";
        System.out.println(str2.substring(5));      //lesson explains class String
        System.out.println(str2.substring(5, 11));   //lesson

        System.out.println("\n������ 1. �� ������ ���������+������=��������� �������� ������ ���������=���������-������");
        String source = "���������+������=���������"; //source - ��������
        int p1 = source.indexOf('+'); // ���������� ������� ������� '+�
        int p2 = source.indexOf('='); // ���������� ������� ������� '=�
        String alg = source.substring(0, p1);// �������� ������ �����
        String dat = source.substring(p1 + 1, p2);// �������� ������ �����
        String prg = source.substring(p2 + 1);// �������� ������ �����
        String target = alg + "=" + prg + "-" + dat;// ������� ��� ��-������. target - ����
        System.out.println(source);     //It was: ���������+������=���������
        System.out.println(target);  //Has become: ���������=���������-������

        System.out.println("\n������ 2. �� ������ �������� ��� ������� ����� � ��������� �� � ������");
        String str3 = "Some text in English";

        char[]str3Array= str3.toCharArray();


        //����� �������� ������, ����� ������� ��������� ����� ������
        int countGlass = 0;
        for (char ch : str3.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y'||  ch == 'u'||  ch == 'o' || ch == 'i'||
            ch == 'A' || ch == 'E' || ch == 'Y'||  ch == 'U' || ch == 'O' || ch == 'I') {
                countGlass++;
            }
        }

        //������� ������ � �������� ��������� ���
        char[] glassChar = new char[countGlass];
        int currentIndex = 0;
        for (char ch : str3.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o'||  ch == 'i'||
            ch == 'A' || ch == 'E'||  ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {
                glassChar[currentIndex] = ch;
                currentIndex++;
            }
        }
        System.out.println(glassChar);

        System.out.println("\n������ 3. ��������� �������� ������� ���� � �����������");
        String text = "��������! ��� �� ���������. �� ��������, �� ������������. �� ��� ��� ��������";
        String[] words = text.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
