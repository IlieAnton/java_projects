package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ButonActiune6 {
    public static void main(String[] args) {
        Random r = new Random();
        int r2[] = {r.nextInt(100)};
        int r3[] = {r.nextInt(100)};
        JFrame calculator = new JFrame("Calculator 2022");
        calculator.setLayout(null);
        calculator.setSize(500,500);
        calculator.setVisible(true);

        JLabel text = new JLabel("Acest calculator merge singur!");
        text.setBounds(10,10,140,140);
        calculator.add(text);

        JButton buton = new JButton("Apasa");
        buton.setBounds(10,100,90,90);
        calculator.add(buton);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel text1 = new JLabel("Nr. 2: "+ r2[0] + " ");
                text1.setBounds(10,170,170,170);
                calculator.add(text1);

                JLabel text2 = new JLabel("Nr. 1: "+ r3[0] + " ");
                text2.setBounds(50,200,170,170);
                calculator.add(text2);
                calculator.setVisible(false);
                calculator.setVisible(true);

                JLabel text3 = new JLabel(" " + r3 + "+" + r2);
                text3.setBounds(50,230,170,170);
                calculator.add(text3);

                JLabel text4 = new JLabel(" " + r3 + r2 + " ");
                text3.setBounds(50,260,170,170);
                calculator.add(text4);

            }
        });

    }
}
