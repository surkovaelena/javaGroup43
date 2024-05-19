package lec_11;

public class VideoContent {
    //ï
    private String name;
    private int year;
    private String studio;
    private String director;
    private int mins;


    //ê
    public VideoContent() {

    }

    public VideoContent(String name, int year, String studio, String director, int mins) {
        this.name = name;
        this.year = year;
        this.studio = studio;
        this.director = director;
        this.mins = mins;
    }


    //ì


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
}
