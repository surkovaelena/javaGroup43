package lec_10;

public class MassiveUtils {


    public static void pritMassivToConsole(int[][] array) {
        //code
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }


    }

    public static int countEvenNumbers(int[][] array) {
        //code
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;

    }

    public static char[] charGlassFromText(String someText) {
        int countGlass = 0;

//       считаем длину массива
        for (char ch : someText.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o' || ch == 'i' ||
                    ch == 'A' || ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {
                countGlass++;
            }
        }
        char[] glassChar = new char[countGlass];

        int currentIndex = 0;
        for (char ch : someText.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o' || ch == 'i' ||
                    ch == 'A' || ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {
                glassChar[currentIndex] = ch;
                currentIndex++;
            }
        }





        return glassChar;
    }
}
