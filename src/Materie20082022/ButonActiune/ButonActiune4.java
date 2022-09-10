package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonActiune4 {
    public static void main(String[] args) {
        JFrame app = new JFrame("Text");
        app.setVisible(true);
        app.setSize(400,400);
        app.setLayout(null);

        JButton buton = new JButton("Apasa pentru a vedea urmatorul text");
        buton.setBounds(10,10,160,160);
        app.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel text = new JLabel("Acesta este textul");
                text.setBounds(10,350,260,260);
                app.add(text);
                app.setVisible(false);
                app.setVisible(true);
            }
        });
    }
}
