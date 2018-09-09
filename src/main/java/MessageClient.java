import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MessageClient {

    //bad code
    public static void main(String[] args)throws Exception {

        String il = " ⊂_ヽ \n" +
                "　 ＼＼ Λ＿Λ \n" +
                "　　 ＼( 'ㅅ' ) 두둠칫 \n" +
                "　　　 >　⌒ヽ \n" +
                "　　　/ 　 へ＼ \n" +
                "　　 /　　/　＼＼ \n" +
                "　　 ﾚ　ノ　　 ヽ_つ \n" +
                "　　/　/두둠칫 \n" +
                "　 /　/| \n" +
                "　(　(ヽ \n" +
                "　|　|、＼ \n" +
                "　| 丿 ＼ ⌒) \n" +
                "　| |　　) / \n" +
                "`ノ )　　Lﾉ\n" +
                "\n";

        Map<String,String> iconMap = new HashMap<>();
        iconMap.put("@il","\n"+ il + "\n");

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("CLIENT READY");

        while(true){
            try(
            Socket socket = serverSocket.accept();
            DataInputStream din = new DataInputStream(socket.getInputStream());
            ){
                System.out.println(socket);
                String message = din.readUTF();

                if(message.contains("@il")){
                    System.out.println(iconMap.get("@il"));
                }

                System.out.println(message);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }//end catch



        }//end while

    }//end main

}
