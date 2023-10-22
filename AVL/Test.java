package AVL;

import java.util.Scanner;

//import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception {
        ArbolAVL <Integer> arbol = new ArbolAVL<Integer>();
        //Random rand = new Random();
       int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arbol con números random:");

        for (int i = 0; i < 6; i++) {
            System.out.print("\ningerse un numero:  ");
            numero = Integer.parseInt(scanner.nextLine());
            //int numero = rand.nextInt(26); // Genera un número aleatorio entre 0 y 25
            
            arbol.insert(numero); //no acepta valores repetidos
        }
        

        System.out.println("\nvalor minimo: " + arbol.findMin());
        System.out.println("\nvalor maximo: " + arbol.findMax());
        arbol.printInOrder();
        System.out.println("\n");
        arbol.printPreOrder();

        scanner.close();
    }
}
