package SwingApp.frame3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class PermanenciaBtn implements ActionListener {
    
    JTextField procesoTexto, obsevacionesTexto;
    String obtengoTexto, observacion;
    
    PermanenciaBtn(JTextField procesoTexto , JTextField obsevacionesTexto) {
        
        this.procesoTexto = procesoTexto;
        this.obsevacionesTexto = obsevacionesTexto;
    }
    
    public String retornoObservacion() {
        
        obtengoTexto = procesoTexto.getText();
        
        if("Aprobo".equals(obtengoTexto)) {
            observacion = "Al dia";
        } else {
            observacion = "Caso Academico";
        }
        
        return observacion;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        retornoObservacion();
        obsevacionesTexto.setText(observacion);
    }
}
