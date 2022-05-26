package subprogramas;

public class Persona {
    String nombre="Rubén";
    String dni;
    int edad;
    char genero;

    public void comer(String alimento) {
         System.out.println(nombre + " come " + alimento);
    }

    public void estudiar(String curso) {
        System.out.println(nombre+" estudia el curso de "+curso);
    }


}
