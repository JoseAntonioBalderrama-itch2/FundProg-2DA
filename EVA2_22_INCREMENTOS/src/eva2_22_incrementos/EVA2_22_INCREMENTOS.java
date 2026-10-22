/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_incrementos;

/**
 *
 * @author Usuario
 */
public class EVA2_22_INCREMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        
        // ++ --> Incrementa 1
        // i = i + 1;
        
        // -- --> Decrementa 1
        // i = i - 1;
        
        // += --> Incrementa por un valor
        // i = i + 1;
        
        // -= --> Decrementa por un valor
        // *= --> Incrementa por un valor
        // i = i * 2;
        
        //ACUMULADOR:
        //YO QUIERO QUE LA i SE INCREMENTE EN 1
        System.out.println("i = " + i);
        i = i + 1;//Acumulador
        System.out.println("i = " + i);
        i = i + 1;
        System.out.println("i = " + i);
        i++; //Incremento en 1 el valor de la variable en uno
        System.out.println("i = " + i);
        i+=2; //Incremento en 1 el valor de la variable en dos
        System.out.println("i = " + i);
        i--; //Decrementa en 1 el valor de la variable
        System.out.println("i = " + i);
        i-=2; //Decrementa en 2 el valor de la variable
        System.out.println("i = " + i);
        System.out.println("i = " + i);
        i*=2; //Multiplica en 2 el valor de la variable
        System.out.println("i = " + i);
}
}