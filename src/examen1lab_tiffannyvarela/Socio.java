/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_tiffannyvarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class Socio {
    private String usuario;
    private String contra;
    private Date fecha_nacimiento;
    private String numero;
    private String correo;
    private String nombre;
    private String genero;
    private ArrayList<Libro>libros= new ArrayList();
    private ArrayList amigos = new ArrayList();

    public Socio() {
    }

    public Socio(String usuario, String contra, Date fecha_nacimiento, String numero, String correo, String nombre, String genero) {
        this.usuario = usuario;
        this.contra = contra;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numero = numero;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

//    @Override
//    public String toString() {
//        return "Socio{" + "nombre=" + nombre + '}';
//    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
