package les_19;

public class Book implements Printable{
   //����
   private String name;
    private String author;

    //������������

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    //��� �����
    @Override
    public void print() {
        //���
        System.out.printf("%s (%s)", name, author);
        System.out.println();
    }
}
