package sop_corba;


/**
* sop_corba/datosCancionesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* martes 31 de mayo de 2016 15H38' COT
*/

abstract public class datosCancionesHelper
{
  private static String  _id = "IDL:sop_corba/datosCanciones:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.datosCanciones that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.datosCanciones extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [11];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "tituloCancion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "album",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "nombresCantantes",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "genero",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "tiempoDuracion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "tamanoArchivo",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "tipoExtension",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "codigoCancion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[8] = new org.omg.CORBA.StructMember (
            "cantidadCopias",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[9] = new org.omg.CORBA.StructMember (
            "topeMinimo",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[10] = new org.omg.CORBA.StructMember (
            "valorCopia",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba.datosCancionesHelper.id (), "datosCanciones", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sop_corba.datosCanciones read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.datosCanciones value = new sop_corba.datosCanciones ();
    value.tituloCancion = istream.read_string ();
    value.album = istream.read_string ();
    value.nombresCantantes = istream.read_string ();
    value.genero = istream.read_string ();
    value.tiempoDuracion = istream.read_string ();
    value.tamanoArchivo = istream.read_string ();
    value.tipoExtension = istream.read_string ();
    value.codigoCancion = istream.read_string ();
    value.cantidadCopias = istream.read_string ();
    value.topeMinimo = istream.read_string ();
    value.valorCopia = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.datosCanciones value)
  {
    ostream.write_string (value.tituloCancion);
    ostream.write_string (value.album);
    ostream.write_string (value.nombresCantantes);
    ostream.write_string (value.genero);
    ostream.write_string (value.tiempoDuracion);
    ostream.write_string (value.tamanoArchivo);
    ostream.write_string (value.tipoExtension);
    ostream.write_string (value.codigoCancion);
    ostream.write_string (value.cantidadCopias);
    ostream.write_string (value.topeMinimo);
    ostream.write_string (value.valorCopia);
  }

}
