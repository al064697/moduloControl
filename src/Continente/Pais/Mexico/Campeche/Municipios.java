/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico.Campeche;

import static Continente.Pais.Mexico.Campeche.Campeche.Localidades.menuopcionesLocalidad;
import static Continente.Pais.Mexico.Estados.menuopcionesEstado;
import static Continente.Pais.Pais.menuopcionesPais;
import java.util.ArrayList;
import java.util.Scanner; 
import static modulocontrol.ModuloControl.menuopcionesIndex;

/**
 *
 * @author Sebas
 */
public class Municipios {
    
    static ArrayList<municipiosConstructor> municipio = new ArrayList<>();
    static Scanner entradaDato = new Scanner (System.in);
    
    public static void Llenar(){
        municipio.add(new municipiosConstructor (0, "Calkini", "Calkini", 59232));
        municipio.add(new municipiosConstructor (1, "Campeche", "San Francisco de Campeche", 294077));
        municipio.add(new municipiosConstructor (2, "Carmen", "Ciudad del Carmen", 248845));
        municipio.add(new municipiosConstructor (3, "Champoton", "Heroica Ciudad de Champoton", 78170));
        municipio.add(new municipiosConstructor (4, "Hecelchakan", "Hecelchakan", 31917));
        System.out.println(municipio.toString());
    }
    public static void Agregar(){
        System.out.println("Registre un nuevo municipio");
        System.out.println("");
        System.out.println("ID");
        int ID=entradaDato.nextInt();
        System.out.println("");
        System.out.println("Nombre");
        String Nombre=entradaDato.next();
        System.out.println("");
        System.out.println("Cabecera municipal");
        String Cabecera=entradaDato.next();
        System.out.println("");
        System.out.println("Poblacion");
        int Poblacion = entradaDato.nextInt();
        System.out.println("");
        municipio.add(new municipiosConstructor(ID, Nombre, Cabecera, Poblacion));
        System.out.println("El municipio se ha agregado exitosamente");
    }
    public static void Eliminar(){
        System.out.println("Ingrese el ID del municipio para eliminar");
        System.out.print("ID: ");
        int ID=entradaDato.nextInt();
        municipio.remove(ID);
        System.out.println("El municipio se ha eliminado de forma exitosa");
    }
    public static void ActualizarDatos(){
        System.out.print("Ingrese el ID del municipio a actualizar: ");
        int ID=entradaDato.nextInt();
        municipio.get(ID);
        System.out.print("Nuevo nombre: ");
        String Nombre=entradaDato.next();
        System.out.print("Nueva cabecera municipal");
        String Cabecera = entradaDato.next(); 
        System.out.print("Poblacion");
        int Poblacion = entradaDato.nextInt();
        municipio.get(ID).setNombre(Nombre);
        municipio.get(ID).setCabecera(Cabecera);
        municipio.get(ID).setPoblacion(Poblacion);
        System.out.println("");
        System.out.println("Informacion del municipio actualizada de forma exitosa");
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Que deseas hacer?");
        System.out.println("Ir al index - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 1");
        System.out.println("Ir al menu de los paises - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -2");
        System.out.println("Volver al menu de los estados- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -3");
        System.out.println("Consultar los municipios en la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - 4");
        System.out.println("Añadir nuevos estados a la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - - - 5");
        System.out.println("Actualizar algun dato de algun estado ya existente en la lista- - - - - - - - - - - - - - 6");
        System.out.println("Eliminar estado de la lista de estados mexicanos- - - - - - - - - - - - - - - - - - - - - 7");
        System.out.println("Ir al menu de las localidades campechanas- - - - - - - - - - - - - - - - - - - - - - - - -8");
        System.out.println("Terminar proceso- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 0");   
    }
    public static void opciones (int opcion){
        switch (opcion) {
            case 0: System.out.println("Adios..."); break;
            case 1: 
                System.out.println("Redireccionando al index...");
                menuopcionesIndex(); break;
            case 2: 
                System.out.println("Redireccionando al menu de paises...");
                menuopcionesPais(); break;
            case 3: 
                System.out.println("Redireccionando al menu de estados...");
                menuopcionesEstado();break;
            case 4: Llenar(); break;
            case 5: Agregar(); break;
            case 6: ActualizarDatos(); break;
            case 7: Eliminar(); break;
            case 8: menuopcionesLocalidad(); break;
        }
    }
    public static void menuopcionesMunicipio(){
        int opcion;
        do {
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        }while ( opcion != 0);
    }
}