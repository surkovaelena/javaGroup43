package les_19;

public class Jurnal implements Printable{
//����
    private String name;
    //�����

    public Jurnal(String name) {
        this.name = name;
    }

    //������

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
