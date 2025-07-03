import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Username:" );
        JTextField textField = new JTextField(20);//passing width

        JLabel label1 = new JLabel("Password:");
        JTextField textField1 = new JTextField(20);//passing width
        JButton button = new JButton("log in");

        

        button.addActionListener(e -> {
            String Username = textField.getText();
            String Passeord=textField.getText();
            JOptionPane.showMessageDialog(frame, Username""+ Password"");//== supports only non primitive data
            if(Username.equals("admin") && password.equals  
            {   

            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(label1);
        panel.add(textField1);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}

