import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame{
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton btnOk;
    private JButton btnClear;
    private JLabel lbWelcome;
    private JPanel mainPanel;

    public test () {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String firstName = tfFirstName.getText();
               String lastName = tfLastName.getText();
                lbWelcome.setText("Welcome " + firstName + " " + lastName);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });
    }
    public static void main(String[] args){
        test test2 = new test();
    }
}
