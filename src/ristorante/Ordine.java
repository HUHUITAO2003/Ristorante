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
public abstract class Ordine {

    protected ArrayList<Piatto> ord;
    protected double prezzo;

    public Ordine() {
        ord = new ArrayList<Piatto>();
    }

    public void AddPiatto(Piatto x) {
        ord.add(x);
    }

    public void RemovePiatto(int x) {
        ord.remove(x);
    }

    public int GetSize() {
        return ord.size();
    }

}
