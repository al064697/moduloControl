/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente;

/**
 *
 * @author Sebas
 */
public class continenteConstructor{
    
    private int ID;
    private String Nombre;
    private int Superficie;
    private int Poblacion;
    private double Densidad;

    public continenteConstructor() {
    }

    public continenteConstructor(int ID, String Nombre, int Superficie, int Poblacion, double Densidad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Superficie = Superficie;
        this.Poblacion = Poblacion;
        this.Densidad = Densidad;
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

    public int getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(int Superficie) {
        this.Superficie = Superficie;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    public double getDensidad() {
        return Densidad;
    }
    
    public void setDensidad(double Densidad) {
        this.Densidad = Densidad;
    }

    @Override
    public String toString() {
        return "Continente{" + "ID=" + ID + ", Nombre=" + Nombre + ", Superficie=" + Superficie + ", Poblacion=" + Poblacion + '}';
    }
    
}