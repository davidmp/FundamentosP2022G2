package pe.edu.upeu.arrays;

import java.util.Scanner;

public class TransformadasMatriz {
    Scanner cs=new Scanner(System.in);

    public void transformada01() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+f);
                }else{matriz[f][c]="";}             
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada12() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[0].length-1; c>=(0+f) ; c--) {
                matriz[f][c]=String.valueOf(valorInit);
                valorInit++;//1
            }
        } 
        imprimirMatrices(matriz);
    }


    public void transformada11() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[0].length-1-fila; columna>= 0; columna--) {
                matriz[fila][columna]=""+valorInit;
                valorInit++;
            }
        }
        imprimirMatrices(matriz);
    }
    
    public void transformada28() {
       System.out.println("Ingrese la Dimension de la Matriz:"); 
       int dimension=cs.nextInt();
       System.out.println("");
       String[][] matriz=new String[dimension][dimension];
       int valor=0;
        for (int fila = matriz.length-1; fila >= 0; fila--) {
            if(fila%2==0){
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                }
            }else{
                for (int columna = matriz[0].length-1; columna >= 0; columna--) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                }
            }
        }
        imprimirMatrices(matriz);
    }
    
    public void transformada29() {
        System.out.println("Ingrese la Dimension de la Matriz:"); 
        int dimension=cs.nextInt();
        System.out.println("");
        String[][] matriz=new String[dimension][dimension];//5
        int valor=0;              
        for (int v = 0; v < dimension/2; v++) {//2.5
            for (int ls = v; ls < (matriz[0].length-1)-v; ls++) {
                matriz[v][ls]=""+valor;
                valor++;
            }
            for (int ld = v; ld < (matriz.length-1)-v; ld++) {
                matriz[ld][(matriz.length-1)-v]=""+valor;
                valor++;
            }
            for (int lin = (matriz.length-1)-v; lin > v; lin--) {
                matriz[(matriz.length-1)-v][lin]=""+valor;
                valor++;
            }
            for (int liz = (matriz.length-1)-v; liz  > v; liz--) {
                matriz[liz][v]=""+valor;
                valor++;                
            }
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=""+valor;
            }
        imprimirMatrices(matriz);
    }
    
    public void imprimirMatrices(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c]==null) {
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");   
                }                            
            }
            System.out.println("");
        }
    }




    public static void main(String[] args) {
       // new TransformadasMatriz().transformada01();
       new TransformadasMatriz().transformada11();
    }
}
