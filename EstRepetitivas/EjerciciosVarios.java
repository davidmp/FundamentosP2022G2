package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosVarios {
    
    static Scanner leerT=new Scanner(System.in);

    public static void factorialXnum() {
        int n; 
        long result=1;
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }

    public static long factorialNum(int n) {        
        long result=1;
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result=result*i; 
            }
        }       
        return result;
    }    



    public static void main(String[] args) {
        factorialXnum();
    }
}
