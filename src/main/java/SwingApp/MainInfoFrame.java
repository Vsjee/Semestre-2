package SwingApp;

import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;

public class MainInfoFrame {
    
    JFrame mainFrame;
    
    MainInfoFrame(String s) {
        mainFrame = new JFrame(s);
        mainFrame.setSize(598, 414);

        //logo
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/SwingApp/logo-Uniagustiniana-comoes.png");
        mainFrame.setIconImage(icon);

        //background
        JLabel background = new JLabel(new ImageIcon("src/main/java/SwingApp/fondo.jpg"));
        mainFrame.add(background);
        background.setBounds(0, 0, 598, 414);
        
        //contenido
        
        //frame
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}
