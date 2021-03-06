package sop_corba;


/**
* sop_corba/ClienteIntOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* martes 31 de mayo de 2016 15H38' COT
*/

public interface ClienteIntOperations 
{
  boolean registarUsuario (sop_corba.datosUsuarios valores);
  void modificarUsuarioU (String login);
  void consultarCancionesTitulo (String titulo, sop_corba.datosCancionesHolder valores);
  void consultarCancionesCantante (String cantante, sop_corba.datosCancionesHolder valores);
  boolean crearListasReproduccion (String login, String nombrelista, sop_corba.datosCanciones valores);
  void mostrarListasReproduccion (sop_corba.ClienteIntPackage.listaReproducionHolder valores);
  boolean borrarCancionLista (String nombreCancion, String nombreLista);
  void enviarMensaje (String usuario, String mensaje);
} // interface ClienteIntOperations
