package Ordenamiento.OrdenamientoTipos;
import java.util.Random;

public class Shell {

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

    public static void shell(int[] v, int n){
        int gap, i, j, temp;
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
    public static void main(String[] args) {
        int size = 1000; //tamanio del arreglo
        int[] array = new int[size];

        cargarArray(array, size);

        System.out.println("Array antes de ordenar");
        mostrarArray(array);
        
        long startTime = System.nanoTime();//mide el tiempo antes de iniciar la busqueda
        
        shell(array, size);//ordenamiento shell

        long endTime = System.nanoTime();//mide el tiempo despues de finalizar la busqueda
        
        System.out.println("\nArray despues de ordenar");
        mostrarArray(array);

        //calcular el tiempo
        long elapsedTimeMilis = (endTime - startTime) / 1000000;
        System.out.println("\nTiempo transcurrido: "+elapsedTimeMilis+"ms");
   
    }
}