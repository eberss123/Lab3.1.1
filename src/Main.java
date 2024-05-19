/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Animal
        Animal animal = new Animal("Animal Genérico", 5);
        animal.hacerSonido();
        animal.mostrarInfo();

        System.out.println();

        // Crear un objeto de la clase Perro
        Perro perro = new Perro("Fido", 3, "Labrador");
        perro.hacerSonido();
        perro.mostrarInfo();
    }
    }

