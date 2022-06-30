package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT = new LeerTeclado();
    UsuarioTO uTo = new UsuarioTO();
    Console cons = System.console();

    public void login() {
        System.out.println("************Bienvenidos al Sistema de Ventas*************");
        System.out.println("****************Valide sus credenciales***************");
        uTo.usuario = leerT.leer("", "Ingrese su usuario");
        System.out.println("Ingrese su clave:");
        char[] clavex = cons.readPassword();
        uTo.clave = String.valueOf(clavex);
        if (new UsuarioDao().login(uTo.getUsuario(), uTo.getClave())) {
            menuPrincipal();
        } else {
            System.out.println("Intente Nuevamente!! sus credenciales son invalidos!");
            login();
        }
    }
    
    public void menuPrincipal() {
        System.out.println("------------------------------------Sistema de Ventas------------------------------");
        int opciones = 2;
        String menu = "";
        menu += "1=Registro de Usuario\n";
        menu += "2=Listar Usuarios\n";
        System.out.println(menu);
        do {
            switch (opciones) {
                case 1: new UsuarioDao().crearUsuarios();   break;
                case 2: new UsuarioDao().listarUsuarios();   break;

                default: System.out.println("Opcion Invalida!"); break;
            }
            String continuar=leerT.leer("",
             "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
            if (continuar.charAt(0)=='S') {
                opciones=leerT.leer(0, "Eliga una operacion:\n"+menu);
            }else{opciones=0;}
        } while (opciones != 0);
    }

}
