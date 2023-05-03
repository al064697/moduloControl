/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulocontrol;

import static Continente.Continente.menuopcionesContinente;
import static Continente.Pais.Pais.menuopcionesPais;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */

public class ModuloControl {
    
    /**
     * @param args the command line arguments
     */
    
    static Scanner entradaDato = new Scanner(System.in);
    
    public static void menu(){
        System.out.println("Que quieres hacer?");
        System.out.println("Consultar los continentes - - - - - - - - - - - - - - - - - -1");
        System.out.println("Consultar los paises americanos - - - - - - - - - - - - - - -2");
        System.out.println("Terminar proceso- - - - - - - - - - - - - - - - - - - - - - -0");
    }
    public static void opciones (int opcion){
        switch(opcion){
            case 0: System.out.println("Adios..."); break;
            case 1: menuopcionesContinente(); break;
            case 2: menuopcionesPais(); break;
        }
    }
    public static void menuopcionesIndex(){
        int opcion;
        do{
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        } while (opcion != 0);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        menuopcionesIndex();
    }
}
