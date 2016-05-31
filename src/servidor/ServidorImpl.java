/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import sop_corba.ServidorIntPOA;
import sop_corba.datosCanciones;
import sop_corba.datosCancionesHolder;
import sop_corba.datosUsuariosHolder;

/**
 *
 * @author win 7
 */
public class ServidorImpl extends ServidorIntPOA {

    @Override
    public boolean ingresoAlSistema(String login, String clave) {
        
        System.out.println("Ingresar...");        
        try {
            Archivo archivo = new Archivo("admin.txt");
            if (archivo.CantidadLineas() != 0) {
                String[] lineas = archivo.getArray();
                for (String linea : lineas) {
                    String[] aux = linea.split(";");
                    if (aux[0].compareTo(login) == 0 && aux[1].compareTo(clave) == 0) {
                       
                        return true;
                    }
                }
            }
        } catch (IOException ex) {
        }       
        return false;
    }

    @Override
    public boolean registrarCanciones(datosCanciones valores) {
       System.out.println("Registrar Canciones...");
        try {
            Archivo archivo = new Archivo("servidor/Canciones/cancion_" + valores.codigoCancion.toLowerCase() + ".txt");
            if (archivo.CantidadLineas() == 0) {
                archivo.ingresarLinea(valores.codigoCancion + ";" + valores.tituloCancion + ";"
                        + valores.album + ";" + valores.tiempoDuracion+ ";"
                        + valores.nombresCantantes  + ";" + valores.genero + ";"
                        + valores.tamanoArchivo + ";" + valores.tipoExtension + ";"
                        + valores.cantidadCopias + ";" + valores.topeMinimo + ";"
                        + valores.valorCopia + ";" + "1");
                return true;
            }
        } catch (IOException ex) {
        }
        return false;
    }

    @Override
    public void modificarDatosCancion(String codigoCancion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarCancion(String codigoCancion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desactivarCancion(String codigoCancion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarCanciones(datosCancionesHolder valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean consultarUsuario(String login) {
        return true;
        
    }

    @Override
    public void modificarUsuarioA(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarUsuarios(datosUsuariosHolder valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recibirMensaje(String usuario, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
