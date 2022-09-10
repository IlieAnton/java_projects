package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonActiune1 {
    public static void main(String[] args) {
        JFrame app = new JFrame("Apasa butonul");
        app.setSize(400, 400);
        app.setLayout(null);
        app.setVisible(true);

        JButton buton = new JButton("Apasa pe buton");
        buton.setBounds(10, 10, 160, 300);
        app.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ai apasat pe buton");
            }
        });
    }
}
