package sop_corba;

/**
* sop_corba/datosCancionesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* viernes 27 de mayo de 2016 14H47' COT
*/

public final class datosCancionesHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.datosCanciones value = null;

  public datosCancionesHolder ()
  {
  }

  public datosCancionesHolder (sop_corba.datosCanciones initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.datosCancionesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.datosCancionesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.datosCancionesHelper.type ();
  }

}