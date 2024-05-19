package les_11_12_13;

public class ServiceUtilities  {
    public static void printOldestMedia(MediaProduct[] media) {

        MediaProduct numberOldYear = media[0];
        for (MediaProduct product : media) {
            if (product.getYear() < numberOldYear.getYear()) {
                numberOldYear = product;
            }
        }
        numberOldYear.printAllInfo();

        for (int i = 0; i < media.length; i++) {
            if (numberOldYear.getYear() >= media[i].getYear()) {
                numberOldYear = media[i];
            }

        }
        numberOldYear.printAllInfo();
    }


}
//


