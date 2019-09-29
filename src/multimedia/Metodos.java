/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    
    public void input() {
        File ficheroObjeto = new File("src/documentos/fichero.txt");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(ficheroObjeto));
            listaMusica = (Hashtable<String, Musica>) ois.readObject();
            listaLibro = (Hashtable<String, Libro>) ois.readObject();
            listaPelicula = (Hashtable<String, Pelicula>) ois.readObject();

            Enumeration<Musica> listamusica = listaMusica.elements();

            while (listamusica.hasMoreElements()) {
                Musica a = listamusica.nextElement();
                System.out.println(a.toString());
            }

            Enumeration<Libro> listalibro = listaLibro.elements();

            while (listalibro.hasMoreElements()) {
                Libro a = listalibro.nextElement();
                System.out.println(a.toString());
            }

            Enumeration<Pelicula> listapelicula = listaPelicula.elements();

            while (listapelicula.hasMoreElements()) {
                Pelicula a = listapelicula.nextElement();
                System.out.println(a.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void output() {

        File ficheroObjeto = new File("src/documentos/fichero.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ficheroObjeto));
            oos.writeObject(listaMusica);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
