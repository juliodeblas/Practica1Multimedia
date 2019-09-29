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
public class Pelicula extends Multimedia {

    String[] actores = new String[2];
    String pais;
    int duracion;

    public Pelicula() {
    }

    public Pelicula(String pais, int duracion, String titulo, String autor, String codigo, int ano, String[] actores) {
        super(titulo, autor, codigo, ano);
        this.pais = pais;
        this.duracion = duracion;
        this.actores = actores;
    }

    Pelicula(String pais, int duracion, String titulo3, String autor3, String codigo3, int ano3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        System.out.print("Actores: ");
        for (int i = 0; i < actores.length; i++) {
            System.out.print(actores[i] + " ");
        }
        System.out.println("Pais: " + pais);
        System.out.println("Duracion: " + duracion);
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" + "actores=" + actores[0] + " y " + actores[1] + ", pais=" + pais + ", duracion=" + duracion + '}';
    }

}
