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
public abstract class KomentoBase implements Komento {
    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button nollaa;
    protected Button undo;
    protected Sovelluslogiikka logiikka;
    protected int vanhaArvo;

    public KomentoBase(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka logiikka) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.logiikka = logiikka;
    }
    
    @Override
    public abstract void suorita();
    
    @Override
    public void peru() {
        tuloskentta.setText("" + vanhaArvo);
        syotekentta.setText("");
        logiikka.nollaa();
        logiikka.plus(vanhaArvo);
    }

}
