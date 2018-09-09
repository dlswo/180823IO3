package jr;

import java.io.OutputStream;
import java.util.Map;

public class Bullet extends AbstractJrlet {

    @Override
    public void service(String line, OutputStream out) throws Exception {

        out.write(new String("Content-Type: text/html;\r\n\r\n").getBytes());
        System.out.println("Discomfort service");
        out.write("<h1>Discomfort service</h1>".getBytes());

        Map<String,String> paramMap = parse(line);

        double temper = Double.parseDouble(paramMap.get("temper"));
        double humidity = Double.parseDouble(paramMap.get("humidity"));

        double discomfort = Math.round(((1.8*temper)-(0.55*(1-humidity/100)*((1.8*temper)-26))+32)*100)/100.0;

        out.write(("<h1>temper : " + paramMap.get("temper")+"</h1>").getBytes());
        out.write(("<h1>humidity : " + paramMap.get("humidity")+"</h1>").getBytes());
        out.write(("<hr/>").getBytes());
        out.write(("<h2>discomfort : " + discomfort + "</h2>").getBytes());

    }
}
