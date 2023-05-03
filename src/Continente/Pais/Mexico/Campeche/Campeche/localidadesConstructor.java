/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Continente.Pais.Mexico.Campeche.Campeche;

/**
 *
 * @author Sebas
 */
public class localidadesConstructor {
    
    private int ID;
    private String Nombre;
    private int Altitud;
    private int Poblacion;
    private int CodigoPostal;
    private int LADA;
    private int Matricula;

    public localidadesConstructor() {
    }

    public localidadesConstructor(int ID, String Nombre, int Altitud, int Poblacion, int CodigoPostal, int LADA, int Matricula) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Altitud = Altitud;
        this.Poblacion = Poblacion;
        this.CodigoPostal = CodigoPostal;
        this.LADA = LADA;
        this.Matricula = Matricula;
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

    public int getAltitud() {
        return Altitud;
    }

    public void setAltitud(int Altitud) {
        this.Altitud = Altitud;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public int getLADA() {
        return LADA;
    }

    public void setLADA(int LADA) {
        this.LADA = LADA;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return "localidadesConstructor{" + "ID=" + ID + ", Nombre=" + Nombre + ", Altitud=" + Altitud + ", Poblacion=" + Poblacion + ", CodigoPostal=" + CodigoPostal + ", LADA=" + LADA + ", Matricula=" + Matricula + '}';
    }
    
}