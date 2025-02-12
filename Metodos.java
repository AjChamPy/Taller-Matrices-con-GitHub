import java.util.Scanner;

public class Metodos {
//Metodo para preguntar el dimension de la matriz y asignarle un valor a la varibale {filas, columnas}
public static int[] preguntarDimensionMatriz(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor M de las Filas: ");
        int filas = sc.nextInt();
        
        System.out.println("Ingrese el valor N de las Columnas: ");
        int columnas = sc.nextInt();

        return new int[]{filas, columnas};
    }

//Metodo para crear y llenar una matriz creada con los valores de dimenion del metodo preguntarDimensionMatriz()
    public int[][] llenarMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j < columnas; j++) { 
                matriz[i][j] = (int)(Math.random()*2+1);
            }
        }

        return  matriz;
    }

    //Metodo para mostar la matriz creada por el metodo llenarMatriz()
    public void mostrarMatriz(int[][] matriz){
        System.out.println("\n--- MATRIZ INGRESADA ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}
