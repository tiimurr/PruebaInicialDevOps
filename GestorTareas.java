/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class GestorTareas {

    public static void main(String[] args) {

        ArrayList<Tarea> tareas = new ArrayList<Tarea>();
        int opcion = 0;
        do {
            System.out.println("---MENU INTERACTIVO---");
            System.out.println("1- Listar las tareas.");
            System.out.println("2- Anadir una tarea.");
            System.out.println("3- Marcar completada.");
            System.out.println("4- Eliminar tarea.");
            System.out.println("0- SALIR.");
            System.out.println("Introduzca la opcion deseada: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println(tareas);
                }
                case 2 -> {
                    tareas.add(crearTarea());
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    
                }

                default -> {
                    System.out.println("Ha ocurrido un error.");
                }

            }
        } while (opcion != 0);
    }
    static Scanner teclado = new Scanner(System.in);

    public static Tarea crearTarea() {
        System.out.println("Introduzca el nombre de la tarea: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca la descripción de la tarea: ");
        String descripcion = teclado.nextLine();

        return new Tarea(nombre, descripcion);

    }

}
