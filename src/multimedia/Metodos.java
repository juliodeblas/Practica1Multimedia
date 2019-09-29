/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Usuario DAM 2
 */
public class Metodos {

    private Hashtable<String, Musica> listaMusica;
    private Hashtable<String, Libro> listaLibro;
    private Hashtable<String, Pelicula> listaPelicula;

    public Metodos() {
        listaMusica = new Hashtable<>();
        listaLibro = new Hashtable<>();
        listaPelicula = new Hashtable<>();
    }

    public void agregarMusica(Musica musica) {
        listaMusica.put(musica.getCodigo(), musica);
    }

    public void eliminarMusica(String codigo) {
        listaMusica.remove(codigo);
    }

    public void listarMusica() {
        Enumeration<Musica> listamusica = listaMusica.elements();

        while (listamusica.hasMoreElements()) {
            Musica a = listamusica.nextElement();
            System.out.println(a.toString());
        }
    }

    public void agregarLibro(Libro libro) {
        listaLibro.put(libro.getCodigo(), libro);
    }

    public void eliminarLibro(String codigo) {
        listaLibro.remove(codigo);
    }

    public void listarLibro() {
        Enumeration<Libro> listalibro = listaLibro.elements();

        while (listalibro.hasMoreElements()) {
            Libro a = listalibro.nextElement();
            System.out.println(a.toString());
        }
    }

    public void agregarPelicula(Pelicula pelicula) {
        listaPelicula.put(pelicula.getCodigo(), pelicula);
    }

    public void eliminarPelicula(String codigo) {
        listaPelicula.remove(codigo);
    }

    public void listarPelicula() {
        Enumeration<Pelicula> listapelicula = listaPelicula.elements();

        while (listapelicula.hasMoreElements()) {
            Pelicula a = listapelicula.nextElement();
            System.out.println(a.toString());
        }
    }

    public void listarTodo() {
        listarMusica();
        listarLibro();
        listarPelicula();

    }

    
}
