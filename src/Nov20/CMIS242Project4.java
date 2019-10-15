package Nov20;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CMIS242Project4 extends JFrame {

public CMIS242Project4(String title) {
}

public static void main(String[] args) {
JLabel idLabel = new JLabel(" ID:");
JLabel nameLabel = new JLabel(" Name:");
JLabel gpaLabel = new JLabel(" Major:");
JLabel selectionLabel = new JLabel(" Choose Selection:");
JButton process = new JButton(" Process Request");
final JTextField idTextField = new JTextField(50);
final JTextField nameTextField = new JTextField(50);
final JTextField majorTextField = new JTextField(50);
final Map<String, Student> map = new HashMap<String, Student>();
final JComboBox select = new JComboBox(new String[]{"Insert", "Delete", "Find", "Update"});
JFrame frame = new JFrame();
frame.setBounds(100, 100, 350, 250);
frame.setLayout(new GridLayout(7, 2));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(idLabel);
frame.add(idTextField);
frame.add(nameLabel);
frame.add(nameTextField);
frame.add(gpaLabel);
frame.add(majorTextField);
frame.add(selectionLabel);
frame.add(select);
frame.add(new JLabel(""));
frame.add(new JLabel(""));
frame.add(process);
frame.add(new JLabel(""));
frame.add(new JLabel(""));
frame.add(new JLabel(""));
process.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent arg0) {
String action = select.getSelectedItem().toString();
try {
if (action.compareTo("Insert") == 0) {
String id = idTextField.getText();
String name = nameTextField.getText();
String major = majorTextField.getText();
map.put(id, new Student(name, major));
JOptionPane.showMessageDialog(null, "You have inserted new Student \n" + "id: " + id + "\n" + "name: " + name + "\n" + "major: " + major, "Message", JOptionPane.INFORMATION_MESSAGE);
} else {
if (action.compareTo("Find") == 0) {
String id = idTextField.getText();
Student student = map.get(id);
if (student != null) {
nameTextField.setText(student.getName());
majorTextField.setText(String.valueOf(student.getMajor()));
JOptionPane.showMessageDialog(null, student.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(null, "Database does not contain id (" + id + ")", "Message", JOptionPane.INFORMATION_MESSAGE);
}
} else {
if (action.compareTo("Delete") == 0) {
String id = idTextField.getText();
if (map.remove(id) != null) {
JOptionPane.showMessageDialog(null, "You have deleted Student with id: " + id, "Message", JOptionPane.INFORMATION_MESSAGE);
} else {
JOptionPane.showMessageDialog(null, "Database does not contain id (" + id + ")", "Message", JOptionPane.INFORMATION_MESSAGE);
}

} else if (action.compareTo("Update") == 0) {
String[] Grade = {"A", "B", "C", "D", "F"};
String gradeS = (String) JOptionPane.showInputDialog(null,
"Choose grade:",
"",
JOptionPane.QUESTION_MESSAGE,
null,
Grade,
Grade[0]);
double grade = 0;
if (gradeS.equals("A")) {
grade = 4;
} else if (gradeS.equals("B")) {
grade = 3;
} else if (gradeS.equals("C")) {
grade = 2;
} else if (gradeS.equals("D")) {
grade = 1;
} else {
grade = 0;
}
String[] Credits = {"2", "3", "4", "5", "6"};
int credits = Integer.parseInt((String) JOptionPane.showInputDialog(null,
"Choose credits:",
"",
JOptionPane.QUESTION_MESSAGE,
null,
Credits,
Credits[0]));
String id = idTextField.getText();
if (map.containsKey(id)) {
Student student = map.get(id);
student.addCourse(grade, credits);
map.put(id, student);
student.addCourse(grade, credits);
JOptionPane.showMessageDialog(null, student.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
}
}
}
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, "Error while " + action + " : " + ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
ex.printStackTrace();
}
}
});
}

}