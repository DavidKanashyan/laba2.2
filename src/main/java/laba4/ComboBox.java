package laba4;


import javax.swing.*;

public class ComboBox {
	
	protected static String[] comboItems = {"Переместить логотип в правый верхний угол", "Переместить логотип в середину", "Переместить логотип в левый верхний угол","«Отсортировать данные в проекте5"};
	protected static JComboBox comboBox = new JComboBox(comboItems);
	
	public ComboBox() {
		

		comboBox.setBounds(10,130,245,90);
		comboBox.addActionListener(new comboBoxActionListener());
		subversion.main_panel.add(comboBox);
		
	}
}