/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, opcion2;
        Metodos metodos = new Metodos();

        do {
            System.out.println("1.Agregar");
            System.out.println("2.Eliminar");
            System.out.println("3.Listar");
            System.out.println("4.Importar lista de elementos");
            System.out.println("5.Exportar lista de elementos");
            System.out.println("6.Salir");
            System.out.println("Introduzca la opcion que desee: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué quiere agregar?");
                    System.out.println("1.Música");
                    System.out.println("2.Libro");
                    System.out.println("3.Película");
                    opcion2 = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            String titulo,
                             autor,
                             codigo,
                             formato,
                             directo;
                            int ano,
                             duracion;

                            System.out.println("Introduzca el titulo: ");
                            titulo = sc.next();
                            System.out.println("Introduzca el autor: ");
                            autor = sc.next();
                            System.out.println("Introduzca el codigo: ");
                            codigo = sc.next();
                            System.out.println("Introduzca el año: ");
                            ano = sc.nextInt();
                            System.out.println("Introduzca el formato");
                            formato = sc.next();
                            System.out.println("Introduzca el directo");
                            directo = sc.next();
                            System.out.println("Introduzca la duracion");
                            duracion = sc.nextInt();

                            Musica musica = new Musica(formato, directo, duracion, titulo, autor, codigo, ano);
                            metodos.agregarMusica(musica);
                            System.out.println("Canción agregada con éxito");

                            break;
                        case 2:
                            String titulo2,
                             autor2,
                             codigo2,
                             edicion,
                             soporteDigital;
                            int ano2,
                             paginas;

                            System.out.println("Introduzca el titulo: ");
                            titulo2 = sc.next();
                            System.out.println("Introduzca el autor: ");
                            autor2 = sc.next();
                            System.out.println("Introduzca el codigo: ");
                            codigo2 = sc.next();
                            System.out.println("Introduzca el año: ");
                            ano2 = sc.nextInt();
                            System.out.println("Introduzca la edicion: ");
                            edicion = sc.next();
                            System.out.println("Introduzca el soporte digital: ");
                            soporteDigital = sc.next();
                            System.out.println("Introduce el numero de paginas: ");
                            paginas = sc.nextInt();

                            Libro libro = new Libro(edicion, soporteDigital, paginas, titulo2, autor2, codigo2, ano2);
                            metodos.agregarLibro(libro);
                            System.out.println("Libro agregado con éxito");

                            break;
                        case 3:
                            String titulo3,
                             autor3,
                             codigo3,
                             pais;
                            int ano3,
                             duracion3;
                            String[] actores = new String[2];

                            System.out.println("Introduzca el titulo: ");
                            titulo3 = sc.next();
                            System.out.println("Introduzca el autor: ");
                            autor3 = sc.next();
                            System.out.println("Introduzca el codigo: ");
                            codigo3 = sc.next();
                            System.out.println("Introduzca el año: ");
                            ano3 = sc.nextInt();
                            System.out.println("Introduce el pais: ");
                            pais = sc.next();
                            System.out.println("Introduce la duracion: ");
                            duracion = sc.nextInt();
                            System.out.println("Introduce los dos actores principales");
                            for (int i = 0; i < actores.length; i++) {
                                actores[i] = sc.next();
                            }

                            Pelicula pelicula = new Pelicula(pais, duracion, titulo3, autor3, codigo3, ano3, actores);
                            metodos.agregarPelicula(pelicula);
                            System.out.println("Pelicula agregada con éxito");

                            break;
                        default:
                            System.out.println("Debe introducir una opción correcta");
                            break;
                    }

                    break;
                case 2:
                    System.out.println("¿Qué quiere eliminar?");
                    System.out.println("1.Música");
                    System.out.println("2.Libro");
                    System.out.println("3.Película");
                    opcion2 = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            String codigo1;

                            System.out.println("Introduzca el código de la canción que desea eliminar: ");
                            codigo1 = sc.next();
                            metodos.eliminarMusica(codigo1);
                            System.out.println("Canción eliminada con éxito");

                            break;
                        case 2:
                            String codigo2;

                            System.out.println("Introduzca el código del libro que desea eliminar: ");
                            codigo2 = sc.next();
                            metodos.eliminarLibro(codigo2);
                            System.out.println("Libro eliminado con éxito");

                            break;
                        case 3:
                            String codigo3;

                            System.out.println("Introduzca el código de la película que desea eliminar: ");
                            codigo3 = sc.next();
                            metodos.eliminarPelicula(codigo3);
                            System.out.println("Película eliminada con éxito");

                            break;
                        default:
                            System.out.println("Debe introducir una opción correcta");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("¿Qué quieres listar?");
                    System.out.println("1.Música");
                    System.out.println("2.Libros");
                    System.out.println("3.Películas");
                    System.out.println("4.Todo");
                    opcion2 = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            metodos.listarMusica();
                            break;
                        case 2:
                            metodos.listarLibro();
                            break;
                        case 3:
                            metodos.listarPelicula();
                            break;
                        case 4:
                            metodos.listarTodo();
                            break;
                        default:
                            System.out.println("Debe introducir una opción correcta");
                            break;
                    }
                    break;
                case 4:
                    metodos.input();
                    break;
                case 5:
                    //metodos.output();
                    break;
                case 6:
                    System.out.println("Has salido con éxito.");
                    break;
            }
        } while (opcion != 6);

    }

}
