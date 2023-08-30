package Ordenamiento;

public class Shell {
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
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array antes de ordenar");
        for(int num : arr){
            System.out.print(num + " ");
        }

        shell(arr, arr.length);

        System.out.println("\nArray despues de ordenar");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
