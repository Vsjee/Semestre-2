package SwingApp;

import java.awt.Color;
import javax.swing.*;

public class Main {
    
    JFrame mainFrame;
    JMenuBar menu;
    JMenu Semestre1, Semestre2, Semestre3, Semestre4, Semestre5, Semestre6, Herramientas, salir;
    JMenuItem si, no;
    /*
    JMenuItem S1_Materia1, S1_Materia2, S1_Materia3, S1_Materia4, S1_Materia5, S1_Materia6;
    JMenuItem S2_Materia1, S2_Materia2, S2_Materia3, S2_Materia4, S2_Materia5, S2_Materia6;
    JMenuItem S3_Materia1, S3_Materia2, S3_Materia3, S3_Materia4, S3_Materia5, S3_Materia6;
    JMenuItem S4_Materia1, S4_Materia2, S4_Materia3, S4_Materia4, S4_Materia5, S4_Materia6;
    JMenuItem S5_Materia1, S5_Materia2, S5_Materia3, S5_Materia4, S5_Materia5, S5_Materia6;
    JMenuItem S6_Materia1, S6_Materia2, S6_Materia3, S6_Materia4, S6_Materia5, S6_Materia6;
    */
    Main() {
        
        mainFrame = new JFrame("Universitaria Uniagustiniana");
        mainFrame.setSize(600, 300);
        
        menu = new JMenuBar();
        mainFrame.add(menu, "North");
        
        Semestre1 = new JMenu("Semestre 1");
        Semestre2 = new JMenu("Semestre 2");
        Semestre3 = new JMenu("Semestre 3");
        Semestre4 = new JMenu("Semestre 4");
        Semestre5 = new JMenu("Semestre 5");
        Semestre6 = new JMenu("Semestre 6");
        menu.add(Semestre1);
        menu.add(Semestre2);
        menu.add(Semestre3);
        menu.add(Semestre4);
        menu.add(Semestre5);
        menu.add(Semestre6);
        
        //Semestre 1 Items
        JMenuItem S1_Materia1 = new JMenuItem("MÉTODOS DE ESTUDIO Y NUEVAS TECNOLOGÍAS DE LA COMUNICACIÓN");
        JMenuItem S1_Materia2 = new JMenuItem("CÁTEDRA AGUSTINIANA");
        JMenuItem S1_Materia3 = new JMenuItem("INTRODUCCIÓN AL DESARROLLO DE SOFTWARE");
        JMenuItem S1_Materia4 = new JMenuItem("ALGORITMIA Y PROGRAMACIÓN BÁSICA");
        JMenuItem S1_Materia5 = new JMenuItem("ALGEBRA LINEAL");
        JMenuItem S1_Materia6 = new JMenuItem("CALCULO DIFERENCIAL");       
        Semestre1.add(S1_Materia1);
        Semestre1.add(S1_Materia2);
        Semestre1.add(S1_Materia3);
        Semestre1.add(S1_Materia4);
        Semestre1.add(S1_Materia5);
        Semestre1.add(S1_Materia6);
        
        //Semestre 2 Items
        JMenuItem S2_Materia1 = new JMenuItem("CALCULO INTEGRAL");
        JMenuItem S2_Materia2 = new JMenuItem("NGLES I");
        JMenuItem S2_Materia3 = new JMenuItem("HUMANIDADES I");
        JMenuItem S2_Materia4 = new JMenuItem("ESTRUCTURAS DE DATOS");
        JMenuItem S2_Materia5 = new JMenuItem("PROGRAMACIÓN ORIENTADA A OBJETOS");
        JMenuItem S2_Materia6 = new JMenuItem("INTRODUCCIÓN AL EMPRENDIMIENTO");       
        Semestre2.add(S2_Materia1);
        Semestre2.add(S2_Materia2);
        Semestre2.add(S2_Materia3);
        Semestre2.add(S2_Materia4);
        Semestre2.add(S2_Materia5);
        Semestre2.add(S2_Materia6);
        
        //Semestre 3 Items
        JMenuItem S3_Materia1 = new JMenuItem("CONTABILIDAD");
        JMenuItem S3_Materia2 = new JMenuItem("ESTADISTICA");
        JMenuItem S3_Materia3 = new JMenuItem("ANÁLISIS Y DISEÑO DE SOFTWARE");
        JMenuItem S3_Materia4 = new JMenuItem("MODELADO DE BASES DE DATOS");
        JMenuItem S3_Materia5 = new JMenuItem("FUNDAMENTOS DE DESARROLLO WEB");
        JMenuItem S3_Materia6 = new JMenuItem("INGLES II");       
        Semestre3.add(S3_Materia1);
        Semestre3.add(S3_Materia2);
        Semestre3.add(S3_Materia3);
        Semestre3.add(S3_Materia4);
        Semestre3.add(S3_Materia5);
        Semestre3.add(S3_Materia6);
        
        //Semestre 4 Items
        JMenuItem S4_Materia1 = new JMenuItem("EMPRENDIMIENTO I");
        JMenuItem S4_Materia2 = new JMenuItem("ESTRUCTURAS DE DATOS AVANZADA");
        JMenuItem S4_Materia3 = new JMenuItem("CONSTRUCCIÓN DE APLICACIONES WEB");
        JMenuItem S4_Materia4 = new JMenuItem("GESTIÓN DE BASES DE DATOS");
        JMenuItem S4_Materia5 = new JMenuItem("TECNOLOGÍAS PARA APLICACIONES MOVILES");
        JMenuItem S4_Materia6 = new JMenuItem("INGLES III");       
        Semestre4.add(S4_Materia1);
        Semestre4.add(S4_Materia2);
        Semestre4.add(S4_Materia3);
        Semestre4.add(S4_Materia4);
        Semestre4.add(S4_Materia5);
        Semestre4.add(S4_Materia6);
        
        //Semestre 5 Items
        JMenuItem S5_Materia1 = new JMenuItem("SISTEMAS OPERATIVOS Y ARQUITECTURA DE HARDWARE");
        JMenuItem S5_Materia2 = new JMenuItem("TÉCNICAS AVANZADAS DE PROGRAMACIÓN PARA MÓVILES");
        JMenuItem S5_Materia3 = new JMenuItem("ARQUITECTURA DE SOFTWARE");
        JMenuItem S5_Materia4 = new JMenuItem("INVESTIGACIÓN FORMATIVA");
        JMenuItem S5_Materia5 = new JMenuItem("INGLES IV");
        JMenuItem S5_Materia6 = new JMenuItem("ÉTICA");       
        Semestre5.add(S5_Materia1);
        Semestre5.add(S5_Materia2);
        Semestre5.add(S5_Materia3);
        Semestre5.add(S5_Materia4);
        Semestre5.add(S5_Materia5);
        Semestre5.add(S5_Materia6);

        //Semestre 6 Items
        JMenuItem S6_Materia1 = new JMenuItem("DESARROLLO Y REFINAMIENTO DE SOFTWARE");
        JMenuItem S6_Materia2 = new JMenuItem("OPCIÓN DE GRADO");
        JMenuItem S6_Materia3 = new JMenuItem("ELECTIVA PROFESIONAL I");
        JMenuItem S6_Materia4 = new JMenuItem("ELECTIVA PROFESIONAL II");
        JMenuItem S6_Materia5 = new JMenuItem("ELECTIVA PROFESIONAL III");
        JMenuItem S6_Materia6 = new JMenuItem("LEGISLACIÓN TECNOLÓGICA");       
        Semestre6.add(S6_Materia1);
        Semestre6.add(S6_Materia2);
        Semestre6.add(S6_Materia3);
        Semestre6.add(S6_Materia4);
        Semestre6.add(S6_Materia5);
        Semestre6.add(S6_Materia6);
        
        //herramientas
        JSeparator separator = new JSeparator();
        menu.add(separator); 
        separator.setForeground(Color.white);
        Herramientas = new JMenu("Herramientas");
        salir = new JMenu("Salir");
        si = new JMenuItem("Si");
        no = new JMenuItem("No");
        menu.add(Herramientas);
        Herramientas.add(salir);
        salir.add(si);
        salir.add(no);
        
        Salir s = new Salir(si);
        si.addActionListener(s);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){public void run() {new Main();}});
    }
}
