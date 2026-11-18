
package figureGeometricheh;

/**
 *
 * @author alice.muhlbacher
 */
public class Quadrato {
    //attributi
    private float  lato;
    private String colore;
    private String materiale;

    public Quadrato() {}
    
    public Quadrato(float lato, String colore){
        this.lato =    lato;
        this.colore =  colore;
    }
    
    public float getLato(){
        return lato;
    }
    
    public void setLato(float lato){
        this.lato = lato;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
    public float calcolaArea(){
        return lato * lato;
    }
    
    public float calcolaPerimetro(){
        return lato * 4;
    }
    
    public String info() {
        String info;
        
        info = "Lato     : " + lato   + "\n" + 
               "colore   : " + colore + "\n" +
               "materiale: " + materiale + "\n";
        return info;
    }
    
    
}
