package com.projecFinal.concesionario.projectConcesionario.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_vehiculo;

    private String modelo;

    private String matricula;

    private int anyo;

    private String color;

    private int costo_final;


    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCosto_final() {
        return costo_final;
    }

    public void setCosto_final(int costo_final) {
        this.costo_final = costo_final;
    }
}
