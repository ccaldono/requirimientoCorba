package sop_corba.ClienteIntPackage;


/**
* sop_corba/ClienteIntPackage/listaReproducionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* martes 31 de mayo de 2016 15H38' COT
*/

abstract public class listaReproducionHelper
{
  private static String  _id = "IDL:sop_corba/ClienteInt/listaReproducion:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.ClienteIntPackage.listaReproducion that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.ClienteIntPackage.listaReproducion extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "nombre",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (sop_corba.ClienteInt.SIZE, _tcOf_members0 );
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (sop_corba.ClienteIntPackage.arrayCancionesHelper.id (), "arrayCanciones", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "res",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba.ClienteIntPackage.listaReproducionHelper.id (), "listaReproducion", _members0);
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

  public static sop_corba.ClienteIntPackage.listaReproducion read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.ClienteIntPackage.listaReproducion value = new sop_corba.ClienteIntPackage.listaReproducion ();
    value.nombre = istream.read_string ();
    value.res = sop_corba.ClienteIntPackage.arrayCancionesHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.ClienteIntPackage.listaReproducion value)
  {
    ostream.write_string (value.nombre);
    sop_corba.ClienteIntPackage.arrayCancionesHelper.write (ostream, value.res);
  }

}
