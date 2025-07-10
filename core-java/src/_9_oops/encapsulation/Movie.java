package _9_oops.encapsulation;

public class Movie {
    private int id;
    private String title;
    private String director;
    private int year;

    //public setter methods
   public void setId(int id) {
       this.id = id;
   }
   public void setTitle(String title) {
       this.title = title;
   }
   public void setDirector(String director) {
       this.director = director;
   }
   public void setYear(int year) {
       this.year = year;
   }

   //getter
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
