/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.patienten;
import java.util.ArrayList;
import se.prakt.praxis.Behandlung;
/**
 *
 * @author user
 */
public class Patient {
    private String anschrift;
    private String name;
    private Krankenkasse kraka;
    private ArrayList<Behandlung> behandlungen_patient_list = new ArrayList<Behandlung>();

    public Patient(String anschrift, String name, Krankenkasse kraka) {
        this.anschrift=anschrift;
        this.name=name;
        this.kraka=kraka;
        kraka.addPatient(this);
    }
    
    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addBehandlungP(Behandlung temp){
        behandlungen_patient_list.add(temp);
    }
    
    public void remBehandlungP(Behandlung temp){
        behandlungen_patient_list.remove(temp);
    }
    
    public int meineBehkost(){
        int kosten=0;
        for (int i =0; i<behandlungen_patient_list.size();i++){
            kosten+=behandlungen_patient_list.get(i).getPreis();
        }
        return kosten;
    }
}
