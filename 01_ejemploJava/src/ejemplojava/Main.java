/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Empezando ");
        coche miCoche;
        miCoche = new coche("ford",true,50);
        //miCoche.setMarca("kia");
        //miCoche.isEsgasolina(true);
        miCoche.echarCarburante(-2);
        System.out.println("coche creado " + miCoche.getMarca());
        System.out.println("nivel de gasolina " + miCoche.getNivelDep());
        System.out.println("");
        
        coche otroCoche;
        otroCoche=miCoche;
        /*otroCoche =new coche();*/
        otroCoche.getMarca();
        otroCoche.setNivelDep(40);
        System.out.println("otro coche creado marca " + otroCoche.getMarca());
       // vaciardeposito(miCoche);
       miCoche.vaciardeposito();
       System.out.println("otro coche creado nivel del deposito " + otroCoche.getNivelDep());
        miCoche.arrancado=true;
        miCoche.setNivelDep(-2);
        for (int i=0;i<3;i++)
         miCoche.acelerar();
        miCoche.mostrar();
    }
    /*public static void vaciardeposito(coche c)
    {
    c.nivelDeposito=3;
        System.out.println("deposito coche vaciado " +c.marca + " nivel" + c.nivelDeposito);
    
}
*/    
}
