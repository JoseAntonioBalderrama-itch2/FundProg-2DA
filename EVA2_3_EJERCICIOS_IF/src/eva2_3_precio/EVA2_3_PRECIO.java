/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_precio;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_PRECIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int canti;
        double precio, desc = 0, subt, total;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cual es el precio de tu Producto?");
        precio = captu.nextInt();
        System.out.println("Cuanto es la cantidad de ese producto?");
        canti = captu.nextInt();
        subt = precio * canti;
        if (subt >= 1000 ){
            desc = subt * 0.1;
            System.out.println("Tienes descuento del 10%");
        }
        total = subt - desc;
        System.out.println("Subtotal " + subt);
        System.out.println("Descuento " + desc);
        System.out.println("TOTAL " + total);
        }
    }
