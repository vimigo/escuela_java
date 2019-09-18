package ejemplojava;

public class coche {//hereda de objet

    private final byte numRuedas;
    private String marca;
    public static int capacidadDeposito;
    private boolean esgasolina;
    private double nivelDeposito;
    boolean arrancado;

    public coche(String marca, boolean esgasolina, int capacidaddeposito) {
        this.numRuedas = 4;
        this.marca = marca;
        this.capacidadDeposito = capacidadDeposito;

    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public boolean isEsgasolina() {
        return esgasolina;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }

    public double getNivelDep() {
        return nivelDeposito;
    }

    public void setNivelDep(double nivelDeposito) {
        this.nivelDeposito = nivelDeposito;
    }

    public void echarCarburante(double cantidad) {
        if (cantidad > 0 ) {
             this.nivelDeposito += cantidad;
        }
        
             
        
    }

    public void acelerar() {
        if (arrancado) {
            nivelDeposito -= 0.1;
        }
    }

    public void vaciardeposito() {
        this.nivelDeposito = 3;
        System.out.println("deposito coche vaciado " + this.toString());
        //+ " nivel" + this.nivelDeposito);
    }

    public String toString() {
        return "coche " + marca + " nivel " + nivelDeposito;
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public String getMarca() {
        return marca;
    }
    /* public void setMarca(String marca){
    this.marca =marca;
    }*/
}
