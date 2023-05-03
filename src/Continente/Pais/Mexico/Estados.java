/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico;

import static Continente.Pais.Mexico.Campeche.Municipios.menuopcionesMunicipio;
import static Continente.Pais.Pais.menuopcionesPais;
import java.util.ArrayList;
import java.util.Scanner;
import static modulocontrol.ModuloControl.menuopcionesIndex;

/**
 *
 * @author Sebas
 */
public class Estados {
    
    static ArrayList<estadosConstructor> estado = new ArrayList<>();
    static Scanner entradaDato = new Scanner (System.in); 
    
    public static void Llenar(){
        estado.add(new estadosConstructor (0, "Ciudad de Mexico", "-", 1485, 9259354, 5960.27));
        estado.add(new estadosConstructor (1, "Estado de Mexico", "Toluca de Lerdo", 22357, 17240430, 678.80));
        estado.add(new estadosConstructor(2, "Oaxaca", "Oaxaca de Juarez", 93793, 4228733, 40.54));
        estado.add(new estadosConstructor(3, "Puebla", "Puebla de Zaragoza", 34290, 6682040, 168.56));
        estado.add(new estadosConstructor (4, "Campeche", "Campeche", 57484.9, 928363, 16.02));
        System.out.println(estado.toString());
    }
    public static void Agregar(){
        System.out.println("Registre un nuevo estado");
        System.out.println("");
        System.out.println("ID");
        int estadoID = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Nombre");
        String estadoNombre = entradaDato.next();
        System.out.println("");
        System.out.println("Capital");
        String estadoCapital = entradaDato.next();
        System.out.println("");
        System.out.println("Superficie");
        int estadoSuperficie = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Poblacion");
        int estadoPoblacion = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Densidad de poblacion");
        double estadoDensidadPoblacion = entradaDato.nextDouble();
        System.out.println("");
        estado.add(new estadosConstructor(estadoID, estadoNombre, estadoCapital, estadoSuperficie, estadoPoblacion, estadoDensidadPoblacion));
        System.out.println("El estado se ha agregado exitosamente");
    }
    public static void Eliminar(){
        System.out.println("Ingrese el ID del estado que desea eliminar");
        System.out.print("ID: ");
        int estadoID = entradaDato.nextInt();
        estado.remove(estadoID);
        System.out.println("El estado se ha eliminado de forma exitosa");
    }  
    public static void ActualizarDatos(){
        System.out.print("Ingrese el ID del estado a actualizar");
        int estadoID = entradaDato.nextInt();
        estado.get(estadoID);
        System.out.print("Nuevo nombre: ");
        String estadoNombre = entradaDato.next();
        System.out.print("Nueva capital: ");
        String estadoCapital = entradaDato.next();
        System.out.print("Nueva superficie: ");
        int estadoSuperficie = entradaDato.nextInt();
        System.out.print("Nueva Poblacion");
        int estadoPoblacion = entradaDato.nextInt();
        System.out.print("Nueva densidad de poblacion: ");
        double estadoDensidadPoblacion = entradaDato.nextDouble();
        estado.get(estadoID).setNombre(estadoNombre);
        estado.get(estadoID).setCapital(estadoCapital);
        estado.get(estadoID).setSuperficie(estadoSuperficie);
        estado.get(estadoID).setPoblacion(estadoPoblacion);
        estado.get(estadoID).setPoblacionDensidad(estadoDensidadPoblacion);
        System.out.println("");
        System.out.println("Informacion del estado actualizada de forma exitosa");     
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Que deseas hacer?");
        System.out.println("Volver al index - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 1");
        System.out.println("Volver a la lista de los paises- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -2");
        System.out.println("Consultar los estados a la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - - - 3");
        System.out.println("Añadir nuevo estado a la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 4");
        System.out.println("Actualizar algun dato de algun estado ya existente en la lista- - - - - - - - - - - - - - 5");
        System.out.println("Eliminar estado de la lista de estados mexicanos- - - - - - - - - - - - - - - - - - - - - 6");
        System.out.println("Ir a la lista de municipios campechanos- - - - - - - - - - - - - - - - - - - - - - - - - -7");
        System.out.println("Terminar proceso- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 0");   
    }
    public static void opciones (int opcion){
        switch (opcion) {
            case 0: System.out.println("Adios..."); break;
            case 1: 
                System.out.println("Redireccionando al index");
                menuopcionesIndex(); break;
            case 2: 
                System.out.println("Redireccionando al menu de paises");
                menuopcionesPais(); break;
            case 3: Llenar();break;
            case 4: Agregar(); break;
            case 5: ActualizarDatos(); break;
            case 6: Eliminar(); break;
            case 7: menuopcionesMunicipio(); break;
        }
    }
    public static void menuopcionesEstado(){
        int opcion;
        do {
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        }while ( opcion != 0);
    }
}