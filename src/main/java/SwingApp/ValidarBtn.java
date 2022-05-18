package SwingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ValidarBtn implements ActionListener {

    JButton validar;
    String titulo;

    ValidarBtn(JButton validar, String titulo) {

        this.validar = validar;
        this.titulo = titulo;
    }

    public void actionPerformed(ActionEvent e) {
        new ValidarFrame(titulo);
    }
}
