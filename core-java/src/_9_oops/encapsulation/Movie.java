package _9_oops.encapsulation;

public class Movie {
    private int id;
    private String title;
    private String director;
    private int year;

    //setter method
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public void setDirector(String director) {
        if (director != null) {
            this.director = director;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    //getter method
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

}
