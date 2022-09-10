package Materie20082022.ButonActiune;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ganditrobot2 {
    public static void main(String[] args) {
        final int[] b = {160};
        int a = 7;
        Random r = new Random();
        int randomizare[] = {r.nextInt(4), r.nextInt(4),r.nextInt(4)};

        String subiecte[] = {"Habarnam", "Gogoasa", "Stietot", "Limonada"};
        String predicate[] = {"merge", "sare", "vorbeste", "mananca"};
        String Cuvinte[] = {"repede", "fericit", "plictisit", "emotionat"};
        JFrame app = new JFrame("Robot de gandit 2.0");
        app.setSize(400, 400);
        app.setVisible(true);
        app.setLayout(null);
        JButton Gandit = new JButton("Genereaza");
        Gandit.setBounds(10, 10, 140, 140);
        app.add(Gandit);
        Gandit.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         JLabel Text = new JLabel(subiecte[randomizare[0]] + " " + predicate[randomizare[1]] + " " + Cuvinte[randomizare[2]] + ".");
                                     Text.setBounds(5,b[0],800,30);
                                     app.add(Text);
                                     app.setVisible(false);
                                     b[0] = b[0] + 40;
                                     app.setVisible(true);
                                     randomizare[0] = r.nextInt(4);
                                     randomizare[1] = r.nextInt(4);
                                     randomizare[2] = r.nextInt(4);
                                 }
        }
        );
    }
}




