
package view;


public class Views {

    int id;
    String marca;
    String model;
    String culoare;
    float pret;
    int an_fabricatie;
    float consum;
    byte[] imagine;
    
    public Views(int id, String marca, String model, String culoare, int an_fabricatie, float consum, float pret, byte[] imagine) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.pret = pret;
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

    public int getAn_fabricatie() {
        return an_fabricatie;
    }

    public float getConsum() {
        return consum;
    }

    public byte[] getImagine() {
        return imagine;
    }
}
