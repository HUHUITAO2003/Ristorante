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
public class Ordine_Tavolo extends Ordine {

    private int iden;
    private String nome;

    public Ordine_Tavolo(int iden, String nome) {
        this.iden = iden;
        this.nome = nome;

    }

    public double Prezzotot() {
        double prezzo = 0.0;
        for (int i = 0; i < ord.size(); i++) {
            prezzo += ord.get(i).GetPre();
        }
        return prezzo;
    }
}
