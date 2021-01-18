/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.ArrayList;

/**
 *
 * @author juliet
 */
public class Ristorante {
    
    private ArrayList<Piatto> menu;
    private ArrayList<Ordine> ordin;
    
    /**
     * Costruttore della classe Ristorante
     */
    public Ristorante(){
        menu = new ArrayList<Piatto>();
        ordin = new ArrayList<Ordine>();
    }
    
    /**
     * Costruzione di un ArrayList di piatti di tipo dato come parametro
     * @param tipopiatto tipo del piatto richiesto
     * @return ArrayList con tutti i piatti di un tipo richiesto
     */
    public ArrayList<Piatto> tipopiatti(String tipopiatto){
        ArrayList<Piatto> ordinetipo;
        ordinetipo = new ArrayList<Piatto>();
        for(int i=0;i<menu.size();i++)
        {
            if(menu.get(i).GetTipo().equals(tipopiatto))
            {
                ordinetipo.add(menu.get(i));
            }
        }
        
        return ordinetipo;
    }
    
    /**
     * Aggiunta di un piato nel menù
     * @param x piatto da aggiungere
     */
    public void AggiuntaPiatto(Piatto x){
        menu.add(x);
    }
    
    /**
     * Rimozione di un piato dal menù
     * @param x piatto da rimuovere
     */
    public void RimozionePiatto(Piatto x){
        menu.remove(x);
    }
    
    /**
     * Calcolo ordine con importo massimo
     * @return importo del ordine con importo massimo
     */
    public double Importomax(){
        double in=0.0, g;
        Ordine_Tavolo o1=new Ordine_Tavolo(0,"");
        Ordine_Domicilio o2=new Ordine_Domicilio("",null);
        
        for(int j=0;j<ordin.size();j++){
            if(ordin.get(j) instanceof Ordine_Tavolo){
                o1= (Ordine_Tavolo) ordin.get(j);
                g=o1.Prezzotot();
            }else{
                o2= (Ordine_Domicilio) ordin.get(j);
                g=o2.Prezzotot();
            }
            
            if(in<g){
                in=g;
            }
            }
        
        return in;
    }
    
    /**
     * Calcolo dell'incasso giornaliero
     * @return Incasso giornaliero
     */
    public double IncassoGiornaliero(){
        double in=0.0;
        Ordine_Tavolo o1=new Ordine_Tavolo(0,"");
        Ordine_Domicilio o2=new Ordine_Domicilio("",null);
        for(int j=0;j<ordin.size();j++){
            if(ordin.get(j) instanceof Ordine_Tavolo){
                o1= (Ordine_Tavolo) ordin.get(j);
                in+=o1.Prezzotot();
            }else{
                o2= (Ordine_Domicilio) ordin.get(j);
                in+=o2.Prezzotot();
            }
        }
        return in;
    }

    /**
     * Conversione in stringa contenuto di un piatto nel menu
     * @param tipopiatto tipo del piatto richiesto
     * @return ArrayList con tutti i piatti di un tipo richiesto
     */
    public String ToString(int i){
        return menu.get(i).ToString();
    }
    
    /**
     * Aggiunta di un ordine
     * @param x ordine da aggiungere
     */
    public void AggiuntaOrdine(Ordine x){
        ordin.add(x);
    }
    
    /**
     * Rimozione di un ordine
     * @param x numero dell'ordine da rimuovere
     * @return ArrayList con tutti i piatti di un tipo richiesto
     */
    public void RimozioneOrdine(Ordine x){
        ordin.remove(x);
    }
    
    /**
     * return della grandezza del menu
     * @return 
     */
    public int GetSizemenu(){
        return menu.size();

    }
    
    /**
     * return della grandezza del menu
     * @return 
     */
    public int GetSizeordine(){
        return ordin.size();

    }
    
}
