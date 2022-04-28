/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.*;
public class Ejecutable05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        String nombre;
        int numCamas;
        double valor;
        
        System.out.println("Ingrese el nombre del Hospital");
        nombre = sc.nextLine();
        h1.establecerNombre(nombre);
        System.out.println("Ingrese el numero de camas del Hospital");
        numCamas = sc.nextInt();
        h1.establecerNumeroCamas(numCamas);
        System.out.println("Ingrese el valor del presupuesto del Hospital");
        valor = sc.nextDouble();
        h1.establecerPresupuesto(valor);
        sc.nextLine();
        
        System.out.println("Ingrese el nombre del Hospital");
        nombre = sc.nextLine();
        h2.establecerNombre(nombre);
        System.out.println("Ingrese el numero de camas del Hospital");
        numCamas = sc.nextInt();
        h2.establecerNumeroCamas(numCamas);
        System.out.println("Ingrese el valor del presupuesto del Hospital");
        valor = sc.nextDouble();
        h2.establecerPresupuesto(valor);
        sc.nextLine();

        
        System.out.println("Ingrese el nombre del Hospital");
        nombre = sc.nextLine();
        h3.establecerNombre(nombre);
        System.out.println("Ingrese el numero de camas del Hospital");
        numCamas = sc.nextInt();
        h3.establecerNumeroCamas(numCamas);
        System.out.println("Ingrese el valor del presupuesto del Hospital");
        valor = sc.nextDouble();
        h3.establecerPresupuesto(valor);
        sc.nextLine();

        
        

        
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        int sumaCamas = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() +
                h3.obtenerNumeroCamas();
        
        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        System.out.printf("La suma de el numero de camas es %1d\n", sumaCamas);
        
        System.out.println("Los Hospitales Ingresados fueron:");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(), 
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());

    }
}
