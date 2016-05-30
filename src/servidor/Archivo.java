package servidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Archivo {

    private Path f;
    private Path E;

    public Archivo() {
    }

    public void crear_archivo(String nombre) {
        f = Paths.get(nombre + ".txt");
        try {
            if (Files.exists(f)) {
                System.out.println("Archivo ya existe");
            } else {
                Path archivo = Files.createFile(f);
            }
        } catch (Exception e) {
            System.err.println("Error Archivo");
        }
    }
    public void modificar_Archivo(String nombre)
    {
//        Path arc = Paths.get(nombre + ".txt");
//        UsuarioInt ob = null;
//        try {
//            if (!Files.exists(arc)) {
//               System.out.println("El usuario no existe");
//            } else {
//                Files.delete(arc);
//                ingresar_datos(ob);
//            }
//        } catch (Exception e) {
//            System.err.println("Error Archivo");
//        }
    }

//    public void ingresar_datos(UsuarioInt ob) {
//        try (BufferedWriter escribe = Files.newBufferedWriter(f, Charset.defaultCharset())) {
//            escribe.append(ob.get_Apellido() + "," + ob.get_Nombres() + ","
//                    + "," + ob.get_Identificacion() + ob.get_Edad() + "," + "," + ob.get_clave() );//+ "," + ob.get_puntuacion()
//            escribe.newLine();
//            escribe.flush();
//        } catch (IOException exception) {
//            System.out.println("Error escribiendo al archivo");
//        }
//    }

    public void guardar_archivo(String linea, String nombre) {
        f = Paths.get(nombre + ".txt");
        try (BufferedWriter escribe = Files.newBufferedWriter(f, Charset.defaultCharset())) {
            escribe.append(linea);
            escribe.newLine();
            escribe.flush();
        } catch (IOException exception) {
            System.out.println("Error escribiendo al archivo");
        }
    }

    public void guardar_archivo2(String linea, String nombre) {
        f = Paths.get(nombre + ".txt");
        try (BufferedWriter escribe = Files.newBufferedWriter(f, Charset.defaultCharset())) {

            escribe.append(linea);
            escribe.newLine();
            escribe.flush();

        } catch (IOException exception) {
            System.out.println("Error escribiendo al archivo");
        }
    }

    public void copia(String nombre) {
        Path fuente = Paths.get(nombre + ".txt");
        Path destino = Paths.get("huella\\huella.txt");
        try {
            Files.delete(destino);
            Files.copy(fuente, destino);
            System.out.println("Copia realizada");
        } catch (IOException e) {
            System.out.println("Error copiando Archivos");
            e.printStackTrace();
        }
    }

    public String[] CargarArchivo(String nombre) {
        Vector array = new Vector();
        int i = 0;
        f = Paths.get("juego1://"+nombre + ".txt");
        try (BufferedReader lector = Files.newBufferedReader(f, Charset.defaultCharset())) {
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea + ",");
                array.add(linea);
            }
            String[] a = new String[array.size()];
            for (i = 0; i < array.size(); i++) {
                a[i] = array.get(i).toString();
            }
            return a;
        } catch (IOException exception) {
            System.out.println("Error leyendo el archivo");
        }
        return null;
    }

    public String CargarAdmin() {
        f = Paths.get("admin.txt");
        try (BufferedReader lector = Files.newBufferedReader(f, Charset.defaultCharset())) {
            String linea = "";
            linea = lector.readLine();
            System.out.println(linea);
            return linea;
        } catch (IOException exception) {
            System.out.println("Error leyendo el archivo");
        }
        return null;
    }

    public boolean eliminar_archivo(String cadena) {
        File fichero = new File(cadena);
        if (fichero.delete()) {
            return true;
        } else {
            return false;
        }
    }
}
