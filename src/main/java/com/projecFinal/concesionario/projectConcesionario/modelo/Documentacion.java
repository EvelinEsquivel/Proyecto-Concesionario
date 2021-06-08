package com.projecFinal.concesionario.projectConcesionario.modelo;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Documentacion {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_documentacion;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    private Cliente cliente;


    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_vendedor",referencedColumnName = "id_vendedor")
    private Vendedor vendedor;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_supervisor",referencedColumnName = "id_supervisor")
    private Supervisor supervisor;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_vehiculo",referencedColumnName = "id_vehiculo")
    private Vehiculo vehiculo;


    private Date Fecha_venta;

    public int getId_documentacion() {
        return id_documentacion;
    }

    public void setId_documentacion(int id_documentacion) {
        this.id_documentacion = id_documentacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFecha_venta() {
        return Fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        Fecha_venta = fecha_venta;
    }
}
