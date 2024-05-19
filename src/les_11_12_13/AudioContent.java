package les_11_12_13;

public class AudioContent extends MediaProduct {
    //Поля (fields)
//    private String name;
//    private int year;
    private String executor;
    private int countofTrack;


    //Конструкторы


    public AudioContent(String s) {
    }

    public AudioContent() {
//        this.name = name;
//        this.year = year;
        this.executor = executor;
        this.countofTrack = countofTrack;
    }


    //Методы


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public int getCountofTrack() {
        return countofTrack;
    }

    public void setCountofTrack(int countofTrack) {
        this.countofTrack = countofTrack;
    }

    @Override
    public void printAllInfo( ) {

            System.out.println("Название: "+ getName()+" Автор: "+ getExecutor()+" Длительность: "+ getCountofTrack()+" Год: "+ getYear());

    }
}
