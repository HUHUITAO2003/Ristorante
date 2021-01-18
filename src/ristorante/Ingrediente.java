package ristorante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juliet
 */
public class Ingrediente {

    private String descrizione;
    private int quantita;
    private double prezzo;

    public Ingrediente(String descrizione, int quantita, double prezzo) {
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public double GetPrezzo() {
        return prezzo;
    }

}
