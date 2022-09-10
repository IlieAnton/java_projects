package Materie20082022.Frame;

import javax.swing.*;

public class TemaFrame {
    public static void main(String[] args) {
        JFrame app = new JFrame("Aplicatie");
        app.setSize(300, 300);
        app.setVisible(true);
        app.setLayout(null);

        JLabel text = new JLabel("Hello");
        text.setBounds(5, 5, 200, 10);
        app.add(text);

        JLabel text2 = new JLabel("Aceasta este cea mai buna si performanta aplicatie creata vreodata");
        text2.setBounds(5, 10, 900, 30);
        app.add(text2);

        JLabel text3 = new JLabel("Instaleaza aceasta aplicatie, nu are virusi :)");
        text3.setBounds(5, 15, 900, 50);
        app.add(text3);
    }
}
