package com.ecommerce.ecommerce.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date horaRecibida;
    private double Total;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalles;

    @ManyToOne
    private Usuario usuario;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date horaRecibida, double total, Usuario usuario) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.horaRecibida = horaRecibida;
        Total = total;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DetalleOrden getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleOrden detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", horaRecibida=" + horaRecibida +
                ", Total=" + Total +
                ", usuario=" + usuario +
                '}';
    }
}
