/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //PEDIR DOS VALORES ENTEROS: USAR SWITCH
        //PEDIR LA OPERACION
        //1.-SUMA
        //2.-RESTA
        //3.-MULTIPLICACION
        //4.-DIVISION
        //CUALQUIER OTRO VALOR --> OPERACION INVALIDA
        //REGRESAR EL RESULTADO
        Scanner captu = new Scanner(System.in);
        int valor;
        double result, valor1, valor2;
        
        System.out.println("/////// BIENVENIDO A LA CALCULADORA ///////////// ");
        System.out.println("Dime tu Primer Valor?");
        valor1 = captu.nextInt();
        System.out.println("Dime tu Segundo Valor?");
        valor2 = captu.nextInt();
        System.out.println("Que te Gustaria hacer (1 = Suma) ");
        System.out.println("Que te Gustaria hacer (2 = Resta) ");
        System.out.println("Que te Gustaria hacer (3 = Mulplicacion)");
        System.out.println("Que te Gustaria hacer (4 = Division) ");
        valor = captu.nextInt();
        
        switch(valor){
            case 1:
                result = valor1 + valor2;
                System.out.println("Este es el resultado de tu Suma: " + result);
                break;
            case 2:
                result = valor1 - valor2;
                System.out.println("Este es el resultado de tu Resta: " + result);
                break;
            case 3:
                result = valor1 * valor2;
                System.out.println("Este es el resultado de tu Resta: " + result);
                break;
            case 4:
                result = valor1 / valor2;
                System.out.println("Este es el resultado de tu Division: " + result);
                break;
            default:
                System.out.println("Dia No Valido");
        }
    }
    
}
