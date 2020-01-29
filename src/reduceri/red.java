/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reduceri;


public class red {

    public red(int id, String marca, String model, String culoare, int an_fabricatie, float consum,float pret ,float pret_redus , byte[] imagine) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
        this.pret_redus = pret_redus;
        this.an_fabricatie = an_fabricatie;
        this.consum = consum;
        this.imagine = imagine;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public float getPret() {
        return pret;
    }

    public float getPret_redus() {
        return pret_redus;
    }

    public int getAn_fabricatie() {
        return an_fabricatie;
    }

    public float getConsum() {
        return consum;
    }

    public byte[] getImagine() {
        return imagine;
    }
    
    int id;
    String marca;
    String model;
    String culoare;
    float pret;
    float pret_redus;
    int an_fabricatie;
    float consum;
    byte[] imagine;
    
    
    
}
