/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente;

import Continente.continenteConstructor;
import static Continente.Pais.Pais.menuopcionesPais;
import java.util.ArrayList;
import java.util.Scanner;
import static modulocontrol.ModuloControl.menuopcionesIndex;

/**
 *
 * @author Sebas
 */

public class Continente {
    
    static ArrayList <continenteConstructor> continente = new ArrayList<>();
    static Scanner entradaDato = new Scanner (System.in);
    
    public static void Llenar(){
        continente.add(new continenteConstructor(0, "America", 42549000, 1036900579, 22.8));
        continente.add(new continenteConstructor(1, "Europa", 10530751, 747747395, 70));
        System.out.println(continente.toString());
    }
    public static void Agregar(){
        System.out.println("Registre un nuevo continente");
        System.out.println("");
        System.out.println("ID");
        int ID = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Nombre");
        String Nombre = entradaDato.next();
        System.out.println("");
        System.out.println("Superficie");
        int Superficie = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Poblacion");
        int Poblacion = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Densidad");
        double Densidad = entradaDato.nextDouble();
        System.out.println("");
        continente.add(new continenteConstructor(ID, Nombre, Superficie, Poblacion, Densidad));
        System.out.println("El continente se ha agregado exitosamente");
    }
    public static void ActualizarDatos(){
        System.out.print("Ingrese el ID del continente a actualizar: ");
        int ID=entradaDato.nextInt();
        continente.get(ID);
        System.out.print("Nuevo nombre: ");
        String Nombre=entradaDato.next();
        System.out.print("Nueva superficie: ");
        int Superficie = entradaDato.nextInt(); 
        System.out.print("Poblacion: ");
        int Poblacion = entradaDato.nextInt();
        System.out.print("Densidad: ");
        double Densidad = entradaDato.nextDouble();
        System.out.println("");
        continente.get(ID).setNombre(Nombre);
        continente.get(ID).setSuperficie(Superficie);
        continente.get(ID).setPoblacion(Poblacion);
        continente.get(ID).setDensidad(Densidad);
        System.out.println("Los datos del continente se han actualizado  correctamente");
    }
    public static void Eliminar(){
        System.out.println("Ingrese el ID del continente para eliminar");
        System.out.print("ID: ");
        int ID=entradaDato.nextInt();
        continente.remove(ID);
        System.out.println("El continente se ha eliminado de forma exitosa");
    }
    public static void menu(){
        System.out.println("Que deseas hacer?");
        System.out.println("Regresar al index- - - - - - - - - - - - - - - - - - - - - - - 1");
        System.out.println("Consultar lista de continentes- - - - - - - - - - - - - - - - -2");
        System.out.println("Agregar continente a la lista- - - - - - - - - - - - - - - - - 3");
        System.out.println("Actualizar algun dato de algun continente en la lista- - - - - 4");
        System.out.println("Eliminar continente de la lista- - - - - - - - - - - - - - - - 5");
        System.out.println("Ir al menu de los paises americanos- - - - - - - - - - - - - - 6");
        System.out.println("Terminar proceso- - - - - - - - - - - - - - - - - - - - - - - -0");
    }
    public static void opciones (int opcion){
        switch (opcion) {
            case 0: System.out.println("Adios..."); break;
            case 1: 
                System.out.println("Redirigiendo al index...");
                menuopcionesIndex(); break;
            case 2: Llenar(); break;
            case 3: Agregar(); break;
            case 4: ActualizarDatos(); break;
            case 5: Eliminar(); break;
            case 6: 
                System.out.println("Redirigiendo al menu de los paises");
                menuopcionesPais(); break;
        }
    }
    public static void menuopcionesContinente(){
        int opcion;
        do{
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        } while (opcion != 0);
    }
}