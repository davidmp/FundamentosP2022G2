package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    LeerArchivo leerA;

    VentaTO vTo;
    VentaDetalleTO vdTo;
    final static String TABLA_CLIENTE="Cliente.txt";
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_VENTA="Venta.txt";
    final static String TABLA_VENTADETALLE="VentaDetalle.txt";

    public void registroVentaGeneral() {
        
    }

    public void carritoVentas(VentaTO to) {
        
    }

    public void validarCliente(String dniruc) {
        
    }

    public void mostrarProductos() {
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        Object[][] dataP=listarContenido(leerA);

        for (int i = 0; i < dataP.length; i++) {
            System.out.print(dataP[i][0]+"="+dataP[i][1]+", ");    
        }
        System.out.println("");
    }


}
