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
public class Piatto {

    private String nome;
    private String tipo;
    private ArrayList<Ingrediente> piatto;

    public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        piatto = new ArrayList<Ingrediente>();
    }

    public void AggiuntaIngredientte(Ingrediente x) {
        piatto.add(x);
    }

    public void RimozioneIngredientte(Ingrediente x) {
        piatto.remove(x);
    }

    public double GetPre() {
        double d = 0.0;
        Ingrediente i = new Ingrediente("", 0, 0);
        for (int in = 0; in < piatto.size(); in++) {
            i = (Ingrediente) piatto.get(in);
            d += i.GetPrezzo();
        }
        return d;
    }

    public String GetTipo() {
        return tipo;
    }

    public String GetNome() {
        return nome;
    }

    public String ToString() {
        String s = "Nome: " + nome + " Tipo: " + tipo + " Prezzo: " + GetPre();
        return s;
    }

}
