/*
 * Thread care descrie comportamentul domnului.
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class ComportamentDomn extends Thread{
    
    private Domn domn;
    
    public ComportamentDomn(Domn domn) {
       this.domn = domn;
    }
    
    
    
    @Override
    public void run() {
        while (domn.getAspirare() == true) {
            domn.aspira();
        }
        domn.anunta();
    }
    
}
