package les_11_12_13;

public class VideoContent extends MediaProduct{
    //���� (fields)
//    private String name;
//    private int year;
    private String studio;
    private String director;
    private int mins;


    //������������
    public VideoContent() {
    }



    public VideoContent(String name, int year, String studio, String director, int mins) {
//        this.name = name;
//        this.year = year;
        this.studio = studio;
        this.director = director;
        this.mins = mins;
    }

    //������


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }
    @Override
    public void printAllInfo() {
        System.out.println("������:" + getStudio()+" ������������ : "+ getMins()+" ��������: " +getDirector()+" ��������: "+getName()+" ���: "+getYear());

    }
}
