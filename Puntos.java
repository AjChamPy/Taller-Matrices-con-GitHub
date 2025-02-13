

public class Puntos {
    //Punto_1
    public int sumarValores(int[][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La suma de lo valores de la matriz es de: "+ suma);
        return suma;
    }

    //Punto_3

    public void mostrarVector(int[] vector, String contador){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" "+contador + " " + (i+1) + ": " + vector[i] + " | ");
        }
    }

    public int[] sumFilas(int[][] matriz){
        int[] sumFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumFilas[i] += matriz[i][j]; 
            }
        }
        return sumFilas;
    }

    public int[] sumColum(int[][] matriz){
        int[] sumColum = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumColum[j] += matriz[i][j];
            }
        }
        return sumColum;
    }
}
