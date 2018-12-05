/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin.komennot;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Sovelluslogiikka;

/**
 *
 * @author ajhaarni
 */
public class Nollaa extends KomentoBase {

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka logiikka) {
        super(tuloskentta, syotekentta, nollaa, undo, logiikka);
    }
    
    @Override
    public void suorita() {
        vanhaArvo = logiikka.tulos();
        logiikka.nollaa();
        tuloskentta.setText("0");
        syotekentta.setText("");
    }
}
