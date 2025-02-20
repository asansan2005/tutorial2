/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author aleja
 */
//clase calculadora para llamarla desde método public static void main (String[] arg) {..} de clase principal

public class Funciones_CALCULADORA {
// clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir

    private double numero1, numero2;

    public Funciones_CALCULADORA(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    // sets and gets

    public void setNumero1(double numero1) {
        this.numero1=numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2=numero2;
    }

    public double getNumero1(){
        return numero1;
    }
    public double getNumero2(){
        return numero2;
    }

    //métodos

    public double suma() {
        double suma=numero1+numero2;
        return suma;
    }

    public double resta() {
        double resta=numero1-numero2;
        return resta;
    }
}
