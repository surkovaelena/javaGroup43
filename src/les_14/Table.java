package les_14;

public class Table extends Forniture {
    //p

    private int lenght;
    private int lwidth;
    private int height;

    private String nameOfModel;
    //k

    public Table(String name) {
        super(name);
    }
//как вариант чтобы убрать входные данные
//    public Table( String nameOfModel, int height, int lwidth ) {
//        this.lenght = lenght;
//        this.lwidth = lwidth;
//        this.height = height;
//        this.nameOfModel = nameOfModel;
//    }

    public Table(String name, int lenght, int lwidth, int height, String nameOfModel) {
        super(name);
        this.lenght = lenght;
        this.lwidth = lwidth;
        this.height = height;
        this.nameOfModel = nameOfModel;
    }


    //m
}
