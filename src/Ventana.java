import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.plaf.DimensionUIResource;

public class Ventana extends JFrame {
    ArrayList <JPanel> panel =  new ArrayList <JPanel>();
    ArrayList <JLabel> etiqueta =  new ArrayList <JLabel>();
    ImageIcon imagen1 = new ImageIcon("images/Aztecs.jpg");
    ImageIcon imagenScala = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    
    int num = 5;
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
        iniciarEtiquetas();
    }

    private void iniciarPaneles() {
        JPanel contenedor = new JPanel();
        // aceder al a ventana pricipal
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.red);

        for(int i=0; i< this.num ; i++){
            this.panel.add(new JPanel());
            contenedor.add(this.panel.get(i));
            this.panel.get(i).setBackground(new Color(i*50,i*50,i*50));
        }
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
        }


    protected void iniciarEtiquetas() {
        for(int i=0; i< this.num; i++){
            this.etiqueta.add(new JLabel("Hola "+ 1+i,imagenScala, SwingConstants.CENTER));
            this.etiqueta.get(i).setForeground(Color.RED);
            this.panel.get(i).add(this.etiqueta.get(i));

        }
    }
    public void setTextos(String text[]){
       
    }
}
