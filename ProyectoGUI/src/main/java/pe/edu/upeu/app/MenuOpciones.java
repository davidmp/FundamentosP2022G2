package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO uTo=new UsuarioTO();
    Console cons=System.console();
    
    public void login() {
        System.out.println("************Bienvenidos al Sistema de Ventas*************");
        System.out.println("****************Valide suss credenciales***************");
        uTo.usuario=leerT.leer("", "Ingrese su usuario");
        System.out.println("Ingrese su clave:");
        char[] clavex=cons.readPassword();        
        uTo.clave=String.valueOf(clavex);
        
        if (uTo.usuario.equals("davidmp") && uTo.clave.equals("123456")) {
            menuPrincipal();
        }else{
            System.out.println("Intente Nuevamente!! sus credenciales son invalidos!");
            login();
        }
    } 

    public void menuPrincipal() {
        
    }

}
