public class App {
    public static void main(String[] args) {
       
        System.out.println("si o si me ejecuto");
        Ventana v = new Ventana("Colombia");
        v.setVisible(true);
        v.iniciarEtiquetas();
        if(args.length > 0){
            v.setTextos(args);
        }
        for(int i=0; i<5 ;i++){
            try {
                Thread.sleep(20);
                v.setLocation(i*30, i*30);
            } catch (Exception e) {
              
            }
          
          
        }
    }
}
