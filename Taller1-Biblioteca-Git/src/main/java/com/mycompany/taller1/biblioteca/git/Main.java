package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }
    
    public static void crearCliente(){
        System.out.print("agregue el email del cliente: ");
        String email=sc.nextLine();
        
        System.out.print("agregue el id del cliente: ");
        String id=sc.nextLine();
        
        System.out.print("agregue el nombre del cliente: ");
        String nombre=sc.nextLine();
        
       System.out.print("agregue el telefono del cliente: ");
       String telefono=sc.nextLine();
       
       Cliente cliente = new Cliente(email,id,nombre,telefono);
       clientes.add(cliente);
       
       System.out.print("Cliente agregado correctamente");
       
        
       
   }
}
