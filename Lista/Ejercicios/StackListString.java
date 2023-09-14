package Lista.Ejercicios;
import java.util.Scanner;
import Lista.Utils.StackList;

/**
 * Ejercicio2
 */
public class StackListString {

    public void StackString() {
        Scanner scanner = new Scanner(System.in);
        StackList<String> stackListString = new StackList<String>();
        String cadena;
        boolean salida = true;

        do{
            System.out.println("Ingrese una palabra: ");
            cadena = scanner.nextLine();
            stackListString.push(cadena);

            try{
                System.out.println("Quiere ingresar otra palabra? ingrese true o false: ");
                salida = Boolean.parseBoolean(scanner.nextLine());

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }while(salida == true);

        System.out.println("\nString al revez: ");
        while(stackListString.isEmpty() == false){
            System.out.print(stackListString.pop()+" ");
        }

        scanner.close();
      }
}
