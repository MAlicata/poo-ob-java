package Herencia;

import Herencia.Motor;
import Herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {

        //instanciando un objeto por defecto
        Vehiculo toyotaPrius = new Vehiculo();

        Motor motorGti = new Motor("gti", 190, 458.0, 6);
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, 150, motorGti);
        System.out.println(fordMondeo.fabricante);
        fordMondeo.acelerar(100);
        System.out.println(fordMondeo.speed);

        // Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";
        System.out.println("fin de programa");

        //Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(55);
    }
}
