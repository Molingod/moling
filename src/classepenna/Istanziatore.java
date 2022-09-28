package classepenna;

public class Istanziatore {
    public static Interfaccia interfaccia;
    public static Penna penna1;
    
    public static int inchiostro1=50;
    public static String colore1="Nero";
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                interfaccia = new Interfaccia();
                penna1 = new Penna(inchiostro1, colore1);
                interfaccia.setVisible(true);
            }
        });
    }
}
