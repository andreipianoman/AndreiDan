/*
 * Scena cu multithreading
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class Scena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Domn andrei = new Domn();
        Televizor tv = andrei.getTelevizor();
        Doamna andreea = andrei.getSotie();
        Redare redare = new Redare(tv);
        ComportamentDomn comportamentAndrei = new ComportamentDomn(andrei);
        ComportamentDoamna comportamentAndreea = new ComportamentDoamna(andreea);
        comportamentAndreea.start();
        comportamentAndrei.start();
        redare.start();
    }
}
