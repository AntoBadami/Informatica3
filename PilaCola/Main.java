package PilaCola;
import java.util.Scanner;

import PilaCola.Tests.Palindromos;
import PilaCola.Tests.StackTest;

class Main {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int op=0;
    boolean salida = false;

    System.out.println("Main class");
    do{
        System.out.println("\nIngrese numero de ejercicio(1-5) o 6 para salir: ");
        op = Integer.parseInt(scanner.nextLine());

        switch(op){
            case 1:
                //Ejercicio1: implementacion de pila
                StackTest stackTest = new StackTest();
                stackTest.testStackInteger();
                stackTest.testStackString();
                break;
            case 2:
                //Ejercicio2: comprobacion de palindromos
                Palindromos palindromo = new Palindromos();
                palindromo.ej2();
                break;
            case 3:
                //Ejercicio3: TODO
                break;
            case 4:
                //Ejercicio4 TODO
                break;
            case 5:
                //Ejercicio5 TODO
                break;
            case 6:
                salida = true;
                break;
            default:
                System.out.println("opcion no valida");
        }

    }while(salida == false);

    scanner.close();
  }

}
