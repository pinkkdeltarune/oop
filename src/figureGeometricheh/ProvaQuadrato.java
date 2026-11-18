
package figureGeometricheh;

/**
 *
 * @author alice.muhlbacher
 */
public class ProvaQuadrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrato q1 = new Quadrato();
        Quadrato q2 = new Quadrato(6.7f , "verde");
        
        
        q2.setMateriale("acciaio");
        System.out.println(q2.info());
        float lato = 5;
        
        q1.setLato(lato);
        q1.setColore("blu");
        q1.setMateriale("titanio");
        
        System.out.println(q1.getLato());
        System.out.println(q1.calcolaArea());
        System.out.println(q1.calcolaPerimetro());
        System.out.println(q1.info());
        
        
    }
    
}
