/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

/**
 *
 * @author Usuario DAM 2
 */
public class Musica extends Multimedia {

    String formato;
    String directo;
    int duracion;

    public Musica() {
    }

    public Musica(String formato, String directo, int duracion, String titulo, String autor, String codigo, int ano) {
        super(titulo, autor, codigo, ano);
        this.formato = formato;
        this.directo = directo;
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDirecto() {
        return directo;
    }

    public void setDirecto(String directo) {
        this.directo = directo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Formato: " + formato);
        System.out.println("Directo: " + directo);
        System.out.println("Duración: " + duracion);
    }

    @Override
    public String toString() {
        return super.toString() + "Musica{" + "formato=" + formato + ", directo=" + directo + ", duracion=" + duracion + '}';
    }

}
