package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonActiune3 {
    public static void main(String[] args) {
        final int []nrbuton1 = {0};
        final int []nrbuton2 = {0};
        JFrame app = new JFrame("Doua butoane");
        app.setSize(400,400);
        app.setLayout(null);
        app.setVisible(true);

        JButton buton1 = new JButton("Buton 1");
        buton1.setBounds(10,10, 150, 150);
        app.add(buton1);
        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nrbuton1[0] = nrbuton1[0]+1;
                System.out.println("Ai apasat primul buton de " + nrbuton1[0]);
            }
        });

        JButton buton2 = new JButton("Buton 2");
        buton2.setBounds(150, 10 , 150,150);
        app.add(buton2);
        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nrbuton2[0] = nrbuton2[0] +1;
                System.out.println("Ai apasat al doilea buton de " + nrbuton2[0]);
            }
        });
    }
}
