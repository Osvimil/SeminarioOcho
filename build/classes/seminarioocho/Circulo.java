/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminarioocho;

/**
 *
 * @author oswaldosaldivar
 */
public class Circulo extends Figura {
    
    private double radio;    
    private static final double PI = 3.1416;

    public Circulo(String nombre, String color,double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    
    
     @Override
    public double calcularArea() {
        return PI*(radio*radio);    
    }
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   
    
}
