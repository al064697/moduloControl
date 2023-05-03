/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais;

/**
 *
 * @author Sebas
 */
public class paisConstructor {
    
    private int ID;
    private String Nombre; 
    private String Capital;
    private String Idioma;
    private int Superficie;
    private int Poblacion;
    private double poblacionDensidad;
    String Moneda;

    public paisConstructor() {
    }

    public paisConstructor(int ID, String Nombre, String Capital, String Idioma, int Superficie, int Poblacion, double poblacionDensidad, String Moneda) {
        this.ID = ID;
        this.Nombre = Nombre; 
        this.Capital = Capital;
        this.Idioma = Idioma;
        this.Superficie = Superficie;
        this.Poblacion = Poblacion;
        this.poblacionDensidad = poblacionDensidad;
        this.Moneda = Moneda;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setID (int ID) {
        this.ID = ID;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre (String Nombre){
         this.Nombre = Nombre;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
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

    public double getPoblacionDensidad() {
        return poblacionDensidad;
    }

    public void setPoblacionDensidad(double poblacionDensidad) {
        this.poblacionDensidad = poblacionDensidad;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    @Override
    public String toString() {
        return "Pais{" + "ID=" + ID + ",Nombre=" + Nombre +  ", Capital=" + Capital + ", Idioma=" + Idioma + ", Superficie=" + Superficie + ", Poblacion=" + Poblacion + ", poblacionDensidad=" + poblacionDensidad + ", Moneda=" + Moneda + '}';
    }
    
}