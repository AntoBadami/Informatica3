package Recursividad;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op=0, n1=0, n2 = 0;
        Recursividad ejercicio = new Recursividad(n1, n2);
        boolean salida = false;
        
        do{
            System.out.println("Ingrese numero de ejercicio(1-7 o salir = 8): ");
            op = Integer.parseInt(scanner.nextLine());
            
            switch(op){
                case 1:
                    System.out.println("Ejercicio 1");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println(n1+"! = "+ejercicio.ejercicio1(n1));
                    break;
                case 2:
                    System.out.println("Ejercicio 2");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Sumatoria de "+n1+" = "+ejercicio.ejercicio2(n1));
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese la potencia");
                    n2 = Integer.parseInt(scanner.nextLine());
                    System.out.println(n1+"^"+n2+" = "+ejercicio.ejercicio3(n1,n2));
                    break;
                case 4:
                    System.out.println("Ejercicio 4");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Conteo de "+n1+": ");
                    ejercicio.ejercicio4(n1);
                    break;
                case 5:
                    System.out.println("Ejercicio 5");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese otro numero");
                    n2 = Integer.parseInt(scanner.nextLine());
                    System.out.println(n1+" * "+n2+" = "+ejercicio.ejercicio5(n1,n2));
                    break;
                case 6:
                    System.out.println("Ejercicio 6");
                    System.out.println("Ingrese largo del arreglo: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    int array[] = new int[n1];
                    for(int i=0; i<array.length; i++){
                        System.out.println("carge un numero");
                        array[i] = Integer.parseInt(scanner.nextLine());
                    }
                    ejercicio.ejercicio6(array, n1);
                    break;
                case 7: 
                    System.out.println("Ejercicio 7");
                    System.out.println("Ingrese un numero: ");
                    n1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Binario de "+n1+" = "+ejercicio.ejercicio7(n1));
                    break;
                case 8:
                    salida = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        }while(salida == false);
        scanner.close();
    }
}
