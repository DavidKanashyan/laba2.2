package laba4;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informatia implements ActionListener{

	
public void actionPerformed(ActionEvent arg0) {
JOptionPane.showMessageDialog(null,
"�������� ����� ���������� 08.04.2022" +
"\n������� ������� ��������� 08.04.2022" +
"\n����� ����� �������� " + 
"\n������� ������� ����������" + 
"\n������ �� �����:" +
"\n" + TextReader.dannie,
"����������",
JOptionPane.INFORMATION_MESSAGE);//
}
}