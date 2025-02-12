
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Metodos mainMetodos  = new Metodos();

        Scanner sc = new Scanner(System.in);

        int[] dimensiones = Metodos.preguntarDimensionMatriz();
        int filas = dimensiones[0];
        int columnas = dimensiones[1];

        int[][] matriz = mainMetodos.llenarMatriz(filas, columnas);
        mainMetodos.mostrarMatriz(matriz);
        System.out.println("Ingrese el ejercicio el cual quiera visualizar (del 1 al 11): ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1 -> {
                Puntos punto1 = new Puntos();
                punto1.sumarValores(matriz);
            }
            default -> throw new AssertionError();
        }
        

    }
}
