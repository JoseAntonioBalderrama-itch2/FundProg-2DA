/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author Josea
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PIDE AL USUARIO ADIVINAR UN NUMERO,
        //TERMINA CUANDO ADIVINA EL NUMERO
                Scanner captu = new Scanner(System.in);
        int opcion;
        int numeroSecreto = 666;

        System.out.println("ADIVINA EL NUMERO");

        do {
            System.out.print("Introduce un numero: ");
            opcion = captu.nextInt();

        }while (opcion != numeroSecreto);

        System.out.println("ADIVINASTE EL NUMERO!!");
    }
}