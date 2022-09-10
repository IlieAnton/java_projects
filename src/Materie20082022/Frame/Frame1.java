package Materie20082022.Frame;

import javax.swing.*;

public class Frame1 {
    public static void main(String[] args) {
        JFrame app = new JFrame("Aplicatie");
        app.setSize(300, 300);
        app.setVisible(true);
        app.setLayout(null);

        JLabel text = new JLabel("Buna ziua");
        text.setBounds(5, 5, 200, 10);
        app.add(text);

        JLabel text2 = new JLabel("Aceasta este prima mea aplicatie");
        text2.setBounds(5, 20, 200, 20);
        app.add(text2);

        JLabel propozitie = new JLabel("Astazi am invatat sa fac un frame, sa ii dau un nume aplicatiei si sa pun text in aplicatie");
        propozitie.setBounds(5, 40, 800, 30);
        app.add(propozitie);
    }
}
