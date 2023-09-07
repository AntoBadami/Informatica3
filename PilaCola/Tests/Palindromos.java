package PilaCola.Tests;
import java.util.Scanner;

import PilaCola.Utils.Stack;
public class Palindromos {
    
    public void ej2() throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean isPalindromo = true;

        System.out.println("Ingrese un string: ");
        String cadena = scanner.nextLine();

        //elimina espacios en blanco y convierte en minuscula
        cadena = cadena.replaceAll("\\s", "").toLowerCase();
        
        char[] array = cadena.toCharArray();
        int index1 = array.length/2;
        int index2 = array.length + (array.length % 2);
        Stack<Character> stack1 = new Stack<Character>(index1);
        Stack<Character> stack2 = new Stack<Character>(index2);

        //TODO hacer dos pilas para comparar
        for(int i=0; i < index1; i++){
            stack1.push(array[i]);
        }
        for(int i = index2; i < array.length; i++){
            stack2.push(array[i]);
        }

        //TODO implementar la funcion isPalindromo
        for(int i = index2; i < array.length; i++){
            char charStack = stack1.pop();
            char chatAct = array[i];

            if(charStack != chatAct){
                isPalindromo = false;
                break;
            }
        }

        if(isPalindromo){
            System.out.println("Es palindromo");
        }else{
            System.out.println("no es palindromo");
        }

        scanner.close();
    }

}
