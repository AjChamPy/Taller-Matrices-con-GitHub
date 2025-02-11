public class App {
    public static void main(String[] args) throws Exception {
        Metodos mainMetodos  = new Metodos();

        int[] dimensiones = Metodos.preguntarDimensionMatriz();
        int filas = dimensiones[0];
        int columnas = dimensiones[1];

        int[][] matriz = mainMetodos.llenarMatriz(filas, columnas);
        mainMetodos.mostrarMatriz(matriz);
        

    }
}
