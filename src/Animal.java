/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class Animal {
     private String nombre;
    private int edad;

    // Constructor de la clase Animal
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de la clase Animal
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    // Método para mostrar información del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
