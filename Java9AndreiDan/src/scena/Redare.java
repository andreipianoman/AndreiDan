/*
 * Thread Redare
 */
package scena;

/**
 *
 * @author Turbotwins
 */
public class Redare extends Thread{
    
    private Televizor tv;
    
    public Redare(Televizor televizor) {
        tv = televizor;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < tv.getEmisiuni().size(); i++) {
            for (int j=0; j<100; j++) {
                tv.reda((i));
                if (tv.getEmisiune() == tv.getStapan().getSotie().getEmisiunePreferata()) {
                    tv.getStapan().setAspirare(false);
                }
            }
        }
    }
}
