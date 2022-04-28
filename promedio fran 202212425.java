import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        //2.6
        //definir variables
        double a,b,c,f;
//datos de entrada
Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el primer nota:");
        a=lt.nextDouble();
        System.out.println("ingrese el segunda nota:");
        b=lt.nextDouble();
        System.out.println("ingrese el tercera nota:");
        c=lt.nextDouble();
        //proceso
        f=(a*0.25)+(b*0.25)+(c*0.5);
        //datos de salida
System.out.println("el promdio es: "+f);

    }
}
