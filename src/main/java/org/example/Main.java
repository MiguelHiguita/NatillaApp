package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entradas del problema
        String nombreUsuario="Miguel Angel Gonzalez Higuita";
        short edadUsuario=17;
        String telefonoUsuario="3006770560";
        String documentoIdentidad="1033488494";
        int cuotaEnero;
        int cuotaFebrero;
        int cuotaMarzo;
        int cuotaAbril;
        int cuotaMayo;
        int cuotaJunio;
        int cuotaJulio;
        int cuotaAgosto;
        int cuotaSeptiembre;
        int cuotaOctubre;
        int cuotaNoviembre;
        String direccionUsuario="Cll 50# 80-20";
        double costoInscripcion=150000.0;
        float tasaInteresNatillera=0.1F;
        double saldoFinalUsuario;

        //PROCESO

        //1. Asignar un valor especifico a una variable
        //desde el TECLADO (recibir datos)
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        nombreUsuario=leerDato.nextLine();

        System.out.println("Cual es tu documento de identidad?");
        documentoIdentidad=leerDato.nextLine();

        System.out.println("Cual es tu numero de telefono?");
        telefonoUsuario=leerDato.nextLine();

        System.out.println("Cuantos años tienes?");
        edadUsuario=leerDato.nextShort();

        System.out.println("Bienvenido "+nombreUsuario);

        System.out.println("Tu documento de identidad es: "+documentoIdentidad);

        System.out.println("tu numero de telefono es: "+telefonoUsuario);

        System

        System.out.println("Gracias por compartir tus datos conmigo ;)");


    }
}