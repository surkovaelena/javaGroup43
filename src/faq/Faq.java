package faq;

public class Faq {
    /**
     * ������� �������
     * �������������� ���� ctrl alt l
     * ������� ����������� ctrl /
     * ��������� �������� alt+shift+ ��� �� ����
     * �������� ��� shift+Tab
     * fori ������� �������� ���������� for
     * */
    /**
     * ���� ������:
     *          - ����������� ���� (8 �����) - � ��������� �����;
     *          ������������� (�������� �� ��������� 0):
     *          byte - 8 bits (1 bytes), 2 � 8-� �������, �������� ����� �� -128 �� 127
     *          short - 16 bits (2 bytes), 2 � 16-� �������, �������� ����� �� -32 768 �� 32 767
     *          int - 32 bits (4 bytes), 2 � 32-� �������, �������� ����� �� -2 147 483 648 �� 2 147 483 647 (���������)
     *          long - 64 bits (8 bytes), 2 � 64-� �������, �������� ����� �� -9 223 372 036 854 775 808 �� 9 223 372 036 854 775 807 (������������)
     *
     *          ������� ��� "� ��������� ������" (�������� �� ��������� 0):
     *          float - 32 bits (4 bytes), 3.4*10^38, �������� ����� ������� 7 ����, {1 bits - ����, 8 bits - �������, 23 bits - ��������}
     *          double - 64 bits (8 bytes), 1.7*10^307, �������� ����� ������� 15 ����
     *
     *          ���������� ���:
     *          boolean - 1 bits (1 bytes), ��������� ��� �������� False (����) ��� True (������)
     *
     *          ���������� ���:
     *          char - 16 bits (2 bytes), ������� �������� ASCII
     *
     *
     *          - ��������� ���� (���������� �����) - � ������� �����
     *          1. ��������� ���� �� JDK (�����������);
     *          2. ��������� ���� ��������� �������������;
     *          3. ��������� ���� �� ��������� ��������� ������� ��������������;
     *
     *          var - https://skillbox.ru/media/base/klyuchevoe-slovo-var-v-java/ ������� ������������� ����������� ����
     * */
    /**�������������� ���������:
            "+", "-", "/", "*",
            "++" ��������� (���������� �� 1), �++ ����������� �����, ++� ���������� �����,
            "--" ��������� (��������� �� 1), �-- ����������� �����, --� ���������� �����,
            "%" ������� �������������� ������� ��� ������� �� ������,

    �������������� �������� � �������������:
            +=   �������� � �������������
         -=     ��������� � �������������
         *=     ��������� � �������������
         /=     ������� � �������������
         %=     ������� �� ������ � �������������
         /

                 /��������� ���������:

            "==" �����,
            "!=" �� �����,
         ">" ������,
            "<" ������,
            ">=" ������ ��� �����,
            "<=" ������ ��� �����,
            /

            /���������� ���������:
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

    /**������� ����������� ������ cntrl d*/
/**
 * psvm public static void main(String[] arg
 * sout- System.out.println();*/

/**����������� if
 if (���� ������ ������� ��) {
 ����� ����������� ���� � ����� 1
 } else if (���� ������ ������� ��) {
 ����� ����������� ���� � ����� 2
 } else {
 �� ���� ������ �������� ����������� ���� � ����� 3
 }
 */
/**����������� Switch
 switch(��������3){
 case ��������1:
 ������������� ���;
 break; //��������� switch
 case ��������2:
 ������������� ���;
 break; //��������� switch
 case ��������3:
 ������������� ���;
 break; //��������� switch
 default:
 ������������� ���, ���� �������� �� ������;
 }
 */
/**
 * ������� �������
 * �������������� ���� Ctrl+Alt+L
 * ������� ����������� Ctrl+/
 * ������� ����������� ������ ��� ��������� Ctrl+D
 * ��������� �������� Alt+Shift+���
 * �������� Tab Shift+Tab
 *
 * ��������������:*
 * Ctr + Z  Undo, �������� ��������� ��������
 * Ctr + Shift + Z  Redo, �������� ��������� ������ ��������
 * Ctr + Shift + V  ����������� ������� �� ������ ������ (� ��������)
 * Ctr (+ Shift) + W  ��������������� ��������� ���������
 * Ctr + �����/������  ����������� ����� �������
 * Ctr + �����/����  ��������� ���� ��� ��������� ������� �������
 * Ctr + Home/End  ������� � ������/����� �����
 * Shift + Del (Ctr + Y)  �������� ������, ������� � ���, ��� ����� �������� ������
 * Ctr + Del  ������� �� ������� ������� �� ����� �����
 * Ctr + Backspace  ������� �� ������� ������� �� ������ �����
 * Ctr + D  ����������� ������� ������
 * Tab / Shift + Tab  ��������� / ��������� ������� ������
 * Ctr + Alt + I  ������������ �������� � ����
 * Ctr + Alt + L  ���������� ���� � ������������ code style
 * Ctr + /  ����������������/����������������� ������� ������
 * Ctr + Shift + /  ����������������/����������������� ���������� ���
 * Ctr + -/+  �������, ��������/����������
 * Ctr + Shift + -/+  �������, ��������/���������� ���
 * Ctr + Shift + .  ������� ������� ����� ������������� � �������� ���
 * Ctr + .  ������� ������� ����� ���������������
 * Ctr + R  ������ � ������
 * Ctr + Shift + R  ������ �� ���� ������
 *
 *
 * ����, �������:*
 * Alt + �����/������  ����������� ����� ���������
 * Ctr + F4  ������� �������
 * Alt + �������  ��������/�������� ���� Project, Structure, Changes � ��
 * Ctr + Tab  Switcher, ������������ ����� ��������� � ������
 * Shift + Esc  ������� �������� ����
 * F12  ������� ��������� �������� ����
 * Ctr + ��������  Zoom, ���� �� ��� ���� ��������
 *
 *
 * ��������:*
 * F11  ��������� ��� ����� ��������
 * Ctr + F11  ���������� � ����������� ����� ��� �����
 * Shift + F11  ������� � �������� (�������� � �������� Delete)
 * Ctr + �����  ������� ������� � �������� � ����������� ������
 *
 *
 * ��������� � ������������:*
 * Ctr + Q  ������������ � ����, �� ��� ������ ������
 * Ctr + Shift + I  �������� ���������� ������ ��� ������
 * Alt + Q  ���������� ��� ������ ��� ������, � ������� �� ���������
 * Ctr + P  ��������� �� ���������� ������
 * Ctr + F1  �������� �������� ������ ��� ��������
 * Alt + Enter  ��������, ��� ��� ���������� ���������
 *
 *
 * �����:*
 * ������ Shift  ������� ����� �� ����� �������
 * Ctr + Shift + A  ������� ����� �� ����������, ��������� � ��
 * Alt + ����/�����  ������� � ����������/����������� ������
 * Ctr + [ � Ctr + ]  ����������� � ������ � ����� �������� ������
 * Ctr + F  ����� � �����
 * Ctr + Shift + F  ����� �� ���� ������ (������� � F4)
 * Ctr + F3  ������ ����� ��� ��������
 * F3 / Shift + F3  ������ ������/�����
 * Ctr + G  ������� � ������ ��� ������:������_�������
 * Ctr + F12  ������ ������� � ��������� � �� ����������
 * Ctr + E  ������ ������� �������� ������ � ��������� � ���
 * Ctr + Shift + E  ������ ������� ���������� ������ � ��������� � ���
 * Ctr + H  �������� ������������ �������� ������ � ������� �� ���
 * Ctr + Alt + H  �������� ������� ���������� ������
 * Ctr + N  ������ ������ �� ����� � ������� � ����
 * Ctr + Shift + N  ����� ����� �� ����� � ������� � ����
 * Ctr + B  ������� � ���������� ����������, ������, ������
 * Ctr + Alt + B  ������� � ����������
 * Ctr + Shift + B  ���������� ��� � ������� � ��� ����������
 * Shift + Alt + �����  ����������� ����� �� ����� ������
 * Shift + Alt + ������  ����������� ������ �� ����� ������
 * F2 / Shift + F2  ������� � ��������� / ���������� ������
 * Shift + Alt + 7  ����� ��� �����, ��� ������������ ����� / ����������
 * Ctr + Alt + 7  ��� ���������� �����, ������ �� ����������� ����
 *
 *
 * ��������� ���� � �����������:*
 * Ctr + Space  ������ �����������
 * Ctr + Shift + Space  ����������� � ����������� �� ����������� ����
 * Alt + /  ������� ����������� �� ������, ������������� � �������
 * Ctr + I  ����������� ���������
 * Ctr + O  �������������� ����� ������������� ������
 * Ctr + J  ��������� ���������� ���� (����� �� ��������� � ��)
 * Ctr + Alt + J  �������� ���������� ��� � ���� �� ��������
 * Alt + Insert  ��������� ���� � ��������, ������������ � pom.xml � ��
 * Shift + F6  �������������� ����������, ������ � �� �� ���� ����
 * Ctr + F6  ��������� ��������� ������ �� ���� ����
 * F6  ����������� ������, ������ ��� ������
 * F5  ������� ����� ������, ����� ��� ��������
 * Shift + F5  ������� ����� ������ � ��� �� ������
 * Alt + Delete  ���������� �������� ������, ������ ��� ��������
 * Ctr + Alt + M  ��������� ������
 * Ctr + Alt + V  ��������� ����������
 * Ctr + Alt + F  ��������� ��������
 * Ctr + Alt + C  ��������� ��������� (public final static)
 * Ctr + Alt + P  ��������� ��������� ������
 * Ctr + Alt + N  ��������� ������, ����������, ��������� ��� ���������
 * Ctr + Alt + O  ����������� ��������
 *
 *
 * ������:*
 * Ctr + ~  ������� ������������ �������� �����, code style � ��
 * Alt + F12  �������/������� ��������
 * F10  ��������� ��������� ���������� ��������� ��� ����
 * Shift + F10  ��������� �������� � ��������� ��������� ��� ����
 * Shift + Alt + F10  ��������� ���-�� �� ������ ���� ��� ����������� ������
 * Ctr + F2  ���������� ���������
 * Ctr + Alt + A  �������� � ������� �������� ������
 * Ctr + K  ������� ������ � ������� �������� ������
 * Ctr + Shift + K  ������� ��� � ������� �������� ������
 * Ctr + Shift + P  � Scala-������� ���������� implicit ���������
 * Ctr + Shift + Q  � Scala-������� ���������� implicit ��������������
 *
 *
 * */

/**�����
    ����� - ��, ��� ���������� ����������� ��� ������������ ���-�� ���, ���� ����������� �������
    ��� ������� ������ � java: for foreach while

            for(���������;�������;��������){
        ���� �����
    }
 if �� ��� else � ���� ������� ���� ����� ��� {}
 if(������� ) /// ��� ���� true
 ------------------
 if(true){}
 for(�������������; �������; ��������){
  ���� �����
 }
 /for(1;2;3){         1, ����� 4,3,2, ����� 4,3,2, ����� 4,3,2 � ��� ���� 2=true, ���� false �� ����� �� �����
 System.out.println("���� ����� 4");
 }
 /
 */
/** ������� - ����������� ����������� �����
 ������ - ��� ������ ����������� �����. � ������ ����� �������� ������ ���������� ������.
 ������ ����� ������� �� 0 � ����, ������ �������� ������������ � ������ ������ �������  ������.

 /**���������� �� ���������, ����� ��� ��������
  * int - 0
  * double - 0.0
  * boolean - false
  * �c������� ���� - null
  * /

/** ����������� ����������� �����
    ������ - ��� ������ ����������� �����. � ������ ����� �������� ������ ���������� ������.
    ������ ����� ������� �� 0 � ����, ������ �������� ������������ � ������ ������ �������  ������.
 ���������� �� ���������, ����� ��� ��������
 int - 0
 double - 0.0
 boolean - false
 �c������� ���� - null

 /for each - ������, ���� ����� �������� ������ � ���� �� �����
 * � �� ������ ������ � ����� 1. ��� ���� �� ����� �������.
 * ��������, ����� ������ ������� �� ������� ��� �������� ������� �� 1 �� ����������
 for (���������� :��� �������){
 ����������� ���
 }
 /
         */
/**��������� ���� �� JDK (�����������):
 *          java.util - ��������� ������������ ��������
 *          java.time - ������ �� ��������
 *          java.text - ������ � �������
 *          java.sql - ������ � ����� ������
 *          java.security - ������ �� ������������
 *          java.io, java.nio - ����������� � ����������� ������
 *          java.math - �������������� �������
 *          java.lang - ����������� ����� ��� ������� ������������ ������ �� ������ � �����������,
 *          ����������, String � �.�. ����� � ����� ����� System.in � System.out
 *          java.net - ������ � �����
 *          java.awt - ������ ���������� ��������� ����������� ���������
 *          java.applet - ������ �������� � ������ ���������� ����� �������
 *          /
 *          �c������� ���� - null
 *      * /
 * /
 *          * ������ ������ String:
 *          *    int lenght() - ���������� ����� ������ (���������� �������� � ������);
 *          *
 *          *    String concat(String s) - ������������ ������ � ������ this. �������� ��� +;
 *          *
 *          *    String trim() - ������� ������� � ����������� ���������� ������� �� ������ this
 *          *                    ���������� �������: ' ', \r, \n, \t. ��������, ��� ����� ������ ������ ��������;
 *          *
 *          *    String replace(char original, char replacement) - �������� ��� ��������� ������� original ��������
 *          *                    replacement;
 *          *
 *          *    String toLowerCase() - �������� ������� �������� � ������, ����� ��� ����� ���������. ��������,
 *          *                    �������������� e-mail � ��������� ������ ������;
 *          *
 *          *    String toUpperCase() - �������� ������� �������� � ������, ����� ��� ����� ����������;
 *          *
 *          *    String replaceAll(String regex, String replacement) - �������� ��� ��������� regex �� replacement.
 *          *                    � �������� regex ����� ���� ���������� ���������. ��������, ���� ����� ������������
 *          *                    �� �������, ����� �� ���� ������ �������� ������� �� �����;
 *          *
 *          *    String replaceFirst(String regex, String replacement) - �������� ������ ��������� regex �� replacement.
 *          *                    � �������� regex ����� ���� ���������� ���������. ��������, ���� ������ � � ��� ���������
 *          *                    ���� � �������� ���� ������ ���� ���, ������ ����� ����� ������ �������� ������ ��
 *          *                    ��������� ����� �� ����� ������� ��������;
 *          *
 *          *    boolean equals(Object other) - ���������� ������������ ��������� ������ this �� ������� other � ������
 *          *                    �������� ��������. �������� == �������� ������ �� ����������� ����, ��� �������� ����
 *          *                    �������� equals;
 *          *
 *          *    boolean equalsIgnoreCase(String other) - ���������� ������������ ��������� ������ this �� ������� other
 *          *                    ��� ����� �������� ��������;
 *          *
 *          *   boolean regionMatches(int startIndex, String other, int otherStartIndex, int numChars) - ���������� �����
 *          *                    ����� ��� ������� ����� this � other � ������ �������� ��������;
 *          *
 *          *   boolean regionMatches(boolean ignoreCase, int startIndex, String other, int otherStartIndex, int numChars)
 *          *                    - ���������� ����� ����� ��� ������� ����� this � other ��� ������ �������� ��������;
 *          *
 *          /
 *
 *          �c������� ���� - null
 *      * /
 * /
 *          * ������ ������ String:
 *          *    int lenght() - ���������� ����� ������ (���������� �������� � ������);
 *          *
 *          *    String concat(String s) - ������������ ������ � ������ this. �������� ��� +;
 *          *
 *          *    String trim() - ������� ������� � ����������� ���������� ������� �� ������ this
 *          *                    ���������� �������: ' ', \r, \n, \t. ��������, ��� ����� ������ ������ ��������;
 *          *
 *          *    String replace(char original, char replacement) - �������� ��� ��������� ������� original ��������
 *          *                    replacement;
 *          *
 *          *    String toLowerCase() - �������� ������� �������� � ������, ����� ��� ����� ���������. ��������,
 *          *                    �������������� e-mail � ��������� ������ ������;
 *          *
 *          *    String toUpperCase() - �������� ������� �������� � ������, ����� ��� ����� ����������;
 *          *
 *          *    String replaceAll(String regex, String replacement) - �������� ��� ��������� regex �� replacement.
 *          *                    � �������� regex ����� ���� ���������� ���������. ��������, ���� ����� ������������
 *          *                    �� �������, ����� �� ���� ������ �������� ������� �� �����;
 *          *
 *          *    String replaceFirst(String regex, String replacement) - �������� ������ ��������� regex �� replacement.
 *          *                    � �������� regex ����� ���� ���������� ���������. ��������, ���� ������ � � ��� ���������
 *          *                    ���� � �������� ���� ������ ���� ���, ������ ����� ����� ������ �������� ������ ��
 *          *                    ��������� ����� �� ����� ������� ��������;
 *          *
 *          *    boolean equals(Object other) - ���������� ������������ ��������� ������ this �� ������� other � ������
 *          *                    �������� ��������. �������� == �������� ������ �� ����������� ����, ��� �������� ����
 *          *                    �������� equals;
 *          *
 *          *    boolean equalsIgnoreCase(String other) - ���������� ������������ ��������� ������ this �� ������� other
 *          *                    ��� ����� �������� ��������;
 *          *
 *          *   boolean regionMatches(int startIndex, String other, int otherStartIndex, int numChars) - ���������� �����
 *          *                    ����� ��� ������� ����� this � other � ������ �������� ��������;
 *          *
 *          *   boolean regionMatches(boolean ignoreCase, int startIndex, String other, int otherStartIndex, int numChars)
 *          *                    - ���������� ����� ����� ��� ������� ����� this � other ��� ������ �������� ��������;
 *          *
 *          /
 */
/**
 --������--
 �������� ������ (�����) ������ ����� �������� �� ������ ����� � ��� ������� ������. ������ ����� ��������� ��
 ������� �� ������ ������ (�����), �� ������ ���� ��� ������ ������� � ����� ������;

 --������� �������� ������--
 *      1 - ����������� ������� - ��� ���� �� 4-� ����� ����, ����������� ����� ������� ��� �������:
 *      *     public - �����/����� ����� �������� ������ ���� ������� ����� ������� (99% ������� ������������);
 *      *     protected - ������ ������ � ��� �����������, �� ���� �������� �������, ������������� � ������ ������� � ������ �������;
 *      *     ______ - ����� �������� ������ ������ �������� ������ (������� �����);
 *      *     private - ������ ������ �������� ������ (�����);
 *
 *      2 - ����������� - ��� ��������: ����� ���� ������ ������� �����������, ���� ���:
 *      *     ______ - �� static, ���� ����� ����� ���������� � ���������� text.split(" ");, �� �� �� ������ ���� static;
 *      *     static - ���� ����� ����� ���������� � ���� String.copyValueOf(char[] data);
 *
 *      3 - ������������ ��� ��� ����� void ���� ����� �� ���� �� ����������:
 *      *     public static int - ���� ����� ����� ���������� �����;
 *      *     public static char[] - ���� ���������� ������ ��������;
 *      *     public static String - ���� ���������� ������;
 *      *     public static ****** - ������ �������� ������������ �����;
 *      *     public static void - ���� �� ���� �� ����������, � ������ �����������, ��������, ������ �� �������;
 *
 *      4 - �������� ������: ���������� ��� ����, � ��������� �����;
 *
 *      5 - �������� ��������� � ������� ������� ���� ��� ����� ����� ������� � ��������� ����
 *
 *      6 - ���� ������ (�� ��� ������ �����������, ����� ����� �������);
 *
 *          public static void        printMassiveToConsole(int[][] mass)
 *      ������������ ������� ������        ��������� ������
 */
/** ��� - �������� ���������:
 *  1. ������������ - ������� ������ �� ������ ������� ��� �������� ����, ������� ��������� ����. ����������� ����� ������������ �������
 *                      - public;
 *                      - protected;
 *                      - _________;
 *                      - private;
 *      ����������� ������� �������� � ������ � ��� ������������. ����� ������� ��: �����; ������������; �������.
 *
 *  2.
 * */
/** ��� - ��������-��������������� ����������������. �������� ��������:
         *  1. ������������ - ������� ���������, ����������� ����� ������������ �������:
         *      public - �����/����� ����� �������� ������ ���� ������� ����� ������� (99% ������� ������������);
         *      protected - ������ ������ � ��� �����������, �� ���� �������� �������, ������������� � ������ ������� � ������ �������;
         *      ______ - ����� �������� ������ ������ �������� ������ (������� �����);
         *      private - ������ ������ �������� ������ (�����);
         *   2. ������������ - extends � ��� ��������, ������� ��������� ��������� ������ �� ������
         *      ������ ������� �������� �� ������ � �������� (�����������) �������.
         *   3. ���������� - �������� ��������� �������, �������� �������� ������������� �������� �
         *      �������� � ������������ ��������������, ��������������.
         *   4. ����������� - ��� ����������� ��������� ��������� ������������ ������� � ����������
         *      ����������� ��� ���������� � ���������� ���� ����� �������. �� ����� �������� ��
         *      ������� ������, ��� � ����� (��� �������, ��� ��� ���� �������� ������������ (���������)
         *      �� �������� (��������) ����).
         *
         *
         */
/**
 Object
 |
 ________ _________________�������________________________
 |                 (������, �������, ��������)             |
 |                                                         |
 ������  extends �������                                  �������� extends �������
 (������, �������, ��������) + (�������)                    (������, �������, ��������) + (��������)

 ��� �������� ����� �� ������������� ����� extends ����� �������� �� "�������� ��", ��� ����������� �� ����� �������������.
 ���� ������� ������ �������[] ���� = new �������[5]; ����� � ��� ����� ������� �������
 ����������� ������� ������ � ��������, � ����� ���� �� ��������, �������� ������ ����� �������� �� ���������������
 � ����������������.

 ���� ������ AudioContent � DiscVideo ������ �� ��� �� �������, �� �� ����� ���� ����� ����.
 ______________Object____________
 |                               |
 AudioContent                       VideoContent
 Object - ��� ����� �� ���������, ������� ������ ������ �������� � ����� ��������� ���������� ����� �������.

 */
/**

 ctrl+p � ������� ����� ������ ��� ���������
 */
/**
  * ������� ������������:
  * ����������� ������� + ������������ ��� ������(){}
     *
     * ������ ������� ������������ ���:
     * public Table(int length, int width, int height){}
     * public Table(int width, int length, int height){}
     *
     * ������ ������� ������������ ���:
 * public Table(int length, int height){}
     * public Table(int length, int width){}
     *
             * �������� ������ ������������� ���������� �� ���������� � �� ����� �������� ����������
     *
             *
             * /
             *      * ������� ������� ����� this � super � Java � ���, ��� this ������������ ������� ��������� ������,
     *      * � �� ����� ��� super - ������� ��������� ������������� ������.
         *
         *     public IronTable(){
     *         super.;
     *         this.
          *     }

     */
/**
 * ���� �������:
 * ����� - �������� ����, ������������ � ������
 * ����������� ����� - ��� ������� �����, �� � ��������� ����������� ����� abstract
 *                   - � ��� ����� ���� ����������� ������, ����� �� ���� (��� ���������� � ������ �����, ������ ����� � �����)
 *                   -  ��-�� ���������������� ����������� ������� �� ������ ����������� ������� ��� ������.
 *
 * ��������� - ����� ��, ��� ������� �����, �� �� �� ����� ������� ��� ������
 *           - ��� ������ ������ �����������
 *           - ��� ���� public static final. static - �����, final - �� ����������
 *           ��������� - ��� ��� ����������, ��������
 *           _________ Samsung______________________________
 *     ����������               �������� ��������         ����������
 *     - ������� ����           - ������� ����
 *     - ������� �����          - ������������� ����
 *                              - ����������� ����
 *     ���� ����� - ��� ��� ����������� ������������ � �������� �������.
 *     �� ���������  - ��� ���. ������� � ������������ ������� (������������)
 *
 * Interface � �������� ����� ��� �������� ���������� � Java
 * ������� ��������� ���������� � Java ������
 * ��������� ������������ ���������� ����������
 * ���������� �� ����� ����� �������������, ������ ��� �� �� ����� ������� ���������/������ ����������
 * �� ��������� ����� ������� ���������� �������� public, static � final, ��� ��� ��� �� ����� ���������� ������������ ������� � ���������
 * �� ��������� ������ ���������� ������ abstract � public
 * ��������� � Java �� ����� ���� ���������� � ������� ������, �� �� ����� ����������� ������ ���������
 * �������� ����� implements ������������ �������� ��� ���������� ����������
 * �����, ����������� ���������, ������ ���������� ���������� ���� ��� ������, ���� ������ ��� �� ����������� �����
 *
 * Enum
 * ���������� ���������� �����
 * ��������� �����
 */
/**
        *  ���������: Collection
         *  ��������� - ��� ������ � �������������� �������� � �������� ����� ���� ������, �� ������ ���� � ����� ���������
         *  �� ������ JDK 1.5 ��� ��������� ���� ��������� Object, � ������� ���� ��������� ����� ������� ������ ����
         *  ������, �� �� ����� ����� ������ ������ ������������ ����� � ������� ����� �� ����� ���������� � ��� ���������
         *  ����� ��������� ������ ���� ���.
         *
                 *       ���������� ���������: Collection � Map (��������� �� ����� ������, �.�. ���� � ������ �� �������)
         *                             Collection - ������ ��������;
         *                             Map - ������ �������� �� �����������;
         *
                 *                                      (Interface)
            *                                        Iterable (����������� ��� ������������) �������� Iterator<T> iterator();
         *                                           |
                 *                                      (Interface)
            *               __________________java.util.Collection _________________________
         *              |                                                               |
                 *          (Interface)                                                     (Interface)
            *      java.util.Set (�����)                                             java.util.List (�������� ������)
            *      - ��� �������� ���������;                                          - ����� �������� ��������� ��������;
         *      - ��� ��������;                                                    - ������� ����;
         *      - ��� ������� ���������;                                           - ���� ������� ���������;
         *                  |                                                                        |
                 *     _____________|_______________                                         ________________|___________________
         *     |                           |                                         |                                  |
                 * (Interface)                HashSet                                   ArrayList                         LinkedList
         * SortedSet                - �������� �� �����������                 (��.��������������� ������)       (��.����� �������)
            *     |                    - ����� ������� NULL � ��������          - ���������� �����              - ���������� �������
         * (Interface)              - ������� ������ HashCode                - �������� �����                - �������� �������
         * NavigableSet                            |                         - ������ ������                 - ������ ������
         *     |                                   |                        ___________________              ___________________
         *     |                                   |                         - ���������� ������;            - ���������� ������;
         *     |                                   |                         - �������� ������;              - �������� ������;
         *     |                                   |                         - ������ ������;                - ������ ������� ������;
         *     |                                   |
                 *  TreeSet                          LinkedHashSet
         * (������ ��������)                  - ���� ������� ���������
         * (��������  ������)
            * (�� ������ �������� ������)
            * (������ �� ����, ������ �� �����)
            * (���������� - ��������� ����� ���������)
            */
            /**
            *  ���������: Map
         *  ��������� - ��� ������ � �������������� �������� � �������� ����� ���� ������, �� ������ ���� � ����� ���������
         *  �� ������ JDK 1.5 ��� ��������� ���� ��������� Object, � ������� ���� ��������� ����� ������� ������ ����
         *  ������, �� �� ����� ����� ������ ������ ������������ ����� � ������� ����� �� ����� ���������� � ��� ���������
         *  ����� ��������� ������ ���� ���.
         *
                 *       ���������� ���������: Collection � Map (��������� �� ����� ������, �.�. ���� � ������ �� �������)
         *                             Collection - ������ ��������;
         *                             Map - ������ �������� �� �����������, �������� ���� � ��������;
         *      ��������� �� �������� ����� ����, � �� ����� �� ����� ����. ���� ������ ����������.
         *
                 *      ���������: Map
         *          *          - Map - � ���������� Map ���� ���������� HashMap<K, V>, ��� ��� �������� ������ �� �����������
         *          *              K - ��� ����� (����� ��������� ���)
         *          *              V - ��� �������� (����� ��������� ���)
         *          *              ������ ��������� �������: | ������ | ������ | ������� | - ��� ���� ������ �������� (����������)
         *          *                                        |   5    |  4     |   3     | - ��� �������� (�� ����������)
         *          *
                 *          *              � ������ ������� ��� ����� String, ��� �������� Integer, �� ���� ����� ���� �����.
            *          *
            *          *              ����������� ���� ������ ������� ������ ���������! ��� ����� ���� ��������� ���� ����������:
            *          *                  int    -  Integer
         *          *                  byte   -  Byte
         *          *                  short  -  Short
         *          *                  char   -  Character
         *          *       ������ ��������� ���� HashMap standings - ��������� �������, ����:
            *
            *      ��������� ��������� ������� � ��� ��� Map ��� �� ���������, � ������������� ������, ��� ��������
         *      ��������� ���� - ������ ������ ���� ����������� � int. ������ ������� ����� Java ������ �����������
         *      �������� Map �����������.
         *      ������� ������������� Map, ��� ��� ���� ������ ��������� �� ���� ��������, ��������:
            *          - ����������������<K-�������,V-����>
            *          - �������<K-����������,V-����������>
            *          - ��������������<K-�����,V-��������>
            *          - �������������� <K-�������� ������������ ������,V-��������� ����>
            *       ��� ��� ���� �� ������ �������� �������������, �� � ��� ���� � ���� �������� ��� ��������, � ������
         *       �������� ��� ������ � �����. ����� �������� ��� ���������� �� �����, ���������� � ���������� ��
         *       ��������. ���� ����� ������ ���, ����� ����� ������������ �� ������ ��������� Set ��� List.
            *       ���� ��������� ����� ��������� ���, ���� ����� ��������� �� ������ �������, � �������� ���������
         *       ����� ���, � ��� �� ����� �������� ����� ��������� � ������� � ������.
            *
            *                                       (Interface)
            *                                        Iterable (����������� ��� ������������) �������� Iterator<T> iterator();
         *                                           |
                 *                                      (Interface)
            *                    __________________java.util.Map <����, ��������> _______________________
         *                   |                            |                                           |
                 *             (Interface)                     HashMap                                      HashTable (��������� ����������)
         *              SortedMap                 - ��� ������� ���������
         *                  |                     - ���� ����� ���� == Null,
            *             (Interface)                  �� ���� ���.
         *            NavigableMap                - ���� hashCode (�������� ��� ����������)
         *                   |                    - new HashMap<>(16,0.75f)
                 *                TreeMap                 -
            *            - ���� ����������<K,V>
         *                                                 |
                 *                                                 |
                 *                                           LinkedHashMap
*                                        - ���� ������� ���������
         *
                 *
                 *
                 *
                 */

    /**
     * Git - ��� ������� �������� ������
     * ��������� �������� �������� ���� ��� ������� �� ��������� ����������� �� ������ �����, � ����� ��� ��������
     * ������, ��� ��������� ����, ������ ���������� ������������� � ����� �������.
     *
     * ��� ���� ����� �������� git.
     *
     * Git - ��� ������� �������� ������. �������������� ��������� � ����� ��� ���������� ������, � �������������
     *  ����������� ��������� �� ������� ������ �����. � ����� ������������� ����������� �������� ��� �����
     * ���������� ������ �������������, �������� ���, ��������� ������� � ������� ����������.
     * ���� ������ �������:
     *      svn/subversion (����������, ��������� ���������������� ������� ���������� ��������, ����������
     *          ���������� � 2004 ���� � ��� ��������� CollabNet);
     *      git - ��������� �����������:
     *      gitHub (�������-����������, ���������� ����������� ���������� Microsoft);
     *      gitLab (�������-����������, �������� ������� �� ������� ������� ����� � ������� ��������� � 2011 ����,
     *          � 2013 ���� � ��� ������������� ��� ���������);
     *
     * ����������� - ��� ����� �������� ����, ���������� �������� � ����� ������������ � ������ (web-server).
     * � ������ �������� git, ����� ���� ����� ������������.
     *
     * � ������ ������ ����� ��������� ������ �� ���� git ����������� ��� github ��� ���� gitlab, ��� ������������
     * ����� ������� ���� �������.
     *
     * ����� ������:
     *                                              �����������
     *                          _________________________________________________
     *                          |      ���, �������� ��������-��������          |
     *                 _______  |_______________________________________________|?------
     *         Update |     Push  ?         |        ?                  |              |
     *               1|          2|       1 |       2|                 1|            2 |
     *         _______?_______   |      ___?________|______       _____?______________|__
     *         |       commit|____|     |                 |        |                    |
     *         | ����������� |          | ����� ��������  |        | ������� ���������� |
     *         |_____________|          |_________________|        |____________________|
     *           ��������� 1               ��������� 2              ��������� 3
     *
     * 1. Update - (��������) ������� �� ������ ���������� (push ������)
     * 2. Commit - (�����������) ��������� � ��������� git
     * 3. Push - (���������) ��������� � �������� git
     */
    /**
     * �������� ������
     * 1. ����� � GIT, � ��� ����� �� �������: https://git-scm.com/book/ru/v2
     * 2. ������ �� ��������: https://git-scm.com/downloads
     * 3. �������� git: https://learngitbranching.js.org/?locale=ru_RU
     */
 }
