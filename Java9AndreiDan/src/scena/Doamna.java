/*
 * Class Doamna
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class Doamna {
    
    private Domn sot;
    
    private String emisiunePreferata = "Blue planet";
    private boolean somn = true;
    private boolean vizionare = false;
    
    public Doamna(Domn barbat) {
        sot = barbat;
    }

    
    
    public boolean getSomn() {
        return somn;
    }

    public boolean getVizionare() {
        return vizionare;
    }
   
    public void seTrezeste() {
        somn = false;
        vizionare = true;
    }
    
    public void vizioneaza() {
        
    }
    
    public String getEmisiunePreferata() {
        return emisiunePreferata;
    } 
    
    public void doarme() {
        
    }
    
}
