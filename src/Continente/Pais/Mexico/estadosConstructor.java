/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico;

/**
 *
 * @author Sebas
 */
public class estadosConstructor {
    
    private int ID;
    private String Nombre; 
    private String Capital;
    private double Superficie;
    private int Poblacion;
    private double poblacionDensidad;

    public estadosConstructor() {
    }

    public estadosConstructor(int ID, String Nombre, String Capital, double Superficie, int Poblacion, double poblacionDensidad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Capital = Capital;
        this.Superficie = Superficie;
        this.Poblacion = Poblacion;
        this.poblacionDensidad = poblacionDensidad;
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

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public double getSuperficie() {
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

    public double getPoblacionDensidad() {
        return poblacionDensidad;
    }

    public void setPoblacionDensidad(double poblacionDensidad) {
        this.poblacionDensidad = poblacionDensidad;
    }

    @Override
    public String toString() {
        return "Estado{" + "ID=" + ID + ", Nombre=" + Nombre + ", Capital=" + Capital + ", Superficie=" + Superficie + ", Poblacion=" + Poblacion + ", poblacionDensidad=" + poblacionDensidad + '}';
    }
    
}