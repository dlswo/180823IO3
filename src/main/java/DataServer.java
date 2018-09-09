import com.google.gson.Gson;
import domain.Movie;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class DataServer {

    //bad code
    public static void main(String[] args)throws Exception {

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("READY");

        Socket socket = serverSocket.accept();
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        Movie movie = new Movie();
        movie.setTitle("인셉션");
        movie.setDirector("크리스토퍼 놀란");
        movie.setPop(583);
        movie.setScore(8.7);
        Movie movie2 = new Movie();
        movie2.setTitle("독전");
        movie2.setDirector("이해영");
        movie2.setPop(900);
        movie2.setScore(4.3);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie2);

        Gson gson = new Gson();

        String str = gson.toJson(movies);
        System.out.println(str);


        dos.writeUTF(str);



        dos.close();
        socket.close();
        serverSocket.close();




    }
}
