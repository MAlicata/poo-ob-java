package Herencia;

public class Motocicleta extends Vehiculo{
    boolean baul;

    public Motocicleta(){

    }
    public Motocicleta(String fabricante, String modelo, boolean baul) {
        super(fabricante, modelo);
        this.baul = baul;
    }
}
