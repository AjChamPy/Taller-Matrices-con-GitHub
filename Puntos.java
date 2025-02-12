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
}
