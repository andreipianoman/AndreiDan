/*
 * class Televizor
 */
package scena;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Turbotwins
 */
public class Televizor {
    
    private Domn stapan;
    private volatile String emisiune = ".";
    private List<String> emisiuni = new ArrayList();
            
    public Televizor(Domn barbat) {
        stapan = barbat;
        emisiuni.add("Blue Planet");
        emisiuni.add("Planet Earth");
        emisiuni.add("Svalbard, life on the edge");
        emisiuni.add("Trust me, I am a doctor!");
        emisiuni.add("Zooquest");
    }

    public Domn getStapan() {
        return stapan;
    }

    public String getEmisiune() {
        return emisiune;
    }

    public synchronized void setEmisiune(String emisiune) {
        this.emisiune = emisiune;
    }

    public List<String> getEmisiuni() {
        return emisiuni;
    }
    
    public void reda(Integer n) {
        if (emisiune != emisiuni.get(n)) {
            this.setEmisiune(emisiuni.get(n));
        }
    }
}
