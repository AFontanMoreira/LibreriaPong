package libreria;

import javax.swing.*;
import java.awt.event.KeyAdapter;

public class Ventana extends JFrame {
    private JFrame espera;
    public Ventana(String nombre, int ANCHO, int ALTO, JPanel lamina, Thread hilo, KeyAdapter teclado) {
        setTitle(nombre);
        setSize(ANCHO,ALTO);
        setLocationRelativeTo(null); //Ventana en el centro de la pantalla.
        setResizable(false);
        add(lamina);
        addKeyListener(teclado);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        espera=new JFrame();


        hilo.start();
        try {
            Thread.sleep(5000);
            espera.setAlwaysOnTop(true);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
