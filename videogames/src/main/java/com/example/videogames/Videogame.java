package com.example.videogames;

import jakarta.persistence.*;

@Entity
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String genero;
    private String plataforma;
    private int anoLanzamiento;
    private double precio;

    public Videogame() {}

    public Videogame(String titulo, String genero, String plataforma, int anoLanzamiento, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anoLanzamiento = anoLanzamiento;
        this.precio = precio;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public int getAnoLanzamiento() { return anoLanzamiento; }
    public void setAnoLanzamiento(int anoLanzamiento) { this.anoLanzamiento = anoLanzamiento; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
