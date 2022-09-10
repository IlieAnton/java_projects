package Materie20082022.Butoane;

import javax.swing.*;

public class Butoane2 {
    public static void main(String[] args) {
        JFrame app = new JFrame("Aplicatie Cazare");
        app.setSize(800,500);
        app.setLayout(null);
        app.setVisible(true);

        JLabel text = new JLabel("Vrei sa te cazezi undeva? Aici sunt listate cele mai avantajoase cazari!");
        text.setBounds(10,10, 900, 30);
        app.add(text);

        JButton cazare1 = new JButton("Cazare la Sibiu");
        cazare1.setBounds(10, 40, 160, 30);
        app.add(cazare1);

        JButton cazare2 = new JButton("Cazare la Constanta");
        cazare2.setBounds(10,80,160, 30);
        app.add(cazare2);

        JButton cazare3 = new JButton("Cazare la Bucuresti");
        cazare3.setBounds(190,45 , 260 , 160);
        app.add(cazare3);

        JButton cazare4 = new JButton("Cazare la Sinaia");
        cazare4.setBounds(470, 40, 160 , 30);
        app.add(cazare4);

        JButton cazare5 = new JButton("Cazare la iasi");
        cazare5.setBounds(470, 80, 160, 30);
        app.add((cazare5));
    }
}
