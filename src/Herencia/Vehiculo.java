package Herencia;

public class Vehiculo {
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected int speed;
    protected Motor motor;

    //Construct
    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.speed = 0;
    }

    // métodos
    public void acelerar(int quantity){

        this.speed += quantity;
    }

    //getter and setter

    //toString
}
