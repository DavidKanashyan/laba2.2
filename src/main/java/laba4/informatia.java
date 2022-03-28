package laba4;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informatia implements ActionListener{

	
public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null,
"�������� ����� ����������" +
"\n������� ������� ���������" +
"\n����� ����� ��������" +
"\n������� ������� ����������" +
"\n������ �� �����:" +
"\n" + TextReader.dannie,
"����������",
JOptionPane.INFORMATION_MESSAGE);//
}
}