package com.example.videogames;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideogameController {
    private final VideogameService servicio;

    public VideogameController(VideogameService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Videogame> obtenerTodos() {
        return servicio.buscarTodos();
    }

    @GetMapping("/{id}")
    public Videogame obtenerPorId(@PathVariable Long id) {
        return servicio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Videojuego no encontrado con id " + id));
    }

    @PostMapping
    public Videogame crear(@RequestBody Videogame videojuego) {
        return servicio.guardar(videojuego);
    }

    @PutMapping("/{id}")
    public Videogame actualizar(@PathVariable Long id, @RequestBody Videogame videojuego) {
        return servicio.actualizar(id, videojuego);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}
