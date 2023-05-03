/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico.Campeche.Campeche;

import static Continente.Pais.Mexico.Campeche.Municipios.menuopcionesMunicipio;
import static Continente.Pais.Mexico.Estados.menuopcionesEstado;
import static Continente.Pais.Pais.menuopcionesPais;
import java.util.ArrayList;
import java.util.Scanner;
import static modulocontrol.ModuloControl.menuopcionesIndex;

/**
 *
 * @author Sebas
 */
public class Localidades {
    
    static ArrayList<localidadesConstructor> localidades = new ArrayList<>();
    static Scanner entradaDato = new Scanner (System.in); 
    
    public static void Llenar(){
        localidades.add(new localidadesConstructor(0, "Lerma", 2, 8281, 24500, 981, 4));
        localidades.add(new localidadesConstructor(1, "Hampolol", 10, 1123, 00000, 981, 0));
        System.out.println(localidades.toString());
    }
    public static void Agregar(){
        System.out.println("Registre una nueva localidad");
        System.out.println("");
        System.out.println("ID");
        int ID = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Nombre");
        String Nombre = entradaDato.next();
        System.out.println("");
        System.out.println("Altitud");
        int Altitud = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Poblacion");
        int Poblacion = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Codigo Postal");
        int CodigoPostal = entradaDato.nextInt();
        System.out.println("");
        System.out.println("LADA");
        int LADA = entradaDato.nextInt();
        System.out.println("");
        System.out.println("Matricula");
        int Matricula = entradaDato.nextInt();
        System.out.println("");
        localidades.add(new localidadesConstructor(ID, Nombre, Altitud, Poblacion, CodigoPostal, LADA, Matricula));
        System.out.println("La localidad se ha agregado exitosamente");
    }
    public static void ActualizarDatos(){
        System.out.print("Ingrese el ID del municipio a actualizar: ");
        int ID=entradaDato.nextInt();
        localidades.get(ID);
        System.out.print("Nuevo nombre: ");
        String Nombre=entradaDato.next();
        System.out.print("Nueva altitud: ");
        int Altitud = entradaDato.nextInt(); 
        System.out.print("Poblacion: ");
        int Poblacion = entradaDato.nextInt();
        System.out.print("Codigo Postal: ");
        int CodigoPostal = entradaDato.nextInt();
        System.out.print("LADA: ");
        int LADA = entradaDato.nextInt();
        System.out.print("Matricula: ");
        int Matricula = entradaDato.nextInt();
        System.out.println("");
        localidades.get(ID).setNombre(Nombre);
        localidades.get(ID).setAltitud(Altitud);
        localidades.get(ID).setPoblacion(Poblacion);
        localidades.get(ID).setCodigoPostal(CodigoPostal);
        localidades.get(ID).setLADA(LADA);
        localidades.get(ID).setMatricula(Matricula);
        System.out.println("Los datos de la localidad se han actualizado  correctamente");
    }
    public static void Eliminar(){
        System.out.println("Ingrese el ID de la localidad para eliminar");
        System.out.print("ID: ");
        int ID=entradaDato.nextInt();
        localidades.remove(ID);
        System.out.println("La localidad se ha eliminado de forma exitosa");
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Que deseas hacer?");
        System.out.println("Ir al index - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -1");
        System.out.println("Ir al menu de los paises - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 2");
        System.out.println("Ir al menu de los estados- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 3");
        System.out.println("Volver al menu de los municipios- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -4");
        System.out.println("Consultar las localidades en la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 5");
        System.out.println("Añadir nuevas localidades a la lista- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -6");
        System.out.println("Actualizar algun dato de alguna localidad ya existente en la lista- - - - - - - - - - - - - - - - -7");
        System.out.println("Eliminar localidad de la lista de localidades campechanas- - - - - - - - - - - - - - - - - - - - - 8");
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
            case 4: 
                System.out.println("Redireccionando al menu de municipios");
                menuopcionesMunicipio();
            case 5: Llenar(); break;
            case 6: Agregar(); break;
            case 7: ActualizarDatos(); break;
            case 8: Eliminar(); break;
            case 9: break;
        }
    }
    public static void menuopcionesLocalidad(){
        int opcion;
        do {
            menu();
            opcion = entradaDato.nextInt();
            opciones (opcion);
        }while ( opcion != 0);
    }
}