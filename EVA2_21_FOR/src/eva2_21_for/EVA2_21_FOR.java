/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

/**
 *
 * @author Usuario
 */
public class EVA2_21_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Acceso por indices --> i
        //IMRPIMIR UN LISTADO DE 1 AL 10:
        //3 Parametros
        //Punto de partida
        //Condicion para detenerse
        //Avance --> de uno en uno
        for(int i = 1; i <= 10; i++ ){
            //INTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
    System.out.println();
    //20 22 24 26 28 30 32 34 36 38
    for(int i = 20; i <= 38; i+=2 ){
            //INTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
    System.out.println();
    for(int i = 0; i < 10; i++ ){
            //INTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
    //DEL 10 AL 1
    int x;
    System.out.println();
    for(x = 10; x >= 1; x-- ){
            //INTRUCCION A REPETIR
            System.out.print(x + " - ");
        }
    //PARES ENTRE 0 Y 20
    System.out.println();
    for(int i = 0; i <= 20; i+=2 ){
            //INTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
    }
    
}
