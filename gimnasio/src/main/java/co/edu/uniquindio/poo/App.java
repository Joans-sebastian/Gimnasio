package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Bienvenidos a el Gimnasio fitboy!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a el Gimnasio fitboy");
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("fitboy");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Camilo", 20, "Masculino",  TipoMembresia.MENSUAL);
        Miembro miembro2 = new Miembro("joan", 17, "Masculino", TipoMembresia.ANUAL);
        Miembro miembro3 = new Miembro("luisa", 16, "Femenino", TipoMembresia.TRIMESTRAL);

        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("brayan", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // Devolver lista con nombre invertidos
        gimnasio.mostrarMensaje("Lista Nombres Invertidos");
        gimnasio.listaNombresInverso();

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.obtenerMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad:");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }

        System.out.println(gimnasio);

    }
}

