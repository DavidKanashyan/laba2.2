package laba4;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

private JMenuItem menuItem1;
private JMenuItem menuItem2;
private JMenuItem menuItem3;

public Menu(JMenu File, JMenuBar Item) {

menuItem1 = new JMenuItem("�������� �������");
File.add(menuItem1);
menuItem1.addActionListener(new menuListener());
menuItem2 = new JMenuItem("�����");
File.add(menuItem2);
menuItem2.addActionListener(new ListenerButton()); // ��������� ��������� � ������
Item.add(File);
menuItem3 = new JMenuItem("�������� ����");
menuItem3.addActionListener(new menuListener3());
File.add(menuItem3);

}

public JMenuItem getItem() {
return menuItem1;
}
}
 