/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

public class EVA2_16_DESCUENTO {

public static void main(String[] args) {

    Scanner captu = new Scanner(System.in);

    int edad;
    String estudiante, credencialVigente, insen;

    System.out.println("Que edad tienes?");
    edad = captu.nextInt();
    captu.nextLine();

    System.out.println("Eres estudiante? (S/N)");
    estudiante = captu.nextLine();

    System.out.println("Tienes credencial INSEN? (S/N)");
    insen = captu.nextLine();
        
    System.out.println("Tienes credencial vigente? (S/N)");
        credencialVigente = captu.nextLine();

   if ((edad < 18) || (estudiante.equals("S") && credencialVigente.equals("S")) || (edad > 60 && insen.equals("S"))) {
            System.out.println("TIENES DESCUENTO");
        } else {
            System.out.println("NO TIENES DESCUENTO");

        }
    }
}