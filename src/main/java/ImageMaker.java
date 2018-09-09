import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageMaker {

    //bad code
    public static void main(String[] args)throws Exception {
        BufferedImage image = new BufferedImage(500,500,BufferedImage.TYPE_INT_RGB);

        File bgFile = new File("c:\\zzz\\album\\bg.jpg");
        BufferedImage bgImage = ImageIO.read(bgFile);

        Graphics graphics = image.getGraphics();
//        graphics.setColor(Color.pink);
        graphics.drawImage(bgImage,0,0,null);

        graphics.setColor(Color.YELLOW);
        graphics.setFont(new Font("TimesRoman",Font.PLAIN,25));

        graphics.drawString("Hello World",250,400);

        ImageIO.write(image,"jpg",new File("c:\\zzz\\album\\test.jpg"));


    }

}
