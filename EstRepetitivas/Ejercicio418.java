package EstRepetitivas;

import java.util.Scanner;

/**
 * Ejercicio418
 */
public class Ejercicio418 {

    static Scanner leerT=new Scanner(System.in);

    public static void impuestoVehiculos418() {
        String claveV, hayMas="S";
        int cantVC1, cantVC2, cantVC3;
        double precioVC1=0, precioVC2=0, precioVC3=0,
        impVC1=0, impVC2=0, impVC3=0, totalImpV=0;

        while (hayMas.equals("S")) {
            System.out.println("Ingrese la clave del Vehiculo (VC1,VC2,VC3):");
            claveV=leerT.next().toUpperCase();
            if (claveV.equals("VC1")) {
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC1=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC1=leerT.nextDouble();
                impVC1=precioVC1*0.10;
            }else if (claveV.equals("VC2")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC2=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC2=leerT.nextDouble();
                impVC2=precioVC2*0.07;                
            }else if(claveV.equals("VC3")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC3=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC3=leerT.nextDouble();
                impVC3=precioVC3*0.05;   
            }else{ System.out.println("La clave de vehiculo es incorrecto"); }
        }

    }

    public static void main(String[] args) {
        
    }


}