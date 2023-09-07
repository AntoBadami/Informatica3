package Ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class ArrayChar {
    public static void cargarArray(char[] array, int size){
        Random random = new Random();

        for(int i = 0; i < size; i++){
            array[i] = (char) (random.nextInt(26) + 'a');
        }
    }

    public static void mostrarArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void insercion(char[] array){
        for(int i = 1; i < array.length; i++){
            char key = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            
            array[j + 1] = key;
        }
    }

    public static void shell(char[] v, int n){
        int gap, i, j;
        char temp;
        for(gap=n/2; gap>0; gap /= 2){
            for(i = gap; i<n; i++){
                for(j=i-gap; j>=0 && v[j] > v[j+gap]; j-=gap){
                    temp = v[j];
                    v[j] = v[j+gap];
                    v[j+gap] = temp;
                }
            }
        }
    }

    public static void quicksort(char[] item, int left, int right) {
        int i, j;
        char temp;
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
        int size = 100, op=0; //tamanio del arreglo
        char[] array = new char[size];
        Scanner scanner = new Scanner(System.in);

        cargarArray(array, size);

        System.out.println("Array antes de ordenar");
        mostrarArray(array);
        
        System.out.println("\n\n1.Ordenamiento por insercion");
        System.out.println("2. Shellsort");
        System.out.println("3. Quicksort");
        System.out.println("Ingrese una opcion: ");
        op = Integer.parseInt(scanner.nextLine());

        long startTime = System.nanoTime();//mide el tiempo antes de iniciar la busqueda
        switch(op){
            case 1:
                insercion(array);//ordenamiento por insercion
                break;
            case 2:  
                shell(array, size);//ordenamiento shell
                break;
            case 3:
            quicksort(array, 0, size-1);//ordenamiento quicksort
                break;
            default:
                System.out.println("opcion no valida - no se pudo ordenar");
        }
        
        long endTime = System.nanoTime();//mide el tiempo despues de finalizar la busqueda

        System.out.println("\nArray despues de ordenar");
        mostrarArray(array);

        //calcular el tiempo
        long elapsedTimeMilis = (endTime - startTime) / 1000000;
        System.out.println("\n\nTiempo transcurrido: "+elapsedTimeMilis+"ms");

        scanner.close();
   
    }
}
