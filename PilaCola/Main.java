package PilaCola;
import java.util.Scanner;
import PilaCola.Tests.StackTest;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int op=0;
    boolean salida = false;

    System.out.println("Main class");
    do{
        System.out.println("\nIngrese numero de ejercicio(1-5) o 6 para salir: ");
        op = Integer.parseInt(scanner.nextLine());

        switch(op){
            case 1://implementacion de pila
                StackTest stackTest = new StackTest();
                stackTest.testStackInteger();
                stackTest.testStackString();
                break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
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
