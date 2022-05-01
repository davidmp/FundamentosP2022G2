import java.util.Scanner;

public class ejercicio2 {

   public static void main(String[] args) {
       //2.1
       //DEFINIR VARIABLES
       double area, base, altura;
       try (//DATOS DE ENTRADA
       var lt = new Scanner(System.in)) {
           System.out.println("ingrese la altura del triangulo: ");
           altura = lt.nextDouble();
           System.out.println("ingrese la base del triangulo: ");
           base = lt.nextDouble();
       }
      //PROCESO
      area = (altura * base)/ 2;
      //DATOS DE SALIDA
      System.out.println("el area es; \n" + area);

    }
}

