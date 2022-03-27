package laba4;

import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class vichisListener implements ActionListener{

public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

double b;
double h;
double res;
String rezVivod = "";
try {
b = Double.parseDouble(subversion.osnovanieField.getText());
h = Double.parseDouble(subversion.visotaField.getText());
} catch (NumberFormatException e2) {
JOptionPane.showMessageDialog(null, "Вы ввели что-то в неправильном формате");
return;
}
res = b * h * 0.5;
rezVivod = String.valueOf(res);
subversion.rez.setText(rezVivod);

}

} 