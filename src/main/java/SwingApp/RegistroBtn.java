package SwingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class RegistroBtn implements ActionListener {
    
    JTextField procesoTexto;
    String notaFinal, notaFinalComprobada;
    int notaFinalInt;
    
    RegistroBtn(String notaFinal, JTextField procesoTexto) {
        
        this.notaFinal =  notaFinal;
        this.procesoTexto = procesoTexto;
    }
    
    public String retornoProceso() {
        
        notaFinalInt = Integer.parseInt(notaFinal);
        
        if(notaFinalInt >= 30 ) {
            notaFinalComprobada = "Aprobo";
        } else {
            notaFinalComprobada = "No Aprobo";
        }
        
        return notaFinalComprobada;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        retornoProceso();
        procesoTexto.setText(notaFinalComprobada);
    }
}
