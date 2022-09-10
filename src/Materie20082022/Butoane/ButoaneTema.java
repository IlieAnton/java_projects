package Materie20082022.Butoane;

import javax.swing.*;

public class ButoaneTema {
    public static void main(String[] args) {

        JFrame app = new JFrame("Materie20082022.Frame si Materie20082022.Butoane pentru incepatori");
        app.setSize(600,600);
        app.setLayout(null);
        app.setVisible(true);

        JLabel text = new JLabel("Acesta este un text");
        text.setBounds(10,10, 160 , 30);
        app.add(text);

        JButton buton = new JButton("Acesta este un button");
        buton.setBounds(10, 40 , 160 , 60);
        app.add(buton);

    }
}
