/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar un numero inicial y final e imprimir la lista de numeros entre ellos:
        //Ejemplo: 4 y 11
        int inicio, fin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime con que numero inicia:");
        inicio = captu.nextInt();
        System.out.println("Dime el Numero con que quieres acabar:");
        fin = captu.nextInt();
        for(int i = inicio; i <= fin; i++ ){
            //INTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
    }
    
    
}
