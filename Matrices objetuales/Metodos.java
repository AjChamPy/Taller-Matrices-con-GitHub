import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public ObjPersonas[][] LlenarMatriz(int d){

        ObjPersonas[][] m = new ObjPersonas[d][d];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjPersonas obj = new ObjPersonas();

                System.out.println("ingrese el nombre: ");
                obj.setNombre(sc.next());
                System.out.println("ingrese el apellido: ");
                obj.setApellido(sc.next());
                System.out.println("ingrese el direccion: ");
                obj.setDireccion(sc.next());
                System.out.println("ingrese el telefono: ");
                obj.setTelefono(sc.nextInt());
                m[i][j] = obj;
                
            }   
        }
        return m;
    }

    public void MostrarMatrizObjetual(ObjPersonas[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("NOMBRE: "+ m[i][j].getNombre());
                System.out.println("Apellido: "+m[i][j].getApellido());
                System.out.println("Direccion: "+m[i][j].getDireccion());
                System.out.println("Telefono: "+m[i][j].getTelefono());
                System.out.println("\n");
            }
        }
    }

    public ObjPersonas[][] LlenarMatrizCLL(int d){
        ObjPersonas[][] m =  new ObjPersonas[d][d];

        String nombre;
        String apellido;
        String direccion;
        int telefono;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el nombre: ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido: ");
                apellido = sc.next();
                System.out.println("Ingrese la direccion: ");
                direccion = sc.next();
                System.out.println("Ingrese el telefono: ");
                telefono = sc.nextInt();
                ObjPersonas o = new ObjPersonas(nombre,apellido,direccion,telefono);
                m[i][j] = o;
            }
        }
        return m;
    }


}
