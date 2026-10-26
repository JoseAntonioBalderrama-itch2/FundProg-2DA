/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar un numero e imprimir el siguiente patron de texto:
        //Ejemplo: 5
        //Resultado:
        //*
        //**
        //***
        //****
        //*****
        int numero;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime el numero para imprimir el patron:");
        numero = captu.nextInt();
        for(int i = 1; i <= numero; i++ ){
         cade = cade + "*";
         System.out.println(cade);
            }
        }
    }