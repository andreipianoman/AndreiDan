/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author Turbotwins
 */
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;

    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        
        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "=":
                operatiuneLocala('=');
                stapana.getAlu().calculeaza();
                System.out.println(stapana.getAlu().getRezultat());
                break; 
            default:
                if (this.afisaj == "0") {
                    this.afisaj = afisaj;
                } else if (this.afisaj != "0") {
                    this.afisaj = this.afisaj + afisaj;
                }
                System.out.println(this.afisaj);
                break;
        }
    }
/**
 * Private method for computation
 */   
    private void operatiuneLocala(char c) {
        if (c == '=') {
            stapana.getAlu().setOperandDoi(Integer.parseInt(afisaj));
        } else {
            stapana.getAlu().setOperandUnu(Integer.parseInt(afisaj));
            stapana.getAlu().setOperator(c);
            afisaj = Character.toString(c);
            System.out.println(afisaj);
            afisaj = "0";
        }
    }   
}