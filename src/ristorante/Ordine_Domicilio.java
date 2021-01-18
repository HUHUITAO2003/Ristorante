/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

/**
 *
 * @author juliet
 */
import java.time.LocalTime;
import java.util.ArrayList;

public class Ordine_Domicilio extends Ordine {

    private static double prezzo_fisso = 5.50;
    LocalTime ora = LocalTime.of(0, 0);
    private String indirizzo;

    public Ordine_Domicilio(String indirizzo, LocalTime ora) {
        this.indirizzo = indirizzo;
        this.ora = ora;
    }

    public double Prezzotot() {
        double prezzo = 0.0;
        for (int i = 0; i < ord.size(); i++) {
            prezzo += ord.get(i).GetPre();
        }
        return prezzo + prezzo_fisso;
    }
}
