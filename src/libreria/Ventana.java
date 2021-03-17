package libreria;

import javax.swing.*;
import java.awt.event.KeyAdapter;

public class Ventana extends JFrame {

    public Ventana(String nombre, int ANCHO, int ALTO, JPanel lamina, Thread hilo, KeyAdapter teclado) {
        setTitle(nombre);
        setSize(ANCHO,ALTO);
        setLocationRelativeTo(null); //Ventana en el centro de la pantalla
        setResizable(false);
        add(lamina);
        addKeyListener(teclado);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo.start();
    }
}
