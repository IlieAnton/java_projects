package Materie20082022.Combobox;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox {
    public static void main(String[] args) {

        JFrame app = new JFrame("Traduceri");
        String a[] = {"Buna dimineata!","Ce mai faci?", "La revedere!"};
        String b[] = {"Good Morning!","How are you doing","GoodBye!"};
        JComboBox box = new JComboBox(a);
        box.setBounds(10,10,140,60);
        app.add(box);

        JComboBox box2 = new JComboBox();
        box2.addItem("Engleza");
        box2.addItem("");
        box2.setBounds(170,10,140,60);
        app.add(box2);

        JLabel b2 = new JLabel();
        b2.setBounds(10,70,140,60);
        app.add(b2);


        JButton button = new JButton("Traduce");
        button.setBounds(340, 10,140,60);
        app.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1 = box.getSelectedItem().toString();
              //  if (a1.equals("Buna dimineata!")) {
              //      b2.setText("Good Morning!");
            //    }else if (a1.equals("Ce mai faci?")) {
              //      b2.setText("How are you doing?");
              //  }else if (a1.equals("La revedere!"))
                //    b2.setText("Goodbye!");
int pozitieselectata = box.getSelectedIndex();
                System.out.println(pozitieselectata);
                 b2.setText(b[pozitieselectata]);





                app.setVisible(false);
                app.setVisible(true);
            }
        });

        app.setLayout(null);
        app.setSize(800,800);
        app.setVisible(true);
    }
}
