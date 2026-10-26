/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Josea
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume, facto = 1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a Calcular:");
        nume = captu.nextInt();
        //PARA 5 = 5 X 4 X 3 X 2 X 1 = 120
        for(int i = nume; i >= 1; i--){
            //Operacion 
            facto = facto * i;//Acumular (En multiplicaciones, debe iniciar en 1)
        }   
        System.out.println("Acumulador = " + nume + " - " + facto);
        //Caso 2: 1 X 2 X 3 X 4 X 5 = 120
        for(int i = nume; i < 1; i++){
            //Operacion 
            facto *= i;//Acumular (En multiplicaciones, debe iniciar en 1)
        }
        System.out.println("Acumulador = " + nume + " - " + facto);
    }
}
