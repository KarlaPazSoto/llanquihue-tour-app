# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java que gestiona servicios turísticos en la zona de Llanquihue. El proyecto implementa conceptos de Programación Orientada a Objetos utilizando herencia y polimorfismo para modelar diferentes tipos de servicios turísticos especializados.

El sistema permite crear, almacenar y visualizar diferentes tipos de servicios turísticos tales como excursiones culturales, paseos lacustres y rutas gastronómicas, demostrando el uso de clases base, subclases, constructores, getters, setters y el método `toString()`.

---

## Estructura del proyecto

```text
src
├── model
│   ├── ServicioTuristico.java
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   └── RutaGastronomica.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java

resources
```

---

## Descripción de las clases

### ServicioTuristico

Clase base que representa un servicio turístico genérico. Contiene los atributos `nombre` y `duracionHoras`, junto con constructores, getters, setters y el método `toString()`.

### ExcursionCultural

Subclase que extiende `ServicioTuristico`. Representa una excursión cultural y añade el atributo `lugarHistorico` para identificar el lugar histórico visitado.

### PaseoLacustre

Subclase que extiende `ServicioTuristico`. Representa un paseo en embarcación y añade el atributo `tipoEmbarcacion` para especificar la clase de bote o nave utilizada.

### RutaGastronomica

Subclase que extiende `ServicioTuristico`. Representa una ruta gastronómica y añade el atributo `numeroParadas` para indicar la cantidad de restaurantes o paradas incluidas.

### GestorServicios

Clase responsable de la creación de servicios turísticos. Implementa el método `crearServicios()` que instancia al menos dos objetos de cada subclase y los retorna en una lista para su gestión centralizada.

### Main

Clase principal del programa. Crea una instancia de `GestorServicios`, obtiene la lista de servicios creados y los muestra en consola utilizando el método `toString()`.

---

## Requisitos

- Java JDK 17 o superior.
- IntelliJ IDEA o cualquier IDE compatible con Java.

---

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el SDK de Java esté configurado correctamente (JDK 17+).
3. Ejecutar la clase `Main` desde `src/ui/Main.java`.
4. Revisar la salida en la consola, que mostrará todos los servicios turísticos disponibles.

---

## Funcionalidades implementadas

- Herencia de clases con una clase base `ServicioTuristico`.
- Creación de múltiples subclases especializadas.
- Polimorfismo mediante el método `toString()` sobrescrito.
- Uso de constructores con parámetros en clases base y subclases.
- Encapsulamiento mediante atributos privados.
- Implementación de getters y setters para todos los atributos.
- Gestión centralizada de objetos mediante una clase `GestorServicios`.
- Almacenamiento de objetos en colecciones `ArrayList`.
- Recorrido e iteración de colecciones.

---

## Autor

**Karla Paz Soto**