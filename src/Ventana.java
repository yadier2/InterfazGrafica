import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.plaf.DimensionUIResource;

public class Ventana extends JFrame {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel etiqueta1;
    JLabel etiqueta2;
    JLabel etiqueta3;

    public Ventana(String title) {
        super(title);
        Dimension d = new Dimension(500, 500);
        // this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // posicionar en cierto lugar
        this.setLocation(320, 30);
        this.setBounds(100, 300, 300, 500);
        // centrar
        this.setLocationRelativeTo(null);
        iniciarPaneles();
    }

    private void iniciarPaneles() {
        JPanel contenedor = new JPanel();
        // aceder al a ventana pricipal
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.red);

        contenedor.add(this.p1);
        contenedor.add(this.p2);
        contenedor.add(this.p3);
        this.p1.setBackground(Color.yellow);
        this.p2.setBackground(Color.blue);
        this.p3.setBackground(Color.red);
        //this.p3.setBackground(new Color(50, 51, 133));
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        this.p2.setVisible(false);


        // Se crea un botón centrado y se añade
        /*
         * JButton boton = new JButton("B");
         * boton.setAlignmentX(Component.CENTER_ALIGNMENT);
         * v.getContentPane().add(boton);
         */

    }

    protected void iniciarEtiquetas() {
        // Se crea una etiqueta centrada y se añade
        ImageIcon imagen1 = new ImageIcon("images/Aztecs.jpg");
        ImageIcon imagenScala = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        etiqueta1 = new JLabel("<html>una etiqueta larga 1</html>",imagenScala, SwingConstants.CENTER);
         etiqueta2 = new JLabel("<html>una etiqueta larga 2</html>");
        etiqueta3 = new JLabel("<html>una etiqueta larga 3</html>");
     
        this.p1.add(etiqueta1);
        this.p2.add(etiqueta2);
        this.p3.add(etiqueta3);
        etiqueta1.setAlignmentX(Component.CENTER_ALIGNMENT);
        etiqueta1.setForeground(Color.blue);

        this.p1.setLayout(null);
        etiqueta1.setBounds(20,10,200,200);
        etiqueta2.setBounds(10,100,90,60);
        etiqueta3.setBounds(10,100,90,60);

        etiqueta1.setText("<html>Hola humano</html>");
        this.p2.setVisible(true);
        this.p3.setVisible(false);

        //fondo de etiqueta
        this.etiqueta1.setOpaque(true);
        this.etiqueta2.setOpaque(true);

        this.etiqueta1.setBackground(Color.red);
        this.etiqueta2.setBackground(Color.red);

        this.etiqueta1.setHorizontalAlignment(SwingConstants.RIGHT);
        this.etiqueta2.setHorizontalAlignment(4);
        //alignear hacia vertical arriba
        this.etiqueta1.setVerticalAlignment(SwingConstants.BOTTOM);
        //icon imagen
        this.etiqueta2.setIcon(imagenScala);
    }
    public void setTextos(String text[]){
        this.etiqueta1.setText(text[0]);
        this.etiqueta2.setText(text[1]);
        this.etiqueta3.setText(text[2]);
    }
}
