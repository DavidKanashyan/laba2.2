package laba4;


import java.awt.event.*;
import java.io.IOException;


public class menuListener implements ActionListener{

    public void actionPerformed(ActionEvent arg0) {

        try {
            new Logotip();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}