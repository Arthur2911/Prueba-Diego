package com.example.demo2.entidades;

public class Juego {

    private String nombrejuego;
    private String aniosalida;
    private String edad;

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public String getAniosalida() {
        return aniosalida;
    }

    public void setAniosalida(String aniosalida) {
        this.aniosalida = aniosalida;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Juego(String nombrejuego, String aniosalida, String edad) {
        this.nombrejuego = nombrejuego;
        this.aniosalida = aniosalida;
        this.edad = edad;
    }

    public Juego() {
    }
}
