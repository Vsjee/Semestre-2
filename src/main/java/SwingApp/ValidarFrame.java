package SwingApp;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ValidarFrame {
    
    JFrame mainValidarFrame;
    
    ValidarFrame(String titulo) {
        
        mainValidarFrame = new JFrame(titulo);
        mainValidarFrame.setSize(598, 414);

        //logo
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/SwingApp/logo-Uniagustiniana-comoes.png");
        mainValidarFrame.setIconImage(icon);

        //background
        JLabel background = new JLabel(new ImageIcon("src/main/java/SwingApp/fondo.jpg"));
        mainValidarFrame.add(background);
        background.setBounds(0, 0, 598, 414);
        
        //frame
        mainValidarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainValidarFrame.setLocationRelativeTo(null);
        mainValidarFrame.setResizable(false);
        mainValidarFrame.setLayout(null);
        mainValidarFrame.setVisible(true);
    }
}
