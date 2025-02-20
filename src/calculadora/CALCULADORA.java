/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author aleja
 */
import java.util.Scanner;

public class CALCULADORA {
    
    public static void main(String[] arg) {
        
        //objeto clase scanner
        Scanner sc= new Scanner(System.in);
        System.out.println(" Introduce primner numero de la calculadora: ");
        // metodo para leer un double por teclado
        double n1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero de la calcualdora: ");
        double n2 = sc.nextDouble();
    
        // instancio un objeto de clase calculadora que he creado en archivo aparte con los dos numeros pasados
        Funciones_CALCULADORA casio= new Funciones_CALCULADORA(n1, n2 );
        
        int operacion =0;
        do {
            System.out.println(" Introduce Operacion a realizar");
            System.out.println(" 1. multiplicacion \n 2. division \n 3. salir");
            // leo por teclado un entero como opción del menú
            operacion =sc.nextInt();
            // segun valor elegido ejecuto método del objeto claculadora
            switch ( operacion ){
            case 1: System.out.println(" la multipilcacion es "+ casio.multiplicacion()); break;
            case 2: System.out.println(" La division es " + casio.division()); break;
            case 3: System.out.println(" Salir"); break;
            default: System.out.println(" Debes elegir una opción de 1 a 3");
            }
    
        } while ( operacion != 3 );
        
        System.out.println(" Gracias por usar la calculadora...hasta luegooooorrr");
        
        sc.close();
    }

}
