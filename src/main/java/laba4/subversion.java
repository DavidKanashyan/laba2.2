package laba4;


import java.awt.event.*;
import java.awt.Image;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

protected static JTextField arrField = new JTextField("");
protected static String arrT = "";
	
protected static JPanel main_panel = new JPanel();

protected static JTextField visotaField;
protected static JTextField osnovanieField;
protected static JLabel rez;

public subversion() {
JFrame main_GUI = new JFrame("subversion"); // создание графического окна
main_GUI.setTitle ("Using subversion for developers");
main_GUI.setBounds(25,100,1225,400);
main_GUI.setResizable(false); // фиксированный размер окна

main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
laba_info.setBounds(520,0,150,30);
main_panel.add(laba_info);

JButton button_exit = new JButton("Выход"); // добавляем кнопку
button_exit.setBounds(260,180,120,40);
button_exit.addActionListener(new ListenerButton()); // добавляем слушатель к кнопке
main_panel.add(button_exit);

JButton button_information = new JButton("Информация");
button_information.setBounds(260,130,120,40);
button_information.addActionListener(new informatia());
main_panel.add(button_information);

final JLabel genLabel = new JLabel("");
genLabel.setBounds(600,130,100,40);
main_panel.add(genLabel);

JButton genButton = new JButton("Сгенерировать число");
genButton.setBounds(400,130,175,40);
genButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        new Generator();
        genLabel.setText(String.valueOf(Generator.random));
    }
});
main_panel.add(genButton);


arrField.setBounds(400,250,800,50);
arrField.setEditable(false);
main_panel.add(arrField);

JButton arrButton = new JButton("Создать массив");
arrButton.setBounds(400,180,175,40);
arrButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (Generator.random == 0){
            arrField.setText("Сгенерируйте число!");
        } else {
        new ArrayMaker();
        arrT = "";
        for (int j = 0; j < 9; j++) {
            int k = j+1;
            arrT = arrT + " " + k + " элемент - " + ArrayMaker.getArray()[j] + ";";
            }
        arrField.setText(arrT);
        }
    }
});
main_panel.add(arrButton);

JButton sortButton = new JButton("Пузырьковая сортировка");
sortButton.setBounds(600,180,190,40);
sortButton.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (ArrayMaker.newArray[1] == 0) {
            arrField.setText("Сгенерируйте число и массив!");
        } else {
        new Sorter();
        arrT = "";
        for (int i = 0; i < 9; i++) {
            int k = i + 1;
            arrT = arrT + " " + k + " элемент - " + Sorter.getTestingArray()[i] + ";";
        }
        arrField.setText(arrT);
        }
    }
});
main_panel.add(sortButton);

JMenu newMenu = new JMenu("Меню");
JMenuBar newMenuBar = new JMenuBar();
Menu oneMoreMenu = new Menu(newMenu, newMenuBar);   
main_GUI.setJMenuBar(newMenuBar);



JLabel visota = new JLabel("Высота");
visota.setBounds(80,250,60,20);
main_panel.add(visota);
visotaField = new JTextField("0");
visotaField.setBounds(80,300,60,30);
visotaField.addKeyListener(new KeyListener() {

public void keyTyped(KeyEvent e) {
char visotaChar = e.getKeyChar();
if (((visotaChar < '0') || (visotaChar > '9')) && (visotaChar != '.')) {
e.consume();
}
}
public void keyPressed(KeyEvent e) {
}
public void keyReleased(KeyEvent e) {
}
});

main_panel.add(visotaField);

JLabel osnovanie = new JLabel("Основание");
osnovanie.setBounds(10,250,70,20);
main_panel.add(osnovanie);
osnovanieField = new JTextField("0");
osnovanieField.setBounds(10,300,60,30);
osnovanieField.addKeyListener(new KeyListener() {

public void keyTyped(KeyEvent e) {
char osnovanieChar = e.getKeyChar();
if (((osnovanieChar < '0') || (osnovanieChar > '9')) && (osnovanieChar != '.')) {
e.consume();
}
}
public void keyPressed(KeyEvent e) {
}
public void keyReleased(KeyEvent e) {
}
});

main_panel.add(osnovanieField);

JLabel rezultat = new JLabel("Результат");
rezultat.setBounds(150,250,70,20);
main_panel.add(rezultat);
rez = new JLabel("");
rez.setBounds(150,300,60,30);
main_panel.add(rez);

JLabel sm1 = new JLabel("в см");
sm1.setBounds(10,270,70,20);
main_panel.add(sm1);

JLabel sm2 = new JLabel("в см");
sm2.setBounds(80,270,70,20);
main_panel.add(sm2);

JLabel sm3 = new JLabel("в см");
sm3.setBounds(150,270,70,20);
main_panel.add(sm3);

JButton vichislit = new JButton("Вычислить");
vichislit.setBounds(250,250,120,60);
vichislit.addActionListener(new vichisListener());
main_panel.add(vichislit);

new ComboBox();

main_GUI.setVisible(true);
main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
}

public static void main(String[] args) {
subversion student= new subversion();

}

}