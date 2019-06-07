import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
public class Main{
    public static void main(String[] args) {
         new MyWindow();
    }
}

class MyWindow extends JFrame {
    public MyWindow() {
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(true);
        JPanel jPanel = new JPanel(new GridLayout(1, 1));
        JButton button1 = new JButton("Push me");
        JButton button2 = new JButton("Clear");
        JTextField jTextField1 = new JTextField();
        jPanel.add(jTextField1);
        jPanel.add(button1);
        jPanel.add(button2);
        add(jPanel, BorderLayout.SOUTH);
        

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField1.getText() + "\n");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
            }
        });

        jTextField1.addKeyListener(new KeyAdapter() {
		    public void keyReleased(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_ENTER ) {
					jTextArea.append(jTextField1.getText() + "\n");   
				}
		    }           
		});

        add(jTextArea, BorderLayout.NORTH);
        setBounds(500, 300, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
