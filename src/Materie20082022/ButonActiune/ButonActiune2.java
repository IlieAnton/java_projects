package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonActiune2 {
    public static void main(String[] args) {
        final int[] numaratoare = {0};
        JFrame app = new JFrame("Numaratoare");
        app.setVisible(true);
        app.setLayout(null);
        app.setSize(400, 400);

        JButton buton = new JButton("Apasa de cate ori vrei");
        buton.setBounds(10, 10, 260, 200);
        app.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numaratoare[0] = numaratoare[0] + 1;
                System.out.println("Ai apasat de " + numaratoare[0]);
            }
        });
    }
}
