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

    //Punto_2
    public int numeroMayor(int[][] matriz){
        int numeroMayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= numeroMayor) {
                    numeroMayor = matriz[i][j];
                }
            }
        }
        System.out.println("El número mayor de la Matriz ingresada es: "+numeroMayor);
        return numeroMayor;
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
        int numeroMayor = 0;
        int[] sumColum = new int[matriz[0].length];
        
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumColum[j] += matriz[i][j];
            }
        }
        for (int i = 0; i < sumColum.lenght; i++) {
            if(numeroMayor <= sumColum[i]){
                numeroMayor = sumColum[i];
            }
        }
    
        return sumColum;
    }


    //Punto_4
    public void sumaColumnas(int[][] matriz){
        int numeroMayor = 0;
        int c = 0;
        int suma = 0;
        int sumaC[] = new int[matriz.length];

        for (int i = 0; i <= matriz.length; i++) {
            if (i == matriz.length) {
                i = 0;
                sumaC[c] = suma;
                suma = 0;
                System.out.println(sumaC[c]);
                c = c + 1;
                if (c == matriz.length) {
                    break;
                }
            }
            for (int j = c; j <= c; j++) {
                suma = suma + matriz[i][j];
            }
        }
        for (int i = 0; i < sumaC.length; i++) {
            if (sumaC[i] >= numeroMayor) {
                numeroMayor = sumaC[i];
                c = i;
            }
        }
        System.out.println("La columna que tuvo sumando sus datos un valor más alto fue la número: "+(c+1)+"\nSu suma fue de: "+numeroMayor);
    }

    


    //Punto 5
    public int[] matrizAvector(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[] vector = new int[filas * columnas];
        int cont = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                vector[cont++] = matriz[i][j];
            }
        }
        return vector; 
    }

    public void imprimirVectorDeMatriz(int[] vector){
        System.out.println("-------- VECTOR CREADO APARTIR DE LA MATRIZ --------");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i< vector.length-1) {
                System.out.print(" - ");
            }
        }
    }

}
