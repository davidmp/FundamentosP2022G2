import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        //2.7
        //DEFINIR VARIABLES
        double k, c, t;
        try (//DATOS DE ENTRADA
        Scanner lt = new Scanner(System.in)) {
            System.out.println("Ingrese el costo por kilometro c");
            c=lt.nextDouble();
            System.out.println("Ingrese la cantidad de kilometros k");
            k=lt.nextDouble();
        }
        //PROCESO
        t=c*k;
        //DATOS DE SALIDA
        System.out.print("El precio del boleto en es:"+t);
    }
}