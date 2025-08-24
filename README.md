# API de Videojuegos

## Requisitos previos

1. Iniciar XAMPP y asegurarse de que los servicios de Apache y MySQL estén corriendo.  
2. Crear una base de datos llamada:  

```sql
CREATE DATABASE test-videogames;
```

## Endpoints disponibles

### 1. Crear un videojuego

**Request:**
```http
POST http://localhost:8080/api/videojuegos
Content-Type: application/json
```
Insertamos uno por uno los tres Body siguientes

**Body:**
```json
{
  "titulo": "PES 2021",
  "genero": "Deportes",
  "plataforma": "PlayStation 4",
  "anioLanzamiento": 2020,
  "precio": 150000
}
```

```json
{
  "titulo": "Halo Infinite",
  "genero": "Shooter",
  "plataforma": "Xbox Series X",
  "anioLanzamiento": 2021,
  "precio": 280000
}
```

```json
{
  "titulo": "Crash Bandicoot N. Sane Trilogy",
  "genero": "Plataformas",
  "plataforma": "Nintendo Switch",
  "anioLanzamiento": 2017,
  "precio": 150000
}
```

### 2. Consultar todos los videojuegos

**Request:**
```http
GET http://localhost:8080/api/videojuegos
```

### 3. Consultar un videojuego por ID

**Request:**
```http
GET http://localhost:8080/api/videojuegos/2
```

### 4. Eliminar un videojuego

**Request:**
```http
DELETE http://localhost:8080/api/videojuegos/1
```

### 5. Verificamos eliminación de videojuego

**Request:**
```http
GET http://localhost:8080/api/videojuegos
```

### 6. Actualizar un videojuego (PUT)

**Request:**
```http
PUT http://localhost:8080/api/videojuegos/3
Content-Type: application/json
```

**Body:**
```json
{
  "titulo": "Crash Bandicoot N. Sane Trilogy (Remaster)",
  "genero": "Plataformas",
  "plataforma": "Nintendo Switch",
  "anioLanzamiento": 2018,
  "precio": 160000
}
```

### 5. Verificamos actualización de videojuego

**Request:**
```http
GET http://localhost:8080/api/videojuegos
```
