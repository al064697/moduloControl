/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais;

import Continente.Pais.paisConstructor;
import static Continente.Continente.menuopcionesContinente;
import static Continente.Pais.Mexico.Estados.menuopcionesEstado;
import java.util.ArrayList;
import java.util.Scanner;
import static modulocontrol.ModuloControl.menuopcionesIndex;

/**
 *
 * @author Sebas
 */
public class Pais {
    
    static ArrayList <paisConstructor> pais = new ArrayList<>();
    static Scanner entradaDato = new Scanner (System.in);
    
    public static void Llenar(){
        pais.add(new paisConstructor(0, "Canada", "Ottawa", "Ingles y frances", 9984670, 38781290, 3.92, "Dollar canadiense"));
        pais.add(new paisConstructor (1, "Estados Unidos", "Washington DC", "Ingles", 9147593, 339665118, 32.8, "Dollar estadounidense"));
        pais.add(new paisConstructor(2, "Mexico", "Ciudad de Mexico", "Español", 1964375, 129875529, 57, "Peso mexicano"));
        System.out.println(pais.toString());
    }
    public static void Agregar(){
        System.out.println("Registre un nuevo pais");
        System.out.println("");
        System.out.println("ID");
        int ID = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Nombre");
        String Nombre = entradaDato.next();
        System.out.println("");
        System.out.println("Capital");
        String Capital = entradaDato.next();
        System.out.println("");
        System.out.println("Idiomas");
        String Idioma = entradaDato.next();
        System.out.println("");
        System.out.println("Superficie");
        int Superficie = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Poblacion");
        int Poblacion = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Densidad de poblacion");
        double poblacionDensidad = entradaDato.nextDouble();
        System.out.println("");
        System.out.println("Moneda");
        String Moneda = entradaDato.next();
        System.out.println("");
        pais.add(new paisConstructor (ID, Nombre, Capital, Idioma, Superficie, Poblacion, poblacionDensidad, Moneda));
        System.out.println("El pais se ha agregado exitosamente");
    }  
    public static void Eliminar(){
        System.out.println("Ingrese el ID del municipio para eliminar");
        System.out.print("ID: ");
        int ID=entradaDato.nextInt();
        pais.remove(ID);
        System.out.println("El municipio se ha eliminado de forma exitosa");
    }
    public static void ActualizarDatos(){
        System.out.println("Ingrese el ID del pais a actualizar");
        int ID = entradaDato.nextInt();
        pais.get(ID);
        System.out.print("Nombre");
        String Nombre = entradaDato.next();
        System.out.print("Capital");
        String Capital = entradaDato.next();
        System.out.print("Idiomas");
        String Idioma = entradaDato.next();
        System.out.print("Superficie");
        int Superficie = entradaDato.nextInt();
        System.out.print("Poblacion");
        int Poblacion = entradaDato.nextInt();
        System.out.print("Densidad de poblacion");
        double poblacionDensidad = entradaDato.nextDouble();
        System.out.print("Moneda");
        String Moneda = entradaDato.next();
        System.out.println("");
        System.out.println("Informacion del pais actualizada de forma exitosa");        
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Que deseas hacer");
        System.out.println("Volver al index- - - - - - - - - - - - - - - - - - - - - - - - - - - 1");
        System.out.println("Volver al menu de los continentes- - - - - - - - - - - - - - - - - - 2");
        System.out.println("Consultar la lista de los paises- - - - - - - - - - - - - - - - - - -3");
        System.out.println("Agregar pais a la lista- - - - - - - - - - - - - - - - - - - - - - - 4");
        System.out.println("Editar algun dato de algun pais en la lista- - - - - - - - - - - - - 5");
        System.out.println("Eliminar pais de la lista- - - - - - - - - - - - - - - - - - - - - - 6");
        System.out.println("ir al menu de los estados mexicanos- - - - - - - - - - - - - - - - - 7");
        System.out.println("Terminar proceso- - - - - - - - - - - - - - - - - - - - - - - - - - -0");
    }
    public static void opciones (int opcion){
        switch (opcion) {
            case 0: System.out.println("Adios..."); break;
            case 1: 
                System.out.println("Redirigiendo a la ubicacion anterior");
                menuopcionesIndex(); break;
            case 2:
                System.out.println("Redirigiendo al menu de los continentes");
                menuopcionesContinente();
                break;
            case 3: Llenar();break;
            case 4: Agregar(); break;
            case 5: ActualizarDatos(); break;
            case 6: Eliminar(); break;
            case 7:
                System.out.println("Redirigiendo al menu de los estados");
                menuopcionesEstado(); break;
        }
    }
    public static void menuopcionesPais(){
        int opcion;
        do {
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        }while ( opcion != 0);
    }
}