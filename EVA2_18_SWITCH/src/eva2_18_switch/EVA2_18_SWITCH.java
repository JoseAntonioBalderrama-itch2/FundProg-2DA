/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero del (1-7) : ");
        int dia = captu.nextInt();
        
        switch(dia){//EVALUA ENTEROS: int, short, bye, TEXTO: String ENUM:
            case 1:
                System.out.println("Domingo");
                //Aqui podemos poner cuantas intrucciones necesitamos
                break;//Termina rl caso y el switch
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default://opcional: que hago cuando no es ninguna opcion anterior
                System.out.println("Dia No Valido");
        }
    }
    
}
