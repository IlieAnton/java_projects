package Materie20082022.Scris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parola {
    public static void main(String[] args) {
        JFrame app = new JFrame("Password");

        JTextField text = new JTextField();
        text.setBounds(10,10,130,30);
        app.add(text);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(10,50,130,30);
        app.add(passwordField);

        JLabel text2 = new JLabel();
        text2.setBounds(10,150,130,30);
        app.add(text2);

        JButton button = new JButton("Afisare");
        button.setBounds(10,100,130,30);
        app.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1 = passwordField.getText();
                text2.setText(a1);


                app.setVisible(false);
                app.setVisible(true);
            }
        });




        app.setSize(500,500);
        app.setLayout(null);
        app.setVisible(true);
    }
}
