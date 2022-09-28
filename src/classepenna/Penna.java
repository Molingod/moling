package classepenna;

import java.util.Scanner;
import java.util.Random;

public class Penna {
    private int inchiostro;
    private String colore, robaScritta="";
    private boolean aperta=false, funzionante=true;
    
    public Penna() {
    }

    public Penna(int inchiostro, String colore) {
        this.inchiostro = inchiostro;
        this.colore = colore;
    }

    public int getInchiostro() {
        return inchiostro;
    }

    public String getColore() {
        return colore;
    }
    
    public String getRobaScritta() {
        return robaScritta;
    }

    public boolean isAperta() {
        return aperta;
    }

    public void setAperta(boolean aperta) {
        this.aperta = aperta;
    }

    public boolean isFunzionante() {
        return funzionante;
    }
    
    public void scrivi(String xparola) {
        robaScritta += " " + xparola;
        
        Random rand = new Random();
        if (rand.nextInt(20)+1==1)
            funzionante = false;
    }
    
    public void rifornisciInchiostro(String xcolore) {
        colore = xcolore;
        inchiostro = 100;
    }
    
    public void aggiustaPenna() {
        if (!funzionante)
            funzionante=true;
    }
    
    public static Scanner in = new Scanner (System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int inchiostroIniziale;
        String coloreInchiostro;
        
        System.out.print("Inserire la percentuale d'inchiostro nella penna: ");
        inchiostroIniziale = in.nextInt();
        
        System.out.print("Inserire il colore dell'inchiostro nella penna: ");
        coloreInchiostro = in.next();
        
        Penna penna1 = new Penna(inchiostroIniziale, coloreInchiostro);
        
        System.out.println("Selezionare un'operazione da eseguire:");
    }
    
}
