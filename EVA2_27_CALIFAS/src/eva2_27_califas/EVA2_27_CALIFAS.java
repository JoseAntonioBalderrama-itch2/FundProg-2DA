/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_27_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner captu = new Scanner(System.in);

        int califa;
        int suma = 0;
        int contador = 0;
        double prom;

        while (true) {
            System.out.println("Introduce la calificación a capturar (-1 para terminar):");
            califa = captu.nextInt();

            if (califa == -1) {
                break;
            }

            suma += califa;
            contador++;
        }

        if (contador > 0) {
            prom = (double) suma / contador;
            System.out.println("RESULTADO: " + prom);
        } else {
            System.out.println("No se capturaron calificaciones.");
        }
    }
}