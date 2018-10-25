/*
 * Create and write in File..
 */
package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Turbotwins
 */
public class CreateAndWriteInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File newbie = new File("E:\\Koding Stuph\\Shkoala eenformala\\Cur s Java\\Teme exceptions\\ write.txt");
        
        try {
            newbie.createNewFile();
            try {
                FileWriter newbieWriter = new FileWriter(newbie);
                newbieWriter.write("THIS");
                try { 
                    newbieWriter.close();
                } catch (IOException exception) {
                    //Logger.getLogger(CreateAndWriteInFile.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Close failed. Exception message:" + exception.getMessage());
                }
            } catch (IOException e) {
                //Logger.getLogger(CreateAndWriteInFile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Write failed. Exception message:" + e.getMessage());
            }
        } catch (IOException ex) {
            //Logger.getLogger(CreateAndWriteInFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not created. Exception message:" + ex.getMessage());
        }
    }
        
}
