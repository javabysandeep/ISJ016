package _9_oops.encapsulation;

public class Demo2 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        /*movie.id = -101;
        movie.title = "abc";*/

        //setting the values using setter methods :: setXXXX
        movie.setId(1001);
        movie.setTitle("Java");
        movie.setYear(2017);
        movie.setDirector("xyz");

        System.out.println("id = " + movie.getId());
        System.out.println("title = " + movie.getTitle());
        System.out.println("year = " + movie.getYear());
        System.out.println("director = " + movie.getDirector());


    }
}
