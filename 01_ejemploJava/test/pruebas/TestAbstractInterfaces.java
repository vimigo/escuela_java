package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import poo.Coche;
import poo.CocheRally;
import poo.Moto;
import poo.TipoCarburante;
import poo.Vehiculo;

public class TestAbstractInterfaces {
    
    @Test
    public void abstractos() {
        Vehiculo miVehiculo = new Vehiculo("Fabricacion propia" ,"SIN MATRICULAR") {
            @Override
            public void abrirPuerta() {
                    System.out.println("Abriendo puertas...");
            }
            @Override
            public void acelerar() { 
                System.out.println(toString() + " acelera.");
            }
        };
        miVehiculo.acelerar();
        Vehiculo miMoto = new Moto("CBR 900");
        System.out.println(miMoto.toString());
        miMoto.abrirPuerta();
        miMoto.acelerar();
        
        miVehiculo.abrirPuerta();
        Coche coche = new Coche("BMW", "5555-HHH");
        coche.setArrancado(true);
        coche.echarCarburante(50);
        coche.acelerar();
        coche.acelerar();
        coche.mostrar();
        assertEquals(coche.getNivDeposito(), 49.8, 0.01);
        
        CocheRally miSupra = new CocheRally("TOYOTA", TipoCarburante.GASOLINA, "NEGRO", 2.1f);
        miSupra.echarCarburante(40);
        miSupra.setArrancado(true);
        miSupra.acelerar();
        miSupra.acelerar();
        miSupra.derrapar();
        //miSupra.setNivDeposito(4); Solo dentro del paquete
        //miSupra.explosionCilindro();
        miSupra.mostrar();
        assertEquals(miSupra.getNivDeposito(), 39, 0.01);

    }
}
