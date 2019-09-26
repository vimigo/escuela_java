/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestEjemplosHilos {
    
   private class ProcesoA extends Thread{

        @Override
        public void run() {
         //   super.run(); //To change body of generated methods, choose Tools | Templates.
       mostrarLista();
        }
       
   public void mostrarLista(){
   for (int i =0;i < 200;i++){
   System.out.println("Proceso A " + i);
   }
   }
   
   }
  private class ProcesoB extends Thread{

        @Override
        public void run() {
           // super.run(); //To change body of generated methods, choose Tools | Templates.
         mostrarLista();
        }
      
   public void mostrarLista(){
   for (int i =0;i < 200;i++){
   System.out.println("Proceso B " + i);
   }
   }
   }
     @Test
   public void probandoClasesConNombre(){
       try {
           ProcesoA procA=new ProcesoA();
           ProcesoB procB=new ProcesoB();
           
           
           //  procA.mostrarLista();
           procA.start();
           //procB.mostrarLista(); ahora al ser hilo no se llama asi
         
           procB.start();
           Thread.sleep(10);
           procA.join();
           procB.join();
       } catch (InterruptedException ex) {
           Logger.getLogger(TestEjemplosHilos.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
