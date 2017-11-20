/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.praxis;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Arzt {
    private String name;
    private String adresse;
    private ArrayList<Behandlung> beh_list = new ArrayList<Behandlung>();

    public Arzt(String name, String adresse) {
        this.name=name;
        this.adresse=adresse;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void addBehandlungA(Behandlung temp) {
        beh_list.add(temp);
    }
    
    public void rmBehandlungA(Behandlung temp){
        beh_list.remove(temp);
    }
}
