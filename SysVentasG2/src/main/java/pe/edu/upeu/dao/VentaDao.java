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
        util.clearConsole();
        System.out.println("*****************Registro de Ventas***************");
        vTo=new VentaTO();
        leerA=new LeerArchivo(TABLA_VENTA);
        String idVX=generarId(leerA, 0, "V", 1);
        vTo.setIdVenta(idVX);
        vTo.setDniruc(validarCliente(leerT.leer("", "Ingrese DNI/RUC cliente")));
        if (crearVenta(vTo)!=null) {
            System.out.println("Agregar Productos a carrito de venta");
        }
    }

    public VentaTO crearVenta(VentaTO to) {
        leerA=new LeerArchivo(TABLA_VENTA);
        agregarContenido(leerA, to);
        leerA=new LeerArchivo(TABLA_VENTA);
        Object[][] data=buscarContenido(leerA, 0, to.getIdVenta());
        if (data.length==1) {
            return to;
        }
        return null;
    }

    public void carritoVentas(VentaTO to) {
        
    }

    public String validarCliente(String dniruc) {
        leerA=new LeerArchivo(TABLA_CLIENTE);
        Object[][] dataC=buscarContenido(leerA, 0, dniruc);
        if (dataC==null || dataC.length==0) {
            new ClienteDao().crearCliente();
        }
        return dniruc;
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
