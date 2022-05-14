package SwingApp;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class Salir implements ActionListener {
    
    JMenuItem si;
    
    Salir(JMenuItem si) {
        this.si = si;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}