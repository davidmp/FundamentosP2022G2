package ECondicional;

import java.util.Scanner;

/**
 * Ejercicio37
 */
public class Ejercicio37 {

    static Scanner lt=new Scanner(System.in);


    public static void preguntaunoDMP() {
        //Declarar variables
        int edad;
        double promedio;
        String resBeca;
        //Datos de Entrada
        System.out.println("Ingrese la edad:");
        edad=lt.nextInt();
        System.out.println("Ingrese el Promedio:");
        promedio=lt.nextDouble();
        //proceso
        if (edad>18) {
            if (promedio>=18) {
                resBeca="Le corresponde el monto de S/ 2000";
            }else if(promedio>=15){
                resBeca="Le corresponde el monto de  S/ 1000";
            }else if(promedio<15 && promedio>=12){
                resBeca="Le corresponde el monto de  S/ 500";
            }else {
                resBeca="Enviar una carta para que estudie";
            }
        } else {
            if(promedio>=18){
                resBeca="Le corresponde el monto de S/ 3000";
            }else if(promedio<18 && promedio>=16){
                resBeca="Le corresponde el monto de S/ 2000";
            }else if(promedio<16 && promedio>=12){
                resBeca="Le corresponde el monto de S/ 100";
            }else{
                resBeca="Enviar una carta para que estudie";
            }
        }
        //Datos de Salida
        System.out.println(resBeca);        
    }

    public static void main(String[] args) {
        System.out.println("Ingrese la pregunta");
        int pregunata = lt.nextInt();
        switch (pregunata) {
          case 1:
            preguntaunoDMP();
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;            
        }        
    }
    
}