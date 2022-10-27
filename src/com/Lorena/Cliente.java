package com.Lorena;

public class Cliente extends Persona {
    double credito;

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Lorena";
        cliente.edad = 32;
        cliente.telefono = 601144940;
        cliente.credito = 3.558;

        System.out.println("NOMBRE: " + cliente.nombre);
        System.out.println("EDAD: " + cliente.edad);
        System.out.println("TELEFONO: " + cliente.telefono);
        System.out.println("CREDITO: " + cliente.credito + " euros");

    }
}
