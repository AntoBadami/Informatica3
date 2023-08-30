package Ordenamiento;

public class Insercion{
    public static void insercion(int[] array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array antes de ordenar");
        for(int num : arr){
            System.out.print(num + " ");
        }

        // Llamada al método insercion después de declarar 'arr'
        insercion(arr);

        System.out.println("\nArray despues de ordenar");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}