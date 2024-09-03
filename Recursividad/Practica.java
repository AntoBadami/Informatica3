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

    public static void recursiva (int n){

        if(n==1){
            System.out.println(n);
        }
        else{ 
            if(n%2!=0){
                System.out.println(n);
            }
            recursiva(n-1);
        }
    }

    public static int[] ordenar(int array[], int n){

        if( n == 0){
            return array;
        }else{
            int indexMax = 0;
            for(int i = 1; i < n+1 ; i++){
                if(array[i] > array[indexMax]){
                    indexMax = i;
                }  
            }
            int temp = array[n];
            array[n] = array[indexMax];
            array[indexMax] = temp;
            return ordenar(array, n-1);
        }
    }

    public static int calcularMaximo(int array[], int max, int n) throws Exception{
        if(array.length == 0){
            throw new Exception("arreglo vacio");
        }
        if(n == 0){
            return max;
        }else{
            if(max < array[n]){
                max = array [n];
            }
            
            return calcularMaximo(array, max, n-1);
        }
       
    }
    public static void main(String[] args) {
        /*char array[] = {'h','o','l','a'};
        int i = array.length;
        int v[] = {1,3,1};
        int n = v.length-1;

        int c=9;
        recursiva(c);
        System.out.println("suma: "+suma(v, n));
        System.out.println("cantidad vocales");
        System.out.println(cantVocales(array, i));*/

        int array[] = {5,2,13,8,11,9,3,1};
        int n = array.length-1;
        int max = array[n];
        //array = ordenar(array, n);
       /*  for(int h = 0; h <=n; h++){
            System.out.println(array[h] + " ");
        }*/
        try {
            System.out.println(calcularMaximo(array, max, n));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}