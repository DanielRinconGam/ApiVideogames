package com.example.videogames;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VideogameService {
    private final VideogameRepository repositorio;

    public VideogameService(VideogameRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Videogame> buscarTodos() {
        return repositorio.findAll();
    }

    public Optional<Videogame> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Videogame guardar(Videogame videojuego) {
        return repositorio.save(videojuego);
    }

    public Videogame actualizar(Long id, Videogame nuevoVideojuego) {
        return repositorio.findById(id).map(v -> {
            v.setTitulo(nuevoVideojuego.getTitulo());
            v.setGenero(nuevoVideojuego.getGenero());
            v.setPlataforma(nuevoVideojuego.getPlataforma());
            v.setAnoLanzamiento(nuevoVideojuego.getAnoLanzamiento());
            v.setPrecio(nuevoVideojuego.getPrecio());
            return repositorio.save(v);
        }).orElseThrow(() -> new RuntimeException("Videojuego no encontrado con id " + id));
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}