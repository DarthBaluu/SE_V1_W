/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.kassentest;

import se.prakt.praxis.Arzt;
import se.prakt.praxis.Behandlung;
import se.prakt.patienten.Krankenkasse;
import se.prakt.patienten.Patient;
/**
 *
 * @author user
 */
public class ArztTest {
    
    public static void main(String[] args) {
        int wert_1,wert_2;
        Arzt a_1 = new Arzt ("Sommer","Berlin");
        Arzt a_2 = new Arzt ("Winter","Berlin");
        Arzt a_3 = new Arzt ("Herbst","Potsdam");
        
        Krankenkasse k_1 = new Krankenkasse ("Techniker");
        Krankenkasse k_2 = new Krankenkasse ("AOK");
        
        Patient p_1 = new Patient ("Klaus","Berlin",k_2);
        Patient p_2 = new Patient ("Dieter","Berlin",k_1);
        Patient p_3 = new Patient ("Peter","Berlin",k_2);
        
        Behandlung b_1 = new Behandlung ("13.06.2015","Impfung",45,a_1,p_3);
        Behandlung b_2 = new Behandlung ("16.06.2015","Untersuchung",144,a_3,p_3);
        Behandlung b_3 = new Behandlung ("19.05.2015","Blutdruck",23,a_1,p_1);
        Behandlung b_4 = new Behandlung ("23.07.2015","Verstauchung",77,a_2,p_2);
        Behandlung b_5 = new Behandlung ("01.08.2015","Bruch",234,a_2,p_2);
        Behandlung b_6 = new Behandlung ("20.03.2015","Untersuchung",22,a_3,p_1);
        
        wert_1=k_1.summeBehandlungen();
        wert_2=k_2.summeBehandlungen();
        System.out.println("Der gesamtpreis der Behandlungen der Techniker liegt bei: "+wert_1);
        System.out.println("Der gesamtpreis der Behandlungen der AOK liegt bei: "+wert_2);
        
    }
}
