/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora, costo;
        Scanner captu = new Scanner(System.in);
        System.out.println("DIME EL TIEMPO DE HORA ESTACIONADA");
        hora = captu.nextInt();
        if (hora > 10){
            costo = 150;
            System.out.println("SE TE COBRARON:" + costo );
        }else if (hora > 5){
            costo = 10 * hora;
            System.out.println("SE TE COBRARON:" + costo );
        }else if (hora > 2){
            costo = 20 * hora;
            System.out.println("SE TE COBRARON:" + costo );
        }else if (hora > 0){
            costo = 25 * hora;
            System.out.println("SE TE COBRARON:" + costo );
        }else{
            System.out.println("NO ESTA DISPONIBLE");
        }
    }
        
}
    
