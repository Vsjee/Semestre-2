package SwingApp;

import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavegandoMenu implements ActionListener {

    JMenuItem S1_Materia1, S1_Materia2, S1_Materia3, S1_Materia4, S1_Materia5, S1_Materia6;
    JMenuItem S2_Materia1, S2_Materia2, S2_Materia3, S2_Materia4, S2_Materia5, S2_Materia6;
    JMenuItem S3_Materia1, S3_Materia2, S3_Materia3, S3_Materia4, S3_Materia5, S3_Materia6;
    JMenuItem S4_Materia1, S4_Materia2, S4_Materia3, S4_Materia4, S4_Materia5, S4_Materia6;
    JMenuItem S5_Materia1, S5_Materia2, S5_Materia3, S5_Materia4, S5_Materia5, S5_Materia6;
    JMenuItem S6_Materia1, S6_Materia2, S6_Materia3, S6_Materia4, S6_Materia5, S6_Materia6;

    NavegandoMenu(JMenuItem S1_Materia1) {
        this.S1_Materia1 = S1_Materia1;
    }

    public void actionPerformed(ActionEvent e) {
        new MainInfoFrame();
    }
}
