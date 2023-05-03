/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico.Campeche;

/**
 *
 * @author Sebas
 */
public class municipiosConstructor {
    
    private int ID;
    private String Nombre;
    private String Cabecera;
    private int Poblacion;

    public municipiosConstructor() {
    }

    public municipiosConstructor(int ID, String Nombre, String Cabecera, int Poblacion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Cabecera = Cabecera;
        this.Poblacion = Poblacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCabecera() {
        return Cabecera;
    }

    public void setCabecera(String Cabecera) {
        this.Cabecera = Cabecera;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    @Override
    public String toString() {
        return "Municipio{" + "ID=" + ID + ", Nombre=" + Nombre + ", Cabecera=" + Cabecera + ", Poblacion=" + Poblacion + '}';
    }
    
    
}