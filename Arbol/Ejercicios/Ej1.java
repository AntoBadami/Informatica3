package Ejercicios;

import java.util.Random;
import java.util.Scanner;

import Arbol.Arbol;

public class Ej1 {
    public void eje1(){
        Arbol<Integer> arbol = new Arbol<Integer>();
        Random rand = new Random();
       
        System.out.println("Arbol con números random:");

        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(26); // Genera un número aleatorio entre 0 y 25
            System.out.print(numero + " ");
            Arbol<Integer> nuevoArbol = new Arbol<>(numero); // Crea un nuevo árbol con el número
            arbol.merge(numero, arbol, nuevoArbol); // Fusiona el nuevo árbol con el árbol existente
        }
        

        System.out.println("\n\nRecorrido en orden del árbol binario:");
        arbol.printInOrder();
    }
}



