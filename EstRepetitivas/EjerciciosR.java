package EstRepetitivas;

public class EjerciciosR {

    public static void imprimirN1_10While() {
        int numInit=1;
        while (numInit<=10) {
            System.out.println(numInit);
            numInit=numInit+1;
        }  
    }
    public static void imprimirN1_10dowhile() {
        int numInit=1;
        do {
            System.out.println(numInit);
            numInit=numInit+1;
        } while (numInit<=10);
    }

    public static void imprimirN1_10for() {
        for (int numInit = 1; numInit <=10; numInit++) {
            System.out.println(numInit);
        }
    }

    public static void main(String[] args) {
        System.out.println("While");
        imprimirN1_10While();
        System.out.println("Do While");
        imprimirN1_10dowhile();
        System.out.println();
        System.out.println("For:");
        imprimirN1_10for();
    }

}
