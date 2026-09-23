/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int salario;
        double bono, total;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cual es El Nombre del empleado?");
        nombre = captu.nextLine();
        System.out.println("Cual es tu Sueldo?");
        salario = captu.nextInt();
        if (salario < 12000 ){
            bono = salario * 0.10;
            total = salario + bono;
            System.out.println(nombre + " Tienes un bono del 10% " + bono);
            System.out.println(nombre + " Sueldo final " + total);
        }else{ bono = salario * 0.05;
              total = salario + bono;
              System.out.println(nombre + " Tienes un bono del 5% " + bono);
               System.out.println(nombre + " Sueldo final " + total);
        }
    }
    
}
