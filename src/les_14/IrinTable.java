package les_14;

public class IrinTable extends Table {
    private String metaic;



    public IrinTable(String name, String metaic) {
        super(name);
        this.metaic = metaic;
    }

    public IrinTable(String name, int lenght, int lwidth, int height, String nameOfModel, String metaic) {
        super(name, lenght, lwidth, height, nameOfModel);
        this.metaic = metaic;
    }

}

