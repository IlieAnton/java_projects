package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonActiune5 {
    public static void main(String[] args) {
        final int[] Numerotare = {0};
        JFrame app = new JFrame("Materie20082022.Butoane care apar");
        app.setSize(400, 400);
        app.setVisible(true);
        app.setLayout(null);

        JButton buton = new JButton("Apasa aici");
        buton.setBounds(10, 10, 170, 170);
        app.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Numerotare[0] = Numerotare[0] + 50;
                JButton b = new JButton("Copie");
                b.setBounds(10, Numerotare[0], 150, 150);
                app.add(b);
                app.setVisible(false);
                app.setVisible(true);
            }
        });
    }
}
