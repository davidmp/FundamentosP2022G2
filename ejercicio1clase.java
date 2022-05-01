import java.util.Scanner;
public class ejercicio1clase {
    public static void main(String[] args) {
        //2.15
        //DEFINIR VARIABLES
        double p, r=4, i;
        try (//DATOS DE ENTRADA
Scanner lt = new Scanner(System.in)) {
    System.out.println("Ingrese el valor de la intensidad ");
    i=lt.nextDouble();
}
//PROCESO
        p=r*Math.pow(i, 2);
        //DATOS DE SALIDA
        System.out.println("La potencia es:"+p);
    }
}