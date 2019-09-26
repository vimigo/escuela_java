

package threads;

import clasesjava.StringAux;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public abstract class HiloCrearFichero   {
//metodo abstracto
   

  /*  public HiloCrearFichero(String string) {
        super(string);
    }*/
    
 public/* static*/ void crearFichero(String rutaFich)
 //throws IOException
 {
     String[] palabras =new String['Z'-'A' +1];
// String[] palabras={"AAaaa","BBBbbbb","cCc", "DDDD"};
 Random r=new Random(new Date().getTime());
        for (char c ='A';c < 'Z'  ;c++){
        int repe=2 + Math.abs(r.nextInt()% 8) ;//numero aleatorio entre 2 y 9
        palabras[c-'A']="";
        for (int i = 0; i < repe ; i++){
          palabras[c-'A']+="" + c;
        }
        System.out.println(Arrays.toString(palabras));
        }
        FileWriter fich=null;
        try{
            fich =new FileWriter(rutaFich,false);
            for(int i =0; i< 200000; i++){
            if(r.nextInt(2)==0)
                fich.write(palabras[r.nextInt(palabras.length)]);
            if(r.nextInt(2)==0)   
            for (int j=0; j < 5 ;j++){
               fich.write(" ");
               if(r.nextInt(3)==0)
                   fich.write("\n\r");
               }
            }
        }catch(IOException ex){
          System.err.println("Error en escritura " + ex.getMessage());
        }catch(Exception ex){
          System.err.println("Otro error en  " + ex.getMessage());
        }
        finally{
         try {
             if(fich!=null)
             fich.close();
         } catch (IOException ex) {
             Logger.getLogger(HiloCrearFichero.class.getName()).log(Level.SEVERE, null, ex);
         }
           
        }
 }
 public /*static*/ void lecturaFichero(String rutaFich){}
  /* File fich=new File(rutaFich);
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
        
}*/
}