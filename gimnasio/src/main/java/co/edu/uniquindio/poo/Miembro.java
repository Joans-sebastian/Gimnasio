package co.edu.uniquindio.poo;

public class Miembro {
    public String nombre;
    public int edad;
    public String genero;
    public TipoMembresia tipoMembresia;

    /**
     * Metodo constructor de la miembro
     * @param nombre del miembro
     * @param edad
     * @param genero
     * @param membresia
     */

    public Miembro(String nombre, int edad, String genero, TipoMembresia tipoMembresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoMembresia = tipoMembresia;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", tipoMembresia="
                + tipoMembresia + "]";
    }

   
}

   