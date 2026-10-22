/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Josea
 */
public class EVA2_17_COVID {

    
    public static void main(String[] args) {
        
    Scanner captu = new Scanner(System.in);

    int edad;
    double peso, IMC, estatura;
    String enfermedadcronica;

    System.out.println("Que edad tienes?");
    edad = captu.nextInt();
    captu.nextLine();
    
    System.out.println("Cual es tu Estatura?");
    estatura = captu.nextFloat();
    captu.nextLine();
    
    System.out.println("Cual es tu Peso?");
    peso = captu.nextDouble();
    captu.nextLine();
    
    System.out.println("Poses Una Enfermdad Cronica? (S/N)");
    enfermedadcronica = captu.nextLine();

    IMC = peso / (estatura * estatura);
    System.out.print("Tu IMC Es= ");
    System.out.println(IMC);
    
   if ((edad > 65) || (enfermedadcronica.equals("S")) || (IMC >= 25)){
            System.out.println("ESTAS EN RIESGO");
        } else {
            System.out.println("NO ESTAS EN RIESGO");

        }
    }
}

