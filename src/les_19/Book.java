package les_19;

public class Book implements Printable{
   //поля
   private String name;
    private String author;

    //конструкторы

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    //это метод
    @Override
    public void print() {
        //код
        System.out.printf("%s (%s)", name, author);
        System.out.println();
    }
}
