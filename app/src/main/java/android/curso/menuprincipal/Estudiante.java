package android.curso.menuprincipal;

import com.google.gson.annotations.Expose;

/**
 * Created by andresvasquez on 23/2/17.
 */

public class Estudiante {
    @Expose
    private String nombre;

    @Expose
    private int edad;

    @Expose
    private int codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
