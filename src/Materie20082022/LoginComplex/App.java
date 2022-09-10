package Materie20082022.LoginComplex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame app = new JFrame("Sign up");

        JLabel text1 = new JLabel("Salut! Introduce o parola si username pentru a crea un cont.");
        text1.setBounds(10,10,800,30);
        app.add(text1);

        JLabel text2 = new JLabel("Username");
        text2.setBounds(10,50,300,30);
        app.add(text2);

        JTextField field = new JTextField();
        field.setBounds(10,80,200,20);
        app.add(field);

        JLabel text3 = new JLabel("Password");
        text3.setBounds(10,120,300,30);
        app.add(text3);

        JPasswordField field2 = new JPasswordField();
        field2.setBounds(10,150,200,20);
        app.add(field2);

        JLabel text4 = new JLabel("Enter your birthday");
        text4.setBounds(10,190,300,30);
        app.add(text4);

        JComboBox box1 = new JComboBox();
        box1.addItem("2009");
        box1.addItem("2010");
        box1.addItem("2011");
        box1.addItem("2012");
        box1.setBounds(10,220,90,30);
        app.add(box1);

        JComboBox box2 = new JComboBox();
        box2.addItem("06");
        box2.addItem("07");
        box2.addItem("08");
        box2.addItem("09");
        box2.addItem("10");
        box2.addItem("11");
        box2.addItem("12");
        box2.setBounds(100,220,90,30);
        app.add(box2);

        JComboBox box3 = new JComboBox();
        box3.addItem("1");
        box3.addItem("2");
        box3.addItem("3");
        box3.addItem("4");
        box3.addItem("5");
        box3.addItem("6");
        box3.setBounds(190,220,90,30);
        app.add(box3);

        JButton buton = new JButton("Sign up");
        buton.setBounds(90,270,90,30);
        app.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.setVisible(false);
                JFrame app2 = new JFrame("App");
                app2.setSize(800,800);
                app2.setLayout(null);
                app2.setVisible(true);

                JLabel text5 = new JLabel("Welcome to our app!");
                text5.setSize(800,800);
                text5.setBounds(10,10,200,40);
                app2.add(text5);
            }
        });



        app.setSize(800,800);
        app.setLayout(null);
        app.setVisible(true);
    }
}
