/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.patienten;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Krankenkasse {
    private String name;
    private ArrayList<Patient> pat_list = new ArrayList<Patient>();

    public Krankenkasse(String name) {
        this.name=name;        
    }
    
    public int summeBehandlungen(){
        int geskosten=0;
        for(int i=0;i<pat_list.size();i++){
            geskosten+=pat_list.get(i).meineBehkost();
        } 
        return geskosten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addPatient(Patient temp){
        pat_list.add(temp);
    }
    
    public void rmPatient(Patient temp){
        pat_list.remove(temp);
    }
}
