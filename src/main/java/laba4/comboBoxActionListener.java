package laba4;


import java.awt.event.*;

public class comboBoxActionListener implements ActionListener{

	public void actionPerformed(ActionEvent arg0) {

		if (ComboBox.comboBox.getSelectedItem() == "����������� ������� � ������ ������� ����") {
			Logotip.logotip.setSize(122,61);
			Logotip.logotip.setLocation(1075,25);
		} else if (ComboBox.comboBox.getSelectedItem() == "����������� ������� � ��������") {
			Logotip.logotip.setSize(122,61);
			Logotip.logotip.setLocation(530,25);
		} else if (ComboBox.comboBox.getSelectedItem() == "����������� ������� � ����� ������� ����") {
			Logotip.logotip.setSize(122,61);
			Logotip.logotip.setLocation(10,25);
		} else if (ComboBox.comboBox.getSelectedItem() == "�������������� ������ � �������5") {
            if (ArrayMaker.newArray[1] == 0) {
                subversion.arrField.setText("������������ ����� � ������!");
            } else {
            new Sorter();
            subversion.arrT = "";
            for (int i = 0; i < 9; i++) {
                int k = i + 1;
                subversion.arrT = subversion.arrT + " " + k + " ������� - " + Sorter.getTestingArray()[i] + ";";
            }
            subversion.arrField.setText(subversion.arrT);
            }
        }
		
	}
	
}
