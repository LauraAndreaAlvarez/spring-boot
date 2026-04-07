package org.example.ejercicio6.model;

import java.time.LocalDate;

public class Prediccion {
    private LocalDate fecha;
    private int probabilidad;
    private int tMin;
    private int tMax;
    private int uv;

    public Prediccion(LocalDate fecha, int probabilidad, int tMin, int tMax, int uv) {
        this.fecha = fecha;
        this.probabilidad = probabilidad;
        this.tMin = tMin;
        this.tMax = tMax;
        this.uv = uv;
    }

    // Getters necesarios para que Thymeleaf pueda leer los datos
    public LocalDate getFecha() { return fecha; }
    public int getProbabilidad() { return probabilidad; }
    public int getTMin() { return tMin; }
    public int getTMax() { return tMax; }
    public int getUv() { return uv; }
}