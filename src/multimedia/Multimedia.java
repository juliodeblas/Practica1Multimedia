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
public class Multimedia {

    String titulo, autor, codigo;
    int ano;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, String codigo, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Codigo: " + codigo);
        System.out.println("Año: " + ano);
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", codigo=" + codigo + ", ano=" + ano + '}';
    }

    
}
