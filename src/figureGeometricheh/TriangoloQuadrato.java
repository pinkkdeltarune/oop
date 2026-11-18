/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figureGeometricheh;

/**
 *
 * @author alice.muhlbacher
 */
public class TriangoloQuadrato {
    private float  lato1;
    private float  lato2;
    private float  lato3;
    
    private String colore;
    private String materiale;

    public TriangoloQuadrato () {}
    
    public TriangoloQuadrato(float lato1,float lato2, float lato3, String colore){
        this.lato1 =    lato1;
        this.lato2 =    lato2;
        this.lato3 =    lato3;
        
        this.colore =  colore;
    }
    
    public float getLato1(){
        return lato1;
    }
    public float getLato2(){
        return lato2;
    }   
    public float getLato3(){
        return lato3;
    }
        
    
    public void setLato1(float lato1){
        this.lato1 = lato1;
    }
    public void setLato2(float lato2){
        this.lato2 = lato2;
    }   
    public void setLato3(float lato3){
        this.lato3 = lato3;
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
        return (lato1 * lato2)/2;
    }
    
    public float calcolaPerimetro(){
        return lato1 + lato2 + lato3;
    }
    
    public String info() {
        String info;
        
        info = "Cateto 1     : " + lato1   + "\n" + 
               "Cateto 2     : " + lato2   + "\n" + 
               "Ipotenusa    : " + lato3   + "\n" + 
               "colore   : " + colore      + "\n" +
               "materiale: " + materiale   + "\n";
        return info;
    }
}
