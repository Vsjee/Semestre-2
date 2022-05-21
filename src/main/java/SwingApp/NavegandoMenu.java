package SwingApp;

import SwingApp.frame2.MainInfoFrame;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class NavegandoMenu implements ActionListener {

    JMenuItem S1_Materia1;
    JButton semestreUno, semestreDos, semestreTres, semestreCuatro, semestreCinco, semestreSeis;
    String titulo;

    NavegandoMenu(JMenuItem S2_Materia1, JButton semestreUno, JButton semestreDos, JButton semestreTres, JButton semestreCuatro, JButton semestreCinco, JButton semestreSeis) {
        
        this.S1_Materia1 = S1_Materia1;
        
        this.semestreUno = semestreUno;
        this.semestreDos = semestreDos;
        this.semestreTres = semestreTres;
        this.semestreCuatro = semestreCuatro;
        this.semestreCinco = semestreCinco;
        this.semestreSeis = semestreSeis;
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem)e.getSource();
        titulo = menuItem.getText();
        
        recolector();
        
        new MainInfoFrame(titulo);
    }
    
    public void recolector() {
        
        if(titulo.equals("MÉTODOS DE ESTUDIO Y NUEVAS TECNOLOGÍAS DE LA COMUNICACIÓN")) {
            semestreUno.setText("MÉTODOS");
        } else if(titulo.equals("CÁTEDRA AGUSTINIANA")) {
            semestreUno.setText("CÁTEDRA");
        } else if(titulo.equals("INTRODUCCIÓN AL DESARROLLO DE SOFTWARE")) {
            semestreUno.setText("INTRODUCCIÓN");
        } else if(titulo.equals("ALGORITMIA Y PROGRAMACIÓN BÁSICA")) {
            semestreUno.setText("ALGORITMIA");
        } else if(titulo.equals("ALGEBRA LINEAL")) {
            semestreUno.setText("ALGEBRA");
        } else if(titulo.equals("CALCULO DIFERENCIAL")) {
            semestreUno.setText("CALCULO");
            /*
            */
        } else if(titulo.equals("CALCULO INTEGRAL")) {
            semestreDos.setText("CALCULO");
        } else if(titulo.equals("NGLES I")) {
            semestreDos.setText("INGLES I");
        } else if(titulo.equals("HUMANIDADES I")) {
            semestreDos.setText("HUMANIDADES I");
        } else if(titulo.equals("ESTRUCTURAS DE DATOS")) {
            semestreDos.setText("ESTRUCTURA");
        } else if(titulo.equals("PROGRAMACIÓN ORIENTADA A OBJETOS")) {
            semestreDos.setText("POO");
        } else if(titulo.equals("INTRODUCCIÓN AL EMPRENDIMIENTO")) {
            semestreDos.setText("EMPRENDIMIENTO I");
            /*
            */
        } else if(titulo.equals("CONTABILIDAD")) {
            semestreTres.setText("CONTABILIDAD");
        } else if(titulo.equals("ESTADISTICA")) {
            semestreTres.setText("ESTADISTICA");
        } else if(titulo.equals("ANÁLISIS Y DISEÑO DE SOFTWARE")) {
            semestreTres.setText("DISEÑO SOFTWARE");
        } else if(titulo.equals("MODELADO DE BASES DE DATOS")) {
            semestreTres.setText("BASES DE DATOS");
        } else if(titulo.equals("FUNDAMENTOS DE DESARROLLO WEB")) {
            semestreTres.setText("DESARROLLO WEB");
        } else if(titulo.equals("INGLES II")) {
            semestreTres.setText("INGLES II");
            /*
            */
        } else if(titulo.equals("EMPRENDIMIENTO I")) {
            semestreCuatro.setText("EMPRENDIMIENTO I");
        } else if(titulo.equals("ESTRUCTURAS DE DATOS AVANZADA")) {
            semestreCuatro.setText("ESTRUCTURAS AVANZADA");
        } else if(titulo.equals("CONSTRUCCIÓN DE APLICACIONES WEB")) {
            semestreCuatro.setText("APLICACIONES WEB");
        } else if(titulo.equals("GESTIÓN DE BASES DE DATOS")) {
            semestreCuatro.setText("GESTIÓN BASE DATOS");
        } else if(titulo.equals("TECNOLOGÍAS PARA APLICACIONES MOVILES")) {
            semestreCuatro.setText("TECNOLOGÍAS APPS MOVIL");
        } else if(titulo.equals("INGLES III")) {
            semestreCuatro.setText("INGLES III");
            /*
            */
        } else if(titulo.equals("SISTEMAS OPERATIVOS Y ARQUITECTURA DE HARDWARE")) {
            semestreCinco.setText("HARDWARE/OS");
        } else if(titulo.equals("TÉCNICAS AVANZADAS DE PROGRAMACIÓN PARA MÓVILES")) {
            semestreCinco.setText("MOBILE DEV");
        } else if(titulo.equals("ARQUITECTURA DE SOFTWARE")) {
            semestreCinco.setText("ARQUITECTURA S");
        } else if(titulo.equals("INVESTIGACIÓN FORMATIVA")) {
            semestreCinco.setText("INVESTIGACIÓN");
        } else if(titulo.equals("INGLES IV")) {
            semestreCinco.setText("INGLES IV");
        } else if(titulo.equals("ÉTICA")) {
            semestreCinco.setText("ÉTICA");
            /*
            */
        } else if(titulo.equals("DESARROLLO Y REFINAMIENTO DE SOFTWARE")) {
            semestreSeis.setText("REFINAMIENTO SOFTW");
        } else if(titulo.equals("OPCIÓN DE GRADO")) {
            semestreSeis.setText("OPCIÓN DE GRADO");
        } else if(titulo.equals("ELECTIVA PROFESIONAL I")) {
            semestreSeis.setText("ELECTIVA I");
        } else if(titulo.equals("ELECTIVA PROFESIONAL II")) {
            semestreSeis.setText("ELECTIVA II");
        } else if(titulo.equals("ELECTIVA PROFESIONAL III")) {
            semestreSeis.setText("ELECTIVA III");
        } else if(titulo.equals("LEGISLACIÓN TECNOLÓGICA")) {
            semestreSeis.setText("LEGISLACIÓN TIC");
            /*
            */
        }
    }
}
