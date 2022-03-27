package laba4;


import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logotip {

    protected static JLabel logotip = new JLabel();

    public Logotip() throws IOException {

        Image imga = ImageIO.read(Logotip.class.getResourceAsStream("/Logotip.jpg"));

        ImageIcon imageIcon = new ImageIcon(imga);

        logotip.setIcon(imageIcon);

        subversion.main_panel.add(logotip);
        logotip.setSize(122,61);
        logotip.setLocation(1075,25);

    }
}
