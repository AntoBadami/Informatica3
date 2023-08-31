package Ordenamiento.OrdenamientoTipos;
import java.util.Random;

public class Insercion{

    public static void cargarArray(int[] array, int size){
        Random random = new Random();

        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(1000);
        }
    }

    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

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
        int size = 10000; //tamanio del arreglo
        int[] array = new int[size];

        cargarArray(array, size);

        System.out.println("Array antes de ordenar");
        mostrarArray(array);
        
        long startTime = System.nanoTime();//mide el tiempo antes de iniciar la busqueda
        
        insercion(array);//ordenamiento por insercion

        long endTime = System.nanoTime();//mide el tiempo despues de finalizar la busqueda
        
        System.out.println("\nArray despues de ordenar");
        mostrarArray(array);

        //calcular el tiempo
        long elapsedTimeMilis = (endTime - startTime) / 1000000;
        System.out.println("\nTiempo transcurrido: "+elapsedTimeMilis+"ms");
    }
}