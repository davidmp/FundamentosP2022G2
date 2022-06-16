package pe.edu.upeu.arrays;

class ArraysEjemplos{


    public void vectorX() {
        int [] edades=new int[10];
        edades[0]=20;
        edaddes[9]=22;
        System.out.println(edades[9]);

        int edadesX[] ={20,22,18,30,16,40};
        System.out.println(edadesX.lenght);
    }

    public void vectorObjeto() {
        Persona[] p=new Persona[4];
        p[0]=new Persona("200410564","David Mamani",false);
        System.out.println(p[0].nombres);
    }

    public static void main(String[] args) {
        ArraysEjemplos objX=new ArraysEjemplos();
        objX.vectorX();
    }

}