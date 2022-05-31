package recursividad;

public class EjemploRecursividad {

    public static int factorialR(int n) {
       if (n>1) {
        return factorialR(n-1)*n;
       } 
       return 1;
    }

    public static int fibonacciR(int n) {
        if (n>1) {
          return  fibonacciR(n-1)+fibonacciR(n-2);
        }
        return n;
    }

    public static int suma(int n) {
        int result=0;
        int cont=1;
        while (cont<=n) {
            result=result+cont;
            cont++;
        }
        return result;
    }

    public static int sumaR(int n) { 
        if (n==1) {
            return 1;
        }
        return sumaR(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(factorialR(5));
        System.out.println("fibonacci:");
        System.out.println(fibonacciR(6));
        System.out.println("Suma sucesiva:");
        System.out.println(sumaR(100));
    }
}