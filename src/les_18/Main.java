package les_18;

public class Main {
    public static void main(String[] args) {

/**
 * ���� BlackJack
 * ���� ����������� � ���, ����� ������� ��� ����� ������ �����, �� �� ����� 21 � �������� ����� ������.
 * � ���� ������������ �� ����� �� ������ �����. ��-�� ���� ��� ����������� ���������� ����-���� ��� �������
 * ����� ����� ����, �� ������������ ������ ����������� ��� ���������� ����� �����. ��� ���� � �����-��������
 * ���������, ��� ������������ ����������� ������.
 *
 * �������� ����� ������ �����:
 *      �� ������ �� ������� � �� 2 �� 10 ��������������;
 *      � ���� � 1 ��� 11 (11 ���� ����� ����� �� ������ 21, ����� 1);
 *      � �. �. �������� (������, ����, �����) � 10;
 *
 * ���� � ������ � ������ ����� ����� �� ����� ������, �� ����� �������� ���������� ������: �� ������� ���
 * ���������� � ��� (����. push). � ����� �������� ��� �������� ��� ����� �������, ����� �� ���������� � ��
 * �����������. ���� � ������ ������ ����������, � ��� �push� ���������� ������
 */
/**
 * �������
 * 1. ������� ������ ���� � ������������ �����, ����� ������� ��������� IGameBJ � ����� GameBJ, impl ����������� ���.
 * 2. ������� ���� �������. ����� ������� ��������� IPlayerBJ � ����� PlayerBJ.
 * 3. ������� ������ croupierBJ. ����� ������� ����� CroupierBJ. extends PlayerBJ
 * 4. ������� � ���� ������� � ������. Creat addPlayerInGamegameBJ() IGameBJ. ����� - ����� � IGameBJ, ����� ������� � ����� � ���������� ������
 * 5. class GameBJ - �����, ����� ������ ������ ����� ������ ����, ����� ������� � � ������ GameBJ
 * 6. class DeckJB - ����� ����� ����� � ������, � ������ DeckJB � ����������� �������� ������� �������� ������ ����
 * 7. ������ ����� ������� �� ��� ����� �� ������ ������� gameBJ.twoCArdsOnStartForEach();
 * 8. ����� ����� ��������� �� ����� ����� �������, ���� �� ���������
 * 9. �������� ���������� ����������
 */

//1
        IGameBJ gameBJ =new GameBJ();
//        IGameBJ game2 =new GameBJChilfen();
//        IGameBJ[]iGameBJS =new IGameBJ[2];
//                iGameBJS[0] = gameBJ;
//                iGameBJS[1]=game2;
//game2.equals();
//gameBJ.equals();
gameBJ.determineWinner();


    }
}