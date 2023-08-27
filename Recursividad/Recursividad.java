package Recursividad;

public class Recursividad {
    private int n1;
    private int n2;

    public Recursividad(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
//1. Escribe una función recursiva que calcule el factorial de un número entero positivo n.
    public int ejercicio1(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * ejercicio1(n-1);
        }
    }
    
//2. Escribe una función recursiva que calcule la suma de los primeros n enteros positivos
    public int ejercicio2(int n){
        if(n < 0){
            throw new IllegalArgumentException("El numero debe ser positivo");
        }
        
        if(n <= 1){
            return 1;
        }else{
            return n + ejercicio2(n-1);
        }
    }
    
//3. Escribe una función recursiva que calcule la potencia de un número base elevado a un exponente.
    public int ejercicio3(int n1, int n2){
        if(n2 == 0){
            return 1;
        }else{
            return n1 * ejercicio3(n1,n2-1);
        }
    }
//4. Escribe una función recursiva que imprima un conteo regresivo desde un número n hasta 1.
    public int ejercicio4(int n1){
        if(n1 == 1){
            System.out.println(n1);
            return n1;
        }else{
            System.out.print(n1+" ");
            return ejercicio4(n1-1);
        }
    }
//5. Escriba un método recursivo que calcule el producto de dos números enteros usando sumas sucesivas.
    public int ejercicio5(int n1, int n2){
        if(n2 == 1){
            return n1;
        }else if(n2 == 0){
            return 0;
        }else{
            return n1 + ejercicio5(n1,n2-1);
        }
    }
//6. Escriba un método recursivo que imprima los elementos de un arreglo en orden inverso.
    public int ejercicio6(int array[], int n1){
        if(n1 == 1){
            System.out.println(array[n1-1]);
            return n1;
        }else{
            System.out.print(array[n1-1]+" ");
            return ejercicio6(array,n1-1);
        }
    }
    /*7. Escriba un método recursivo que devuelva el número de unos en la representación
binaria de N. Use el hecho de que es igual al número de unos en la representación
binaria de N/2, más 1 si N es impar.*/
    public int ejercicio7(int n1){
        /*if(n1 == 0){
            return 0;
        }
        System.out.println(n1%2);
        if(n1 % 2 == 1){
            return ejercicio7(n1 / 2) + 1;
        }else{
            return ejercicio7(n1 / 2);
        }*/
        if(n1>1){
            ejercicio7(n1/2);
        }
        System.out.print(n1%2);
        return 0;
    }
}
