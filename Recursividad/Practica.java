package Recursividad;

public class Practica {
    public static int cantVocales(char array[],int i){
        if (i == 0) {
            return 0;
        }else{
        char c = array[i - 1]; // Restamos 1 al índice para acceder correctamente al último carácter.
    
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1 + cantVocales(array, i - 1); // Llamada recursiva para el resto del arreglo.
        } else {
            return cantVocales(array, i - 1); // Llamada recursiva para el resto del arreglo sin contar la vocal actual.
        }
        }
    }

    public static int suma(int []v, int n){
        if(n==0){
            return v[0];
        }else{
            return v[n]+suma(v, n-1);
        }
    }

    public static void main(String[] args) {
        char array[] = {'h','o','l','a'};
        int i = array.length;
        int v[] = {1,3,1};
        int n = v.length-1;

        System.out.println("suma: "+suma(v, n));
        System.out.println("cantidad vocales");
        System.out.println(cantVocales(array, i));
    }
}
