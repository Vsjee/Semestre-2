package SwingApp;

import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavegandoMenu implements ActionListener {

    JMenuItem S1_Materia1;
    String s;

    NavegandoMenu(JMenuItem S2_Materia1) {
        this.S1_Materia1 = S1_Materia1;
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem)e.getSource();
        s = menuItem.getText();
        new MainInfoFrame(s);
    }
}
