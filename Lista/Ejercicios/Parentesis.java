package Lista.Ejercicios;

import java.util.Scanner;

import Lista.Utils.StackList;
/**
 * ejercicio 3
 */
public class Parentesis {
    public void VerificarParentesis(){
        Scanner scanner = new Scanner(System.in);
        StackList<Character> stackList = new StackList<Character>();
        String cadena;

        System.out.println("Ingrese una exprecion matematica: ");
        cadena = scanner.nextLine();

        for (char c : cadena.toCharArray()) {
            stackList.push(c);
        }
        char x;
        int i=0, j=0;
        while(stackList.isEmpty() == false){
            x = stackList.pop();
            if(x == '(') i++;
            if(x == ')') j++;
        }

        if (i == j){
            System.out.println("parentesis equilibrados");
        }else{
            System.out.println("parentesis desequilibrados");
        }

        scanner.close();
    }
}
