/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class Perro extends Animal {
     private String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, int edad, String raza) {
        // Llamada al constructor de la clase base (Animal)
        super(nombre, edad);
        this.raza = raza;
    }

    // Sobrescribir el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Método para mostrar información del perro, incluyendo la raza
    @Override
    public void mostrarInfo() {
        // Llamar al método de la clase base
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }
    
    
}
