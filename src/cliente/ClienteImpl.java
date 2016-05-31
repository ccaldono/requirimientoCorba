/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import sop_corba.ClienteIntPOA;
import sop_corba.ClienteIntPackage.listaReproducionHolder;
import sop_corba.datosCanciones;
import sop_corba.datosCancionesHolder;
import sop_corba.datosUsuarios;

/**
 *
 * @author maria alejandra
 */
public class ClienteImpl extends ClienteIntPOA {

    GUICliente GUIC;

    public ClienteImpl(GUICliente GUIC) {
        this.GUIC = GUIC;

    }

    @Override
    public boolean registarUsuario(datosUsuarios valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarUsuarioU(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarCancionesTitulo(String titulo, datosCancionesHolder valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarCancionesCantante(String cantante, datosCancionesHolder valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean crearListasReproduccion(String login, String nombrelista, datosCanciones valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarListasReproduccion(listaReproducionHolder valores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarCancionLista(String nombreCancion, String nombreLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarMensaje(String usuario, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
