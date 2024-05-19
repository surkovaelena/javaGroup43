package les_19;

public class Jurnal implements Printable{
//поля
    private String name;
    //конст

    public Jurnal(String name) {
        this.name = name;
    }

    //методы

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
