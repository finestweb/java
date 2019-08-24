package ru.geekbrains.les_5_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new MyWindow();
    }
}

class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("FIO");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jp = new JPanel(new GridLayout(1,2));
        JTextField jtf = new JTextField();
        JButton btn = new JButton("Open the window");

        jp.add(jtf);
        jp.add(btn);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame MyWindow2 = new JFrame();
                MyWindow2.pack();
                MyWindow2.setTitle("Second Window");
                MyWindow2.setBounds(200,200,500,500);
                JPanel jp2 = new JPanel(new GridLayout(4,1));
                JTextField jtf2 = new JTextField();
                JTextField jtf3 = new JTextField();
                JTextField jtf4 = new JTextField();
                JButton btn2 = new JButton("Input information");
                jp2.add(jtf2);
                jp2.add(jtf3);
                jp2.add(jtf4);
                jp2.add(btn2);
                MyWindow2.add(jp2, BorderLayout.NORTH);
                MyWindow2.setVisible(true);
                
                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String result = jtf2.getText() + " " + jtf3.getText() + " " + jtf4.getText();
                        //System.out.println(result);
                        jtf.setText(result);
                        MyWindow2.setVisible(false);
                    }
                });
            }
        });

        add(jp, BorderLayout.SOUTH);
        setBounds(100,100,500,500);
        setVisible(true);
    }
}

class MyWindow2 extends JFrame {
    public MyWindow2() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
    }
}
