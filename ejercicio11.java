import java.util.Scanner;
public class ejercicio11 {

    public static void main(String[] args) {
        //2.17
        //DEFINIR
        int años;
        int meses, semanas, dias;
        //DATOS DE ENTRADA
        try (var ed = new Scanner(System.in)) {
            System.out.println("ingrese su edad");
            años = ed.nextInt();
        }
        //PROCESO
        meses = años * 12;
        semanas = meses * 4;
        dias = semanas * 7;
        //DATOS DE SALIDA
        System.out.print("la persona ha vivido: ");
        System.out.print("meses:/" + meses);
        System.out.print("semanas:/" + semanas);
        System.out.print("dias:/" + dias);


    }
}