/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliet
 */
public class RistoranteTest {
    
    public RistoranteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tipopiatti method, of class Ristorante.
     */
    @Test
    public void testTipopiatti() {
        System.out.println("tipopiatti");
        String tipopiatto = "Primo";
        Piatto p1 = new Piatto("Pasta", "Primo");
        Piatto p2 = new Piatto("Pasta", "Secondo");
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(p1);
        instance.AggiuntaPiatto(p1);
        instance.AggiuntaPiatto(p2);
        ArrayList<Piatto> result = instance.tipopiatti(tipopiatto);
        assertEquals(2, result.size());
    }

    /**
     * Test of AggiuntaPiatto method, of class Ristorante.
     */
    @Test
    public void testAggiuntaPiatto() {
        System.out.println("AggiuntaPiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(x);
        assertEquals(1, instance.GetSizemenu());
    }

    /**
     * Test of RimozionePiatto method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() {
        System.out.println("RimozionePiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(x);
        instance.AggiuntaPiatto(x);
        instance.RimozionePiatto(x);
        assertEquals(1, instance.GetSizemenu());
    }

    /**
     * Test of Importomax method, of class Ristorante.
     */
    @Test
    public void testImportomax() {
        System.out.println("Importomax");
        Ingrediente i1 = new Ingrediente("Ragu", 1, 2);
        Piatto p1 = new Piatto("Pasta al ragu", "Primo");
        p1.AggiuntaIngredientte(i1);
        Ristorante instance = new Ristorante();
        Ordine_Tavolo o1 = new Ordine_Tavolo(1, "Luca");
        o1.AddPiatto(p1);
        instance.AggiuntaOrdine(o1);
        double expResult = 2.0;
        double result = instance.Importomax();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of IncassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("IncassoGiornaliero");
        Ingrediente i1 = new Ingrediente("Ragu", 1, 2);
        Piatto p1 = new Piatto("Pasta al ragu", "Primo");
        p1.AggiuntaIngredientte(i1);
        Ristorante instance = new Ristorante();
        Ordine_Tavolo o1 = new Ordine_Tavolo(1, "Luca");
        o1.AddPiatto(p1);
        instance.AggiuntaOrdine(o1);
        double expResult = 2.0;
        double result = instance.IncassoGiornaliero();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of ToString method, of class Ristorante.
     */
    @Test
    public void testToString() {
        System.out.println("ToString");
        Piatto p1 = new Piatto("Pasta al ragu", "Primo");
        int i = 0;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(p1);
        String expResult = "Nome: Pasta al ragu Tipo: Primo Prezzo: 0.0";
        String result = instance.ToString(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of AggiuntaOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiuntaOrdine() {
        System.out.println("AggiuntaOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaOrdine(x);
        assertEquals(1, instance.GetSizeordine());
    }

    /**
     * Test of RimozioneOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() {
        System.out.println("RimozioneOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaOrdine(x);
        instance.RimozioneOrdine(x);
        instance.AggiuntaOrdine(x);
        assertEquals(1, instance.GetSizeordine());
    }

    /**
     * Test of GetSizemenu method, of class Ristorante.
     */
    @Test
    public void testGetSizemenu() {
        System.out.println("GetSizemenu");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaPiatto(x);
        int expResult = 1;
        int result = instance.GetSizemenu();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetSizeordine method, of class Ristorante.
     */
    @Test
    public void testGetSizeordine() {
        System.out.println("GetSizeordine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiuntaOrdine(x);
        int expResult = 1;
        int result = instance.GetSizeordine();
        assertEquals(expResult, result);
    }
    
}
