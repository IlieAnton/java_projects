package Materie20082022.Scris;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrisTema {
    public static void main(String[] args) {

        JFrame app = new JFrame("Calculator");

        JTextField a1 = new JTextField();
        a1.setBounds(10,10,130,30);
        app.add(a1);

        JTextField a2 = new JTextField();
        a2.setBounds(10,40,130,30);
        app.add(a2);

        JTextField a3 = new JTextField();
        a3.setBounds(10,70,130,30);
        app.add(a3);

        JButton button = new JButton("calculeaza");
        button.setBounds(10,120,130,30);
        app.add(button);
        JLabel text = new JLabel();
        text.setBounds(10, 160, 130, 30);
        app.add(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b1 = a1.getText();
                String b2 = a3.getText();
                String simbol = a2.getText();
                int i = Integer.parseInt(b1);
                int i1 = Integer.parseInt(b2);
                if (simbol.equals("+")) {
                    text.setText("Rezultatul este: " + (i + i1));


                } else if (simbol.equals("-")) {
                    text.setText("Rezultatul este: " + (i - i1));
                } else if (simbol.equals("*")) {
                    text.setText("Rezultatul este: " + (i * i1));
                } else if  (simbol.equals("/")) {
                    text.setText("Rezultatul este: " + (i / i1));
            }else {
                    text.setText("eroare");
                }
                app.setVisible(false);
                app.setVisible(true);


            }
        });
        app.setLayout(null);
        app.setSize(500,500);
        app.setVisible(false);
        app.setVisible(true);


    }
}
