import java.util.Scanner;

public class principal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Metodos m = new Metodos();


        int d = 0;
        System.out.print("Ingrese la dimension: ");
        d = sc.nextInt();
        ObjPersonas[][] M = new ObjPersonas[d][d];
        M = m.LlenarMatrizCLL(d);
        m.MostrarMatrizObjetual(M);
    }   

}
