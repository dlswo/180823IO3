package domain;

import com.google.gson.Gson;

public class GsonTest {

    //bad code
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setTitle("인셉션");
        movie.setDirector("크리스토퍼 놀란");
        movie.setPop(583);
        movie.setScore(8.7);

        Gson gson = new Gson();

        String str = gson.toJson(movie);
        System.out.println(str);

    }

}
