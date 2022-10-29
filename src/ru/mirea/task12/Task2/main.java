package ru.mirea.task12.Task2;

import javax.swing.*;

public class main extends JFrame {
    main(String s)
    {
        super("Task");
        setSize(400,500);
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(s);
        jLabel.setIcon(imageIcon);
        add(jLabel);
        setVisible(true);
    }
    public static void main(String []args)
    {
        new main(args[0]);
    }
}
