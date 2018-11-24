/*
 * Thread care descrie comportamentul Doamnei.
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class ComportamentDoamna extends Thread{
    
    private Doamna doamna;
    
    public ComportamentDoamna(Doamna doamna) {
        this.doamna = doamna;
    }
    
    
    
    @Override
    public void run() {
        while (doamna.getSomn() == true && doamna.getVizionare() == false) {
            doamna.doarme();
        }
        while (doamna.getSomn() == false && doamna.getVizionare() == true) {
            doamna.vizioneaza();
        }
    }
}
