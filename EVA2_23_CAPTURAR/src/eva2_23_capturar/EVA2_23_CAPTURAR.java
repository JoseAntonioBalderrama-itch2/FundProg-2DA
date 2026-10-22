/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //S0LICITAR LAS CALIFICACIONES Y PROMEDIAR
        int cant, califa = 0;
        double promedio;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas caliciaciones vas a capturar?");
        cant = captu.nextInt();
        captu.nextLine();
        for(int i = 0; i < cant; i++){//for (int i = 1; i <= cant; i++)
            System.out.println("Captura la Calificacion: ");
            califa = califa + captu.nextInt();//Acumulador
            captu.nextLine(); 
        }
    System.out.println("Acumulador = " + califa);
    promedio = califa / (cant * 1.0);
    System.out.println("Promedio = " + promedio);
    }
    
}
