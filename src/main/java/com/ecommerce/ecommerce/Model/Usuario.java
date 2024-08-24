package com.ecommerce.ecommerce.Model;

public class Usuario {

    private Integer id;
    private String nombre;
    private String username;
    private String telefono;
    private String email;
    private String tipo;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String username, String telefono, String direccion, String password, String email, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.telefono = telefono;
        this.direccion = direccion;
        this.password = password;
        this.email = email;
        this.tipo = tipo;
    }

    private String direccion;
    private String password;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
