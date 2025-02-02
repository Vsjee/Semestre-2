package SwingApp;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class Main {

    JFrame mainFrame;
    JMenuBar menu;
    JMenu Semestre1, Semestre2, Semestre3, Semestre4, Semestre5, Semestre6, Herramientas, salir;
    JMenuItem si, no;

    JMenuItem S1_Materia1, S1_Materia2, S1_Materia3, S1_Materia4, S1_Materia5, S1_Materia6;
    JMenuItem S2_Materia1, S2_Materia2, S2_Materia3, S2_Materia4, S2_Materia5, S2_Materia6;
    JMenuItem S3_Materia1, S3_Materia2, S3_Materia3, S3_Materia4, S3_Materia5, S3_Materia6;
    JMenuItem S4_Materia1, S4_Materia2, S4_Materia3, S4_Materia4, S4_Materia5, S4_Materia6;
    JMenuItem S5_Materia1, S5_Materia2, S5_Materia3, S5_Materia4, S5_Materia5, S5_Materia6;
    JMenuItem S6_Materia1, S6_Materia2, S6_Materia3, S6_Materia4, S6_Materia5, S6_Materia6;

    Main() {

        mainFrame = new JFrame("Universitaria Uniagustiniana");
        mainFrame.setSize(613, 414);

        //logo
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/SwingApp/img/logo-Uniagustiniana-comoes.png");
        mainFrame.setIconImage(icon);

        //background
        JLabel background = new JLabel(new ImageIcon("src/main/java/SwingApp/img/fondo.jpg"));
        mainFrame.add(background);

        //menu bar
        menu = new JMenuBar();
        mainFrame.add(menu, "North");
        
        JSeparator separator = new JSeparator();
        menu.add(separator);
        separator.setForeground(Color.white);
        
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
        S1_Materia1 = new JMenuItem("MÉTODOS DE ESTUDIO Y NUEVAS TECNOLOGÍAS DE LA COMUNICACIÓN");
        S1_Materia2 = new JMenuItem("CÁTEDRA AGUSTINIANA");
        S1_Materia3 = new JMenuItem("INTRODUCCIÓN AL DESARROLLO DE SOFTWARE");
        S1_Materia4 = new JMenuItem("ALGORITMIA Y PROGRAMACIÓN BÁSICA");
        S1_Materia5 = new JMenuItem("ALGEBRA LINEAL");
        S1_Materia6 = new JMenuItem("CALCULO DIFERENCIAL");
        Semestre1.add(S1_Materia1);
        Semestre1.add(S1_Materia2);
        Semestre1.add(S1_Materia3);
        Semestre1.add(S1_Materia4);
        Semestre1.add(S1_Materia5);
        Semestre1.add(S1_Materia6);

        //Semestre 2 Items
        S2_Materia1 = new JMenuItem("CALCULO INTEGRAL");
        S2_Materia2 = new JMenuItem("NGLES I");
        S2_Materia3 = new JMenuItem("HUMANIDADES I");
        S2_Materia4 = new JMenuItem("ESTRUCTURAS DE DATOS");
        S2_Materia5 = new JMenuItem("PROGRAMACIÓN ORIENTADA A OBJETOS");
        S2_Materia6 = new JMenuItem("INTRODUCCIÓN AL EMPRENDIMIENTO");
        Semestre2.add(S2_Materia1);
        Semestre2.add(S2_Materia2);
        Semestre2.add(S2_Materia3);
        Semestre2.add(S2_Materia4);
        Semestre2.add(S2_Materia5);
        Semestre2.add(S2_Materia6);

        //Semestre 3 Items
        S3_Materia1 = new JMenuItem("CONTABILIDAD");
        S3_Materia2 = new JMenuItem("ESTADISTICA");
        S3_Materia3 = new JMenuItem("ANÁLISIS Y DISEÑO DE SOFTWARE");
        S3_Materia4 = new JMenuItem("MODELADO DE BASES DE DATOS");
        S3_Materia5 = new JMenuItem("FUNDAMENTOS DE DESARROLLO WEB");
        S3_Materia6 = new JMenuItem("INGLES II");
        Semestre3.add(S3_Materia1);
        Semestre3.add(S3_Materia2);
        Semestre3.add(S3_Materia3);
        Semestre3.add(S3_Materia4);
        Semestre3.add(S3_Materia5);
        Semestre3.add(S3_Materia6);

        //Semestre 4 Items
        S4_Materia1 = new JMenuItem("EMPRENDIMIENTO I");
        S4_Materia2 = new JMenuItem("ESTRUCTURAS DE DATOS AVANZADA");
        S4_Materia3 = new JMenuItem("CONSTRUCCIÓN DE APLICACIONES WEB");
        S4_Materia4 = new JMenuItem("GESTIÓN DE BASES DE DATOS");
        S4_Materia5 = new JMenuItem("TECNOLOGÍAS PARA APLICACIONES MOVILES");
        S4_Materia6 = new JMenuItem("INGLES III");
        Semestre4.add(S4_Materia1);
        Semestre4.add(S4_Materia2);
        Semestre4.add(S4_Materia3);
        Semestre4.add(S4_Materia4);
        Semestre4.add(S4_Materia5);
        Semestre4.add(S4_Materia6);

        //Semestre 5 Items
        S5_Materia1 = new JMenuItem("SISTEMAS OPERATIVOS Y ARQUITECTURA DE HARDWARE");
        S5_Materia2 = new JMenuItem("TÉCNICAS AVANZADAS DE PROGRAMACIÓN PARA MÓVILES");
        S5_Materia3 = new JMenuItem("ARQUITECTURA DE SOFTWARE");
        S5_Materia4 = new JMenuItem("INVESTIGACIÓN FORMATIVA");
        S5_Materia5 = new JMenuItem("INGLES IV");
        S5_Materia6 = new JMenuItem("ÉTICA");
        Semestre5.add(S5_Materia1);
        Semestre5.add(S5_Materia2);
        Semestre5.add(S5_Materia3);
        Semestre5.add(S5_Materia4);
        Semestre5.add(S5_Materia5);
        Semestre5.add(S5_Materia6);

        //Semestre 6 Items
        S6_Materia1 = new JMenuItem("DESARROLLO Y REFINAMIENTO DE SOFTWARE");
        S6_Materia2 = new JMenuItem("OPCIÓN DE GRADO");
        S6_Materia3 = new JMenuItem("ELECTIVA PROFESIONAL I");
        S6_Materia4 = new JMenuItem("ELECTIVA PROFESIONAL II");
        S6_Materia5 = new JMenuItem("ELECTIVA PROFESIONAL III");
        S6_Materia6 = new JMenuItem("LEGISLACIÓN TECNOLÓGICA");
        Semestre6.add(S6_Materia1);
        Semestre6.add(S6_Materia2);
        Semestre6.add(S6_Materia3);
        Semestre6.add(S6_Materia4);
        Semestre6.add(S6_Materia5);
        Semestre6.add(S6_Materia6);

        //Herramientas
        Herramientas = new JMenu("Herramientas");
        salir = new JMenu("Salir");
        si = new JMenuItem("Si");
        no = new JMenuItem("No");
        menu.add(Herramientas);
        Herramientas.add(salir);
        salir.add(si);
        salir.add(no);

        //salir
        si.addActionListener(e -> {
            mainFrame.dispose();
        });

        //JToolBar----------------------
        JButton semestreUno, semestreDos, semestreTres, semestreCuatro, semestreCinco, semestreSeis;
        
        JToolBar toolBar = new JToolBar();
        JToolBar barraBotones = new JToolBar();
        
        semestreUno = new JButton("1");
        semestreDos = new JButton("2");
        semestreTres = new JButton("3");
        semestreCuatro = new JButton("4");
        semestreCinco = new JButton("5");
        semestreSeis = new JButton("6");
        
        barraBotones.add(semestreUno);
        barraBotones.add(semestreDos);
        barraBotones.add(semestreTres);
        barraBotones.add(semestreCuatro);
        barraBotones.add(semestreCinco);
        barraBotones.add(semestreSeis);
        
        //toolBar.setLayout(null);
        background.add(barraBotones, "North");
        barraBotones.setBounds(0, 0, 598, 30);
        
        //Navegacion
        NavegandoMenu a = new NavegandoMenu(S1_Materia1, semestreUno, semestreDos, semestreTres, semestreCuatro, semestreCinco, semestreSeis);
        S1_Materia1.addActionListener(a);
        S1_Materia2.addActionListener(a);
        S1_Materia3.addActionListener(a);
        S1_Materia4.addActionListener(a);
        S1_Materia5.addActionListener(a);
        S1_Materia6.addActionListener(a);
        //
        S2_Materia1.addActionListener(a);
        S2_Materia2.addActionListener(a);
        S2_Materia3.addActionListener(a);
        S2_Materia4.addActionListener(a);
        S2_Materia5.addActionListener(a);
        S2_Materia6.addActionListener(a);
        //
        S3_Materia1.addActionListener(a);
        S3_Materia2.addActionListener(a);
        S3_Materia3.addActionListener(a);
        S3_Materia4.addActionListener(a);
        S3_Materia5.addActionListener(a);
        S3_Materia6.addActionListener(a);
        //
        S4_Materia1.addActionListener(a);
        S4_Materia2.addActionListener(a);
        S4_Materia3.addActionListener(a);
        S4_Materia4.addActionListener(a);
        S4_Materia5.addActionListener(a);
        S4_Materia6.addActionListener(a);
        //
        S5_Materia1.addActionListener(a);
        S5_Materia2.addActionListener(a);
        S5_Materia3.addActionListener(a);
        S5_Materia4.addActionListener(a);
        S5_Materia5.addActionListener(a);
        S5_Materia6.addActionListener(a);
        //
        S6_Materia1.addActionListener(a);
        S6_Materia2.addActionListener(a);
        S6_Materia3.addActionListener(a);
        S6_Materia4.addActionListener(a);
        S6_Materia5.addActionListener(a);
        S6_Materia6.addActionListener(a);

        //frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
