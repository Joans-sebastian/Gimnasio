package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Gimnasio {
    public String nombre;
    public LinkedList<Miembro> miembros;
    public LinkedList<Entrenador> entrenadores;
    

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getNombre())) {
            miembros.add(miembro);
        }
    }

    public boolean verificarMiembro(String nombre) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarEdad(String nombre, int edad) {
        boolean esMenorDeEdad = false;

        if (edad <= 18) {
            System.out.println(nombre + " es menor de edad.");
            esMenorDeEdad = true;
        } else {
            System.out.println(nombre + " es Mayor de edad.");
            esMenorDeEdad = false;
        }

        return esMenorDeEdad;
    }

    public static double calcularPromedioEdad(List<Integer> edades) {
        if (edades == null || edades.isEmpty()) {
            throw new IllegalArgumentException("La lista de edades no puede estar vacía o ser nula.");
        }

        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }

        return (double) suma / edades.size();
    }

    public static boolean determinarVocal(char caracter) {
        if (!Character.isLetter(caracter) || Character.toString(caracter).length() != 1) {
            throw new IllegalArgumentException("El parámetro debe ser un solo carácter.");
        }
        char c = Character.toLowerCase(caracter);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public void eliminarMiembro(String nombre) {
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Metodo que crea una lista de miembros que son menores de 18 años.
     * 
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */
    public LinkedList<Miembro> obtenerMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }

    /**
     * Metodo que muestra los nombres de los miembros de la lista en orden inverso
     */
    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", miembros=" + miembros + ", entrenadores=" + entrenadores + "]";
    }
}
