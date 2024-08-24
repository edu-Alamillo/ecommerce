package com.ecommerce.ecommerce.Model;

import java.util.Date;

public class Orden {
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date horaRecibida;
    private double Total;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date horaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.horaRecibida = horaRecibida;
        Total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getHoraRecibida() {
        return horaRecibida;
    }

    public void setHoraRecibida(Date horaRecibida) {
        this.horaRecibida = horaRecibida;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", horaRecibida=" + horaRecibida +
                ", Total=" + Total +
                '}';
    }
}
