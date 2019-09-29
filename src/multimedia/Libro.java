/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.util.Hashtable;

/**
 *
 * @author Usuario DAM 2
 */
public class Libro extends Multimedia {

    String edicion, soporteDigital;
    int paginas;
    private Hashtable<String, Libro> listaAlumnos;

    public Libro() {
        listaAlumnos = new Hashtable<>();
    }

    public Libro(String edicion, String soporteDigital, int paginas, String titulo, String autor, String codigo, int ano) {
        super(titulo, autor, codigo, ano);
        this.edicion = edicion;
        this.soporteDigital = soporteDigital;
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getSoporteDigital() {
        return soporteDigital;
    }

    public void setSoporteDigital(String soporteDigital) {
        this.soporteDigital = soporteDigital;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Edicion: " + edicion);
        System.out.println("Soporte Digital: " + soporteDigital);
        System.out.println("Numero de paginas: " + paginas);
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "edicion=" + edicion + ", soporteDigital=" + soporteDigital + ", paginas=" + paginas + ", listaAlumnos=" + listaAlumnos + '}';
    }

}
