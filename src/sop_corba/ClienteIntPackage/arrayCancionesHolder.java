package sop_corba.ClienteIntPackage;


/**
* sop_corba/ClienteIntPackage/arrayCancionesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* martes 31 de mayo de 2016 15H38' COT
*/

public final class arrayCancionesHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public arrayCancionesHolder ()
  {
  }

  public arrayCancionesHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.ClienteIntPackage.arrayCancionesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.ClienteIntPackage.arrayCancionesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.ClienteIntPackage.arrayCancionesHelper.type ();
  }

}
