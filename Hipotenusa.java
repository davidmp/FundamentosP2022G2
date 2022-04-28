import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        //Definir variables
        double a, b, c;
        //Datos de Entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el lado a:");
        a=lt.nextDouble();
        System.out.println("ingrese el lado b:");
        b=lt.nextDouble(); 
        //Proceso
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        //Datos de Salida
        System.out.println("La hipotinusa: "+c);
    }
}
