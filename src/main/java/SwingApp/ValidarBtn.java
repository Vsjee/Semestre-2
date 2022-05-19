package SwingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ValidarBtn implements ActionListener {

    JButton validar;
    JTextField definitivaTexto;
    String titulo, notaFinal;

    ValidarBtn(JButton validar, String titulo, JTextField definitivaTexto) {

        this.validar = validar;
        this.titulo = titulo;
        this.definitivaTexto = definitivaTexto;
    }

    public void actionPerformed(ActionEvent e) {
        notaFinal = definitivaTexto.getText();
        new ValidarFrame(titulo, notaFinal);
    }
}
