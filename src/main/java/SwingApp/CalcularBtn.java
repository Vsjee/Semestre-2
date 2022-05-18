package SwingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class CalcularBtn implements ActionListener {
    
    JTextField definitiva, nota1, nota2, nota3;
    String valor1, valor2, valor3, totalSTR;
    int notaUno, notaDos, notaTres, total;
    
    public CalcularBtn(JTextField nota1, JTextField nota2, JTextField nota3, JTextField definitiva) {
        
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.definitiva = definitiva;
    }
    
    public String calcular() {
        
        valor1 = nota1.getText();
        valor2 = nota2.getText();
        valor3 = nota3.getText();
        
        notaUno = Integer.parseInt(valor1);
        notaDos = Integer.parseInt(valor2);
        notaTres = Integer.parseInt(valor3);
        
        if(notaUno >= 0 && notaDos >= 0 && notaTres >= 0) {
            
            total = (notaUno + notaDos + notaTres)/3;
            totalSTR = Integer.toString(total);   
        }
        
        return totalSTR;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        definitiva.setText(calcular());
    }
}
