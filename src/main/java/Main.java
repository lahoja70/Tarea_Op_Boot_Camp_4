/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * author: @edensilvestre
 */

public class Main {
        public static void main(String[] args) {
            Persona persona = new Persona();
            persona.setEdad(25);
            persona.setNombre("John Doe");
            persona.setTelefono("1234567890");
             System.out.println("Información de la persona:");
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Teléfono: " + persona.getTelefono());
        }
    }
