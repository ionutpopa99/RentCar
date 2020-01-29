/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_personale;


public class Date {

    String nume;
    String prenume;
    String oras;
    int numar_de_telefon; 
    String email;
    int varsta;
    String nume_card;
    int numar_card;
    int cvc;
    String exp_card;
    
    
    public Date(String nume, String prenume, String oras, int numar_de_telefon, String email, int varsta, String nume_card, int numar_card, int cvc, String exp_card) {
        this.nume = nume;
        this.prenume = prenume;
        this.oras = oras;
        this.numar_de_telefon = numar_de_telefon;
        this.email = email;
        this.varsta = varsta;
        this.nume_card = nume_card;
        this.numar_card = numar_card;
        this.cvc = cvc;
        this.exp_card = exp_card;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getOras() {
        return oras;
    }

    public int getNumar_de_telefon() {
        return numar_de_telefon;
    }

    public String getEmail() {
        return email;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume_card() {
        return nume_card;
    }

    public int getNumar_card() {
        return numar_card;
    }

    public int getCvc() {
        return cvc;
    }

    public String getExp_card() {
        return exp_card;
    }
    
  
            
    
    
    
}
