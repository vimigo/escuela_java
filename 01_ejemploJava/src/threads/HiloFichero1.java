

package threads;

import clasesjava.StringAux;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class HiloFichero1 extends HiloCrearFichero{
    @Override
    public /*static*/ void lecturaFichero(String rutaFich){
    File fich=new File(rutaFich);
        Scanner escaner=null;
        try{
        escaner=new Scanner(fich);
        while(escaner.hasNextLine()){
        String linea= escaner.nextLine();
        System.out.println(linea);
        StringAux strAux=new StringAux(linea);
        System.out.print(strAux.quitarEspSobrantes());
        }
        }
        catch(Exception ex){
          System.err.println("Otro error en  " + ex.getMessage());
        }
        finally{
         try {
           if(escaner != null){
               escaner.close();
           }
           
         } catch (Exception ex) {
             Logger.getLogger(HiloCrearFichero.class.getName()).log(Level.SEVERE, null, ex);
         }
        
}
    }

        

}
