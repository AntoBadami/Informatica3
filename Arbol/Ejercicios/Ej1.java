package Ejercicios;

import java.util.Random;

import Arbol.Arbol;

public class Ej1 {
    public void eje1(){
        Arbol<Integer> arbol = new Arbol<Integer>();
        Random rand = new Random();

        System.out.println("Arbol con números random:");

        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(26); // Genera un número aleatorio entre 0 y 25
            System.out.print(numero + " ");
            arbol.merge(numero, null, null); // Agrega el número al árbol
        }

        System.out.println("\n\nRecorrido en orden del árbol binario:");
        arbol.printInOrder();
    }
}
