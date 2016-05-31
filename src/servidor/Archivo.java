package servidor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

    private File f;

    public Archivo() {
    }

    public boolean existe(String a) {
        f = new File(a);
        return f.exists();
    }

    public Archivo(String archivo) {
        f = new File(archivo);
        if (!f.exists()) {
            try (FileWriter fw = new FileWriter(f, true)) {
                fw.write("");
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public void ingresarLinea(String line) throws IOException {
        try (FileWriter fw = new FileWriter(f, true)) {
            fw.write(line + "\r\n");
            fw.close();
        }
    }

    public int CantidadLineas() throws IOException {
        int x = 0;
        FileReader fr = new FileReader(f);
        try (BufferedReader br = new BufferedReader(fr)) {
            String p = null;
            while ((p = br.readLine()) != null) {
                x++;
            }
        }
        return x;
    }

    // devuelve todas las lineas del archivo en un vector de string
    public String[] getArray() throws IOException {
        int i = 0;
        String[] x = new String[CantidadLineas()];
        String p;
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        while ((p = br.readLine()) != null) {
            x[i] = p;
            i++;
        }
        return x;
    }

    public void borrarLineas() throws IOException {
        try (FileWriter fw = new FileWriter(f, false)) {
            fw.write("");
            fw.close();
        }
    }

    public boolean borrar() {
        return f.delete();
    }

}
