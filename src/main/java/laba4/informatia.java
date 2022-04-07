package laba4;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informatia implements ActionListener{

	
public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null,
"Канашьян Давид Алексеевич 08.04.2022" +
"Bualtov Marsel Rasulevich 28.03.2022" +
"Yarova Lidia 28.03.2022" + 
"\nпїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ" + 
"\nпїЅпїЅпїЅпїЅпїЅпїЅ пїЅпїЅ пїЅпїЅпїЅпїЅпїЅ:" +
"\n" + TextReader.dannie,
"пїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅпїЅ",
JOptionPane.INFORMATION_MESSAGE);//
}
}