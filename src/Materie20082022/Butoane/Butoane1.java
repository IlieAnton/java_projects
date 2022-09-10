package Materie20082022.Butoane;

import javax.swing.*;

public class Butoane1 {
    public static void main(String[] args) {

        JFrame app = new JFrame("Castiga 100000000 de lei!");
        app.setSize(400, 400);
        app.setLayout(null);
        app.setVisible(true);

        JLabel text = new JLabel("Apasa butoul de mai jos pentru a castiga 100000000 de lei!");
        text.setBounds(10, 10, 900, 40);
        app.add(text);

        JButton buton = new JButton("Apasa aici!");
        buton.setBounds(10, 50, 140, 30);
        app.add(buton);

        JButton buton1 = new JButton("Apasa acest buton, nu pe celalalt!");
        buton1.setBounds(10, 90, 280, 30);
        app.add(buton1);
    }
}
