import java.util.Scanner;

import Ejercicios.Ej1;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int op=0;
    boolean salida = false;

    System.out.println("Main class");
    do{
        System.out.println("\nIngrese numero de ejercicio(1-5) o 6 para salir: ");
        op = Integer.parseInt(scanner.nextLine());

        switch(op){
            case 1:
                //Ejercicio1: árbol binario de 10 números entre 0 y 25.
                Ej1 e1 = new Ej1();
                e1.eje1();
                break;
            case 2:
                //Ejercicio2: lista de string
                break;
            case 3:
                //Ejercicio3: verificacion de parentesis
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
