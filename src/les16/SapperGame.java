//package les16;
//
//import java.util.concurrent.ThreadLocalRandom;
//
//public class SapperGame {
//    // ����
//    private int[][] mapGame = new int[10][10];
//    private int[][] visibbleMapGame = new int[10][10];
//
//    public void bombsByLevel(int level) {
//        //level �� ������
//        int countBombs = 0;
//        if (level == 1) {
//            countBombs = 20;
//        } else if (level == 2) {
//            countBombs = 15;
//        } else if (level == 3) {
//            countBombs = 10;
//        } else
//            System.out.println("������ �� ���� : 1, 2, 3");
//
//        // �������� ���������� ������� ���-�� ����
//        for (int i = 0; i < countBombs; i++) {
//            this.addRandomBomb();
//        }
//    }
//
//    private void addRandomBomb() {
//        //��������� -1 �������� �� ����� �� ��� �����
//        int row = ThreadLocalRandom.current().nextInt(0, 10);
//        int column = ThreadLocalRandom.current().nextInt(0, 10);
//        int column1 = ThreadLocalRandom.current().nextInt();
//        if (mapGame[row][column] != -1) {
//
//        } else {
//            this.addRandomBomb();//��������
//        }
//    }
//
//    public void placeHelpNumberOnMap() {
//        //�������� �� ������ ������ ����������� �������
//
//        for (int i = 0; i < mapGame.length; i++) {
//            for (int j = 0; j < mapGame[i].length; j++) {
//
//                if (mapGame[i][j] == -1) {/// ������ �� ��� �� ������ ����� ���� �����
//                    // ���� ��
//                    for (int k = i - 1; k <= i + 1; k++) {//�������� ��l �������. ��. ��� ������� �������
//                        for (int l = j - 1; l <= j + 1; l++) {//��������
//                            if ((k >= 0&&k< mapGame.length) && (l >= 0&&l< mapGame[i].length) && (mapGame[i][j]!=-1)) {
//                                mapGame[k][l]++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//
//    public void printMapGame(){
////        visibblemapGame
//        for (int i = 0; i < mapGame.length; i++) {
//            for (int j = 0; j < mapGame[i].length; j++) {
//                if (visibbleMapGame[i][j]==1){
//                   if(mapGame[i][j] ==0){
//                       System.out.println("   ");
//                   } else if(mapGame[i][j] ==-1){
//                       System.out.println("���");
//
//                   }else {
//                       System.out.println(" "+mapGame[i][j]+" ");
//
//                   }
//                }else {
//                    System.out.println(" * ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//    }
//}
