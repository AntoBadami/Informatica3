package Lista.Ejercicios;

import java.util.Scanner;

import Lista.Utils.StackList;

public class Binario {
    public void PasarBinario(){
        Scanner scanner = new Scanner(System.in);
        StackList<Integer> stackList = new StackList<Integer>();
        int num = 0;
        boolean salida = true;

        do{
            System.out.println("Ingrese un numero: ");
            num = Integer.parseInt(scanner.nextLine());

            try{
                System.out.println("Quiere ingresar otro numero? ingrese true o false: ");
                salida = Boolean.parseBoolean(scanner.nextLine());

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }while(salida == true);

        int temp = 0;
        while(stackList.isEmpty() == false){
            temp = stackList.pop();
            System.out.println(temp%2);
        }

        scanner.close();
        /*
         if(n1>1){
            ejercicio7(n1/2);
        }
        System.out.print(n1%2);
        return 0;
         */
    }
}
