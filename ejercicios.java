import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {
        // 2.15
        // Definir variables
        double p, r = 4, i;
        // datoz de entrada
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese valor de la intencidad:");
        i = lt.nextDouble();
        // proceso
        p = r * Math.pow(i, 2);
        // datos de salida
        System.out.println("La potencia es:" + p);
    }
