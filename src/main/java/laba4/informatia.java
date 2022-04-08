package laba4;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informatia implements ActionListener{

	
public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null,
"Канашьян Давид Алексеевич 08.04.2022" +
"\nБулатов Марсель Расулевич 08.04.2022" +
"\nЯрова Лидия Наилевна " + 
"\nЛазарев Валерий Викторович" + 
"\nДанные из файла:" +
"\n" + TextReader.dannie,
"Информация",
JOptionPane.INFORMATION_MESSAGE);//
}
}