/*
 * Class Domn
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class Domn {
    
    private Televizor televizor = new Televizor(this);
    private Doamna sotie = new Doamna(this);
    private boolean aspirare = true;

    
    
    public Televizor getTelevizor() {
        return televizor;
    }

    public Doamna getSotie() {
        return sotie;
    }
    

    public void setAspirare(boolean aspirare) {
        this.aspirare = aspirare;
    }

    public boolean getAspirare() {
        return aspirare;
    }
    
    public void aspira() {
    
    }
    
    public void anunta() {
        this.sotie.seTrezeste();
    }
    
}
