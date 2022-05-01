import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        //2.6
        //Definir variables
        double a,b,c ;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el lado a:");
        a= lt.nextDouble();
        System.out.println("Ingrese el lado b:");
        b= lt.nextDouble();
        //Proceso
        c= Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        //Datos de salida
        System.out.println("La hipotenusa del siguiente triángulo es:"+c);
     
    }
    
}