package Lista;

import java.util.Scanner;

import Lista.Ejercicios.Binario;
import Lista.Ejercicios.Parentesis;
import Lista.Ejercicios.StackListString;
import Lista.Ejercicios.StackListTest;

class Main {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int op=0;
    boolean salida = false;

    System.out.println("Main class");
    do{
        System.out.println("\nIngrese numero de ejercicio(1-8) o 9 para salir: ");
        op = Integer.parseInt(scanner.nextLine());

        switch(op){
            case 1:
                //Ejercicio1: implementacion de pila con lista
                StackListTest stackTest = new StackListTest();
                stackTest.testStackInteger();
                stackTest.testStackString();
                break;
            case 2:
                //Ejercicio2: lista de string
                StackListString listaString = new StackListString();
                listaString.StackString();
                break;
            case 3:
                //Ejercicio3: verificacion de parentesis
                Parentesis parentesis = new Parentesis();
                parentesis.VerificarParentesis();
                break;
            case 4:
                //Ejercicio4 TODO
                Binario binario = new Binario();
                binario.PasarBinario();
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
