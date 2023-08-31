package Ordenamiento;

import java.util.Random;

public class Quicksort {

    public static void cargarArray(int[] array, int size){
        Random random = new Random();

        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(1000);
        }
    }

    public static void mostrarArray(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
    }

    public static void quicksort(int[] item, int left, int right) {
        int i, j, temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i) j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j) i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksort(item, left, j - 1);
        if (i < right) quicksort(item, i + 1, right);
    }

    public static void main(String[] args) {
        int size = 1000; //tamanio del arreglo
        int[] array = new int[size];

        cargarArray(array, size);

        System.out.println("Array antes de ordenar");
        mostrarArray(array);
        
        long startTime = System.nanoTime();//mide el tiempo antes de iniciar la busqueda
        
        quicksort(array, 0, size-1);//ordenamiento por insercion

        long endTime = System.nanoTime();//mide el tiempo despues de finalizar la busqueda
        
        System.out.println("\nArray despues de ordenar");
        mostrarArray(array);

        //calcular el tiempo
        long elapsedTimeMilis = (endTime - startTime) / 1000000;
        System.out.println("\nTiempo transcurrido: "+elapsedTimeMilis+"ms");
   
    }
}