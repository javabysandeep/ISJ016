package _7_class_components;

public class Movie {
    //instance variables
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    Movie(){}

    Movie(int id, String title, String genre, int year, String director, int rating) {
        //assign local variable to instance variable
        id = id ;//assigning local to local
        title = title;//assigning local to local

       this.id = id;
       this.title = title;
       this.genre = genre;
       this.year = year;
       this.director = director;
       this.rating = rating;

    }

    void registerMovie(int i, String t, String g, int y, String d, int r) {
        id = i;
        title = t;
        genre = g;
        year = y;
        director = d;
        rating = r;
    }

}
