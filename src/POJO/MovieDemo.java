package POJO;

import java.util.Arrays;
import java.util.Comparator;

public class MovieDemo {
    public static void main(String[] args) {
        new MovieDemo().go();
    }

    private void go() {
        Movie movie1 = new Movie("Matrix", 1999, "Reeves");
        Movie movie2 = new Movie("Mission Impossible", 1991, "Cruise");
        Movie movie3 = new Movie("Titanic", 1995, "DiCaprio");

        System.out.println(movie1.hashCode());
        System.out.println(movie1.equals(movie2));
        System.out.println(movie1);
        System.out.println(movie1.getClass().getName());

        //********* Сортировка массива строк *****************************************
        String[] strMovies = new String[3];
        strMovies[0] = movie1.getTitle();
        strMovies[1] = movie2.getTitle();
        strMovies[2] = movie3.getTitle();
        Arrays.sort(strMovies);
        System.out.println(Arrays.toString(strMovies));

        //********* Сортировка массива объектов пользовательского класса ************
        Movie[] movies = new Movie[3];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;
        Arrays.sort(movies);

        System.out.println(Arrays.toString(movies));

        //********* Компараторы *****************************************************
        Arrays.sort(movies, new YearComparator());
        System.out.println(Arrays.toString(movies));

        //********** Record *********************************************************
        MovieRecord movie11 = new MovieRecord("Matrix", 1999, "Reeves");
        MovieRecord movie22 = new MovieRecord("Matrix", 1999, "Reeves");
        System.out.println(movie11.equals(movie22));
        System.out.println(movie11);

//        Movie m1 = null;
//        Movie m2 = null;
//        System.out.println(m1.equals(m2));   // 2 Null объекта

    }

    class YearComparator implements Comparator<Movie>{
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    }
}
