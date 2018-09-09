package jr;

import java.io.File;
import java.io.OutputStream;

public class PicListlet extends AbstractJrlet {

    @Override
    public void service(String line, OutputStream out) throws Exception {
        out.write(new String("Content-Type: text/html;\r\n\r\n").getBytes());
        System.out.println("Picture service");
        out.write("<h1>Picture service</h1>".getBytes());

        File picFolder = new File("c:\\webroot\\img");

        String[] fileNames = picFolder.list();

        out.write("<ul>".getBytes());
        for (String fileName:fileNames) {
            out.write(("<li><a href='img/"+fileName+"' target='songFrame'>" + fileName + "</a></li>").getBytes());
        }


        out.write("</ul>".getBytes());
        out.write("<iframe name='songFrame' width='250' height='250'></iframe>".getBytes());


    }
}

