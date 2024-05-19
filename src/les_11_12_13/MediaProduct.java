package les_11_12_13;

public abstract class  MediaProduct {
    //Поля
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
//Конс-ры

    public MediaProduct() {
    }

    public MediaProduct(String name, int year) {
        this.name = name;
        this.year = year;
    }



    //методы
    public abstract void printAllInfo();


}
