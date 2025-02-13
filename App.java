
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Metodos mainMetodos  = new Metodos();

        Scanner sc = new Scanner(System.in);

        
        int[] dimensiones = Metodos.preguntarDimensionMatriz();
        int filas = dimensiones[0];
        int columnas = dimensiones[1];
        
        int opt;

        System.out.println("Ingrese el numero del ejercicio que desea ejecutar: ");
        opt = sc.nextInt();

        switch (opt) {
            case 1 -> {
                int[][] matriz = mainMetodos.llenarMatriz(filas, columnas);
                mainMetodos.mostrarMatriz(matriz);
                Puntos punto1 = new Puntos();
                punto1.sumarValores(matriz);
            }
            case 3 -> {
                int[][] matriz = mainMetodos.llenarMatriz(filas, columnas);
                mainMetodos.mostrarMatriz(matriz);
                Puntos punto3 = new Puntos();
                punto3.mostrarVector(punto3.sumFilas(matriz), "Fila ");
                System.out.println();
                punto3.mostrarVector(punto3.sumColum(matriz), "Columna ");
            }
            
            default -> System.out.println("Esta función esta en trabajo....");
        }
        

    }
}
