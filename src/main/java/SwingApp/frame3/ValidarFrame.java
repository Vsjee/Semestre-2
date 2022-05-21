package SwingApp.frame3;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ValidarFrame {
    
    JFrame mainValidarFrame;
    JLabel estudiante, definitiva, proceso, observaciones;
    JTextField estudianteText, definitivaTexto, procesoTexto, obsevacionesTexto;
    JButton registro, permanecia, cerrar;
    
    public ValidarFrame(String titulo, String notaFinal) {
        
        mainValidarFrame = new JFrame(titulo);
        mainValidarFrame.setSize(613, 414);

        //logo
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/SwingApp/img/logo-Uniagustiniana-comoes.png");
        mainValidarFrame.setIconImage(icon);

        //background
        JLabel background = new JLabel(new ImageIcon("src/main/java/SwingApp/img/fondo.jpg"));
        mainValidarFrame.add(background);
        background.setBounds(0, 0, 598, 414);
        
        //content
        estudiante = new JLabel("Estudiante");
        definitiva = new JLabel("Definitiva");
        proceso = new JLabel("Proceso");
        observaciones = new JLabel("Observaciones");
        
        background.add(estudiante);
        estudiante.setBounds(40, 25, 150, 20);
        estudiante.setForeground(Color.red);
        
        background.add(definitiva);
        definitiva.setBounds(50, 70, 150, 20);
        definitiva.setForeground(Color.red);
        
        background.add(proceso);
        proceso.setBounds(50, 105, 150, 20);
        proceso.setForeground(Color.red);
        
        background.add(observaciones);
        observaciones.setBounds(17, 180, 150, 20);
        observaciones.setForeground(Color.red);
        
        estudianteText = new JTextField("DAVID FELIPE HERNANDEZ");
        definitivaTexto = new JTextField(notaFinal);
        procesoTexto = new JTextField();
        obsevacionesTexto = new JTextField();
        
        background.add(estudianteText);
        estudianteText.setBounds(110, 25, 250, 20);
        estudianteText.setEditable(false);
        
        background.add(definitivaTexto);
        definitivaTexto.setBounds(110, 70, 30, 20);
        definitivaTexto.setEditable(false);
        
        background.add(procesoTexto);
        procesoTexto.setBounds(110, 105, 80, 20);
        procesoTexto.setEditable(false);
        
        background.add(obsevacionesTexto);
        obsevacionesTexto.setBounds(110, 180, 120, 20);
        obsevacionesTexto.setEditable(false);
        
        registro = new JButton("REGISTRO");
        permanecia = new JButton("PERMANECIA");
        cerrar = new JButton("CERRAR");
        
        background.add(registro);
        registro.setBounds(100, 280, 100, 30);
        registro.setBackground(Color.black);
        registro.setForeground(Color.red);
        
        background.add(permanecia);
        permanecia.setBounds(230, 280, 130, 30);
        permanecia.setBackground(Color.black);
        permanecia.setForeground(Color.red);

        background.add(cerrar);
        cerrar.setBounds(390, 280, 100, 30);
        cerrar.setBackground(Color.black);
        cerrar.setForeground(Color.red);
        
        //logica
        
        //registro button
        RegistroBtn regisBtn = new RegistroBtn(notaFinal, procesoTexto);
        registro.addActionListener(regisBtn);
        
        //permanecia button
        PermanenciaBtn permaBtn = new PermanenciaBtn(procesoTexto, obsevacionesTexto);
        permanecia.addActionListener(permaBtn);
        
        //close button
        cerrar.addActionListener(e -> {
            mainValidarFrame.dispose();
        });
        
        //frame
        mainValidarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainValidarFrame.setLocationRelativeTo(null);
        mainValidarFrame.setResizable(false);
        mainValidarFrame.setLayout(null);
        mainValidarFrame.setVisible(true);
    }
}
