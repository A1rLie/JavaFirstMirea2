package ru.mirea.task15.Task1;

import javax.swing.*;
import java.awt.event.*;
public class Main {
    JFrame f;
    Main(){
        f=new JFrame("ComboBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton b=new JButton("Show");
        b.setBounds(200,100,75,20);
        String country[]={"Australia","Russia","German","India","China"};
        final JComboBox cb=new JComboBox(country);
        cb.setBounds(50, 100,90,20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Country Selected: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
