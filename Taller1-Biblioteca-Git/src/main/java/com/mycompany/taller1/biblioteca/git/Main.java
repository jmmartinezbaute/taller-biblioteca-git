package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }
    
    public static void crearCliente() {
        System.out.print("agregue el email del cliente: ");
        String email = sc.nextLine();
        
        System.out.print("agregue el id del cliente: ");
        String id = sc.nextLine();
        
        System.out.print("agregue el nombre del cliente: ");
        String nombre = sc.nextLine();
        
        System.out.print("agregue el telefono del cliente: ");
        String telefono = sc.nextLine();
        
        Cliente cliente = new Cliente(email, id, nombre, telefono);
        clientes.add(cliente);
        
        System.out.print("Cliente agregado correctamente");
        
    }
    
    public static void listarCliente() {
        if (clientes.isEmpty()) {
            System.out.print("No hay clientes en Lista");
            return;
        }
        
        for (Cliente cliente : clientes) {
            System.out.print("EMAIL:" + cliente.getEmail());
            System.out.print("ID:" + cliente.getId());
            System.out.print("NOMBRE:" + cliente.getNombre());
            System.out.print("TELEFONO: " + cliente.getTelefono());
        }
    }
    
    public static void buscarCliente() {
        System.out.print("Ingrese el id del cliente a buscar: ");
        String idBuscar = sc.nextLine();
        
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idBuscar)) {
                System.out.print("EMAIL:" + cliente.getEmail());
                System.out.print("ID:" + cliente.getId());
                System.out.print("NOMBRE:" + cliente.getNombre());
                System.out.print("TELEFONO: " + cliente.getTelefono());
                return;
            }
        }
        System.out.print("Cliente NO encontrado");
    }
}
