/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.praxis;
import se.prakt.patienten.Patient;
/**
 *
 * @author user
 */
public class Behandlung {
    private String datum;
    private String art;
    private int preis;
    private Arzt arzt;
    private Patient pat;
    
    public Behandlung(String datum, String art, int preis, Arzt arzt, Patient pat){
        this.datum=datum;
        this.art=art;
        this.preis=preis;
        this.arzt=arzt;
        this.pat=pat;
        arzt.addBehandlungA(this);
        pat.addBehandlungP(this);
    }
    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
    
}
