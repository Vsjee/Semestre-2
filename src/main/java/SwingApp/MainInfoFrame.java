package SwingApp;

import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;

public class MainInfoFrame {
    
    JFrame mainInfoFrame;
    JLabel salon, docente, estudiante, nota1, nota2, nota3, definitiva;
    JTextField salonTexto, docenteTexto, estudianteTexto, nota1Texto, nota2Texto, nota3Texto, definitivaTexto;
    JButton calcular, validar, cerrar;
    
    String saloncito, docentico;
    
    MainInfoFrame(String titulo) {
        salonesDocentes data = new salonesDocentes(titulo);
        saloncito = data.salon();
        docentico = data.docente();
        
        mainInfoFrame = new JFrame(titulo);
        mainInfoFrame.setSize(598, 414);

        //logo
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/SwingApp/logo-Uniagustiniana-comoes.png");
        mainInfoFrame.setIconImage(icon);

        //background
        JLabel background = new JLabel(new ImageIcon("src/main/java/SwingApp/fondo.jpg"));
        mainInfoFrame.add(background);
        background.setBounds(0, 0, 598, 414);
        
        //contenido titulos
        salon = new JLabel("Salon");
        docente = new JLabel("Docente");
        estudiante = new JLabel("Estudiante");
        nota1 = new JLabel("Nota 1");
        nota2 = new JLabel("Nota 2");
        nota3 = new JLabel("Nota 3");
        definitiva = new JLabel("Definitiva");
        
        background.add(salon);
        salon.setBounds(50, 25, 150, 20);
        salon.setForeground(Color.red);
        
        background.add(docente);
        docente.setBounds(50, 60, 150, 20);
        docente.setForeground(Color.red);

        background.add(estudiante);
        estudiante.setBounds(50, 95, 150, 20);
        estudiante.setForeground(Color.red);
        
        background.add(nota1);
        nota1.setBounds(50, 125, 150, 20);
        nota1.setForeground(Color.red);

        background.add(nota2);
        nota2.setBounds(50, 160, 150, 20);
        nota2.setForeground(Color.red);
        
        background.add(nota3);
        nota3.setBounds(50, 195, 150, 20);
        nota3.setForeground(Color.red);

        background.add(definitiva);
        definitiva.setBounds(50, 225, 150, 20);
        definitiva.setForeground(Color.red);
        
        //textFields info
        salonTexto = new JTextField(saloncito);
        docenteTexto = new JTextField(docentico);
        estudianteTexto = new JTextField("DAVID FELIPE HERNANDEZ");
        nota1Texto = new JTextField("");
        nota2Texto = new JTextField("");
        nota3Texto = new JTextField("");
        definitivaTexto = new JTextField("");
        
        background.add(salonTexto);
        salonTexto.setBounds(110, 25, 50, 20);
        salonTexto.setEditable(false);
        
        background.add(docenteTexto);
        docenteTexto.setBounds(110, 60, 250, 20);
        docenteTexto.setEditable(false);
        
        background.add(estudianteTexto);
        estudianteTexto.setBounds(110, 95, 250, 20);
        estudianteTexto.setEditable(false);

        background.add(nota1Texto);
        nota1Texto.setBounds(110, 125, 30, 20);
        
        background.add(nota2Texto);
        nota2Texto.setBounds(110, 160, 30, 20);

        background.add(nota3Texto);
        nota3Texto.setBounds(110, 195, 30, 20);
        
        background.add(definitivaTexto);
        definitivaTexto.setBounds(110, 225, 30, 20);
        definitivaTexto.setEditable(false);
        
        //botones
        calcular = new JButton("CALCULAR");
        validar = new JButton("VALIDAR");
        cerrar = new JButton("CERRAR");
        
        background.add(calcular);
        calcular.setBounds(110, 280, 100, 30);
        calcular.setBackground(Color.black);
        calcular.setForeground(Color.red);
        
        background.add(validar);
        validar.setBounds(240, 280, 100, 30);
        validar.setBackground(Color.black);
        validar.setForeground(Color.red);
        
        background.add(cerrar);
        cerrar.setBounds(370, 280, 100, 30);
        cerrar.setBackground(Color.black);
        cerrar.setForeground(Color.red);
        
        //logica
        
        //calcular button
        CalcularBtn calculo = new CalcularBtn(nota1Texto, nota2Texto, nota3Texto, definitivaTexto);
        calcular.addActionListener(calculo);
        
        //validar button
        ValidarBtn valiBtn = new ValidarBtn(validar, titulo);
        validar.addActionListener(valiBtn);
        
        //close button
        cerrar.addActionListener(e -> {
            mainInfoFrame.dispose();
        });
        
        //frame
        mainInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainInfoFrame.setLocationRelativeTo(null);
        mainInfoFrame.setResizable(false);
        mainInfoFrame.setLayout(null);
        mainInfoFrame.setVisible(true);
    }
}
