/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

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
            Archivo obAr = new Archivo();
            String linea = obAr.CargarAdmin();
            System.out.println("linea :" + linea);
            String[] aux = linea.split(";");
            if (aux[0].compareTo(login) == 0 && aux[1].compareTo(clave) == 0) {
                return true;
            }
        } catch (Exception ex) {
        }
        return false;
    }

    @Override
    public boolean registrarCanciones(datosCanciones valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
