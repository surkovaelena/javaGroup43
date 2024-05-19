package les_16_1;

public class SapperGame {

    //Поля
    private int[][] mapGame = new int[10][10];
    private int[][] visibleMapGame = new int[10][10];
    //Конструкторы
    //Методы
    public void bombsByLevel(int level) {
        //level может быть 1 ИЛИ 2 ИЛИ 3
        int countBombs = 0;

        if(level == 1){
           countBombs = 20;
        } else if(level == 2){
            countBombs = 15;
        } else { //Допишите проверку если не 1, 2, 3
            countBombs = 10;
        }

        //Рандомно расставить полученное количество бомб
        for (int i = 0; i < countBombs; i++) {
            this.addRandomBomb();
        }

    }

    private void addRandomBomb() {
//        int row = ThreadLocalRandom.current().nextInt(0, 10);
//        int column = ThreadLocalRandom.current().nextInt(0, 10);
//        if(mapGame[row][column] != -1){
//            mapGame[row][column] = -1;
//        } else {
//            this.addRandomBomb(); //рекурсия - еще придумать примеры
//        }

    }

    public void placeHelpNumberOnMap() {
        //Проходим по каждой строке двухмерного массива (вся карта)
        for (int i = 0; i < mapGame.length; i++) {
            for (int j = 0; j < mapGame[i].length; j++) {
                if(mapGame[i][j] == -1) { //Правда ли что на ячейке текущей есть бомба?
                    // если да, то анализируем вокруг
                    for (int k = i-1; k <= i + 1 ; k++) { //Проходим над текущей, по текущей и под текущей СТРОКОЙ
                        for (int l = j - 1; l <= j + 1 ; l++) { //Проходим перед текущей, по текущей и после текущей КОЛОНКОЙ
                            if((k >= 0 && k < mapGame.length)&&(l >= 0 && l < mapGame[i].length)&&(mapGame[i][j] != -1)){
                                mapGame[k][l]++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void printMapGame() {
        for (int i = 0; i < mapGame.length; i++) {
            for (int j = 0; j < mapGame[i].length; j++) {
                if(visibleMapGame[i][j] == 1){
                    if(mapGame[i][j] == 0){
                        System.out.print("   ");
                    } else if (mapGame[i][j] == -1){
                        System.out.print("БАХ");
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }


    public void printMapGameOver() {
        for (int i = 0; i < mapGame.length; i++) {
            for (int j = 0; j < mapGame[i].length; j++) {
                if(visibleMapGame[i][j] == 1){
                    if(mapGame[i][j] == 0){
                        System.out.print("   ");
                    } else if (mapGame[i][j] == -1){
                        System.out.print("БАХ");
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                }else {
                    if(mapGame[i][j] == -1){
                        System.out.print("БАХ");
                    }else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }

                }
            }
            System.out.println();
        }
    }

    public int checkPointPlayrs(int pointY, int pointX) {
        if(pointX > 9 || pointY > 9 || pointX < 0 || pointY < 0){
            return 1;
        } else if (visibleMapGame[pointX][pointY]==1){
            return 2;
        }
        visibleMapGame[pointX][pointY] = 1;

        if(mapGame[pointX][pointY] == -1){
            return -1;
        }else if(mapGame[pointX][pointY] > 0){
            return checkVictoryGame();
        }else {
            this.checkZeroOnMapGame(pointX, pointY);
            return checkVictoryGame();
        }
    }

    private void checkZeroOnMapGame(int pointX,int pointY) {
        visibleMapGame[pointX][pointY] = 1;
        for (int i = pointX - 1; i <= pointX+1; i++) { //обход строк над, по и под нажатой координате по СТРОКАМ
            for (int j = pointY - 1; j <= pointY+1; j++) { //обход колонок перед, по и после нажатой координате по КОЛОНКАМ
                if ((i >= 0 && i < mapGame.length)&&(j >= 0 && j < mapGame[i].length)&&(mapGame[i][j] >= 0)){
                    if(mapGame[i][j] == 0 && visibleMapGame[i][j] == 0){
                        this.checkZeroOnMapGame(i,j);
                    }else {
                        visibleMapGame[i][j] = 1;
                    }
                }
            }
        }
    }

    private int checkVictoryGame() {//Проверка на победу - Если поле не открытое и без бомбы, вернуть 1
        int check = 0;
        for (int i = 0; i < visibleMapGame.length; i++) {
            for (int j = 0; j < visibleMapGame[i].length; j++) {
                if(visibleMapGame[i][j] == 0 && mapGame[i][j] != -1){ //если поле не открыто && под ней нет бомбы
                    check = 1;
                    break;
                }
            }
        }

        return check;
    }
}
