package laba4;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informatia implements ActionListener{

	
public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null,
"Kanashyan David Alekseevich 28.03.2022" +
"Bualtov Marsel Rasulevich 28.03.2022" +
"Yarova Lidia 28.03.2022" + 
"\n������� ������� ����������" + 
"\n������ �� �����:" +
"\n" + TextReader.dannie,
"����������",
JOptionPane.INFORMATION_MESSAGE);//
}
}