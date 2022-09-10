package Materie20082022.Scris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scris1 {
    public static void main(String[] args) {
        JFrame app = new JFrame("Login");


        JLabel text = new JLabel("Enter your username");
        text.setBounds(10, 10, 130, 30);
        app.add(text);

        JTextField textField = new JTextField();
        textField.setBounds(10, 40, 130, 30);
        app.add(textField);

        JLabel password = new JLabel("Enter password");
        password.setBounds(10, 80, 130, 30);
        app.add(password);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(10, 110, 130, 30);
        app.add(passwordField);

        JButton login = new JButton("Click to login");
        login.setBounds(170, 10, 130, 30);
        app.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setVisible(false);
                JFrame loginsite = new JFrame("Login");
                JLabel text = new JLabel("Enter your username");
                text.setBounds(10, 10, 130, 30);
                loginsite.add(text);

                JButton verification = new JButton("Login");
                verification.setBounds(10, 140, 130, 30);
                loginsite.add(verification);


                JTextField textField = new JTextField();
                textField.setBounds(10, 40, 130, 30);
                loginsite.add(textField);

                JLabel password = new JLabel("Enter password");
                password.setBounds(10, 80, 130, 30);
                loginsite.add(password);

                JPasswordField passwordField = new JPasswordField();
                passwordField.setBounds(10, 110, 130, 30);
                loginsite.add(passwordField);

                String goodpass = ("iamathome");

                if (passwordField.equals(goodpass)) {
                    verification.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            loginsite.setVisible(false);

                        }
                    });
                }
                loginsite.setSize(400, 400);
                loginsite.setLayout(null);
                JFrame logedin = new JFrame("site");


                logedin.setSize(400, 400);
                logedin.setLayout(null);
                logedin.setVisible(true);
            }
        });

        JButton button = new JButton("Confirm");
        button.setBounds(10, 140, 130, 30);
        app.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setVisible(false);
                JFrame site = new JFrame("Site");
                site.setSize(400, 400);
                site.setLayout(null);
                site.setVisible(true);
                String user = textField.getText();
                String pass = passwordField.getText();


                JLabel info = new JLabel("Welcome " + user + "!");
                info.setBounds(10, 40, 130, 30);
                site.add(info);

                JLabel info2 = new JLabel("Your password is " + pass);
                info2.setBounds(10, 70, 250, 30);
                site.add(info2);

                JLabel member = new JLabel("You are a officer of the army");
                member.setBounds(10, 100, 130, 30);
                site.add(member);
//stop
                JLabel welcome = new JLabel("Site");
                welcome.setBounds(10, 10, 130, 30);
                site.add(welcome);

                String user1 = textField.getText();
                String pass2 = passwordField.getText();


                JLabel infod = new JLabel("Welcome " + user1 + "!");
                info.setBounds(10, 40, 130, 30);
                site.add(info);

                JLabel infoc = new JLabel("Your password is " + pass2);
                info2.setBounds(10, 70, 250, 30);
                site.add(info2);

                site.setSize(400, 400);
                site.setLayout(null);
                site.setVisible(true);
            }
        });

        app.setSize(400, 400);
        app.setLayout(null);
        app.setVisible(true);

    }
}
