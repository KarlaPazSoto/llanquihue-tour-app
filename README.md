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

Clase base abstracta que representa un servicio turístico genérico. Contiene los atributos `nombre` y `duracionHoras`, junto con constructores, getters, setters, el método abstracto `mostrarInformacion()` y la implementación de `toString()` para la representación textual del servicio.

### ExcursionCultural

Subclase que extiende `ServicioTuristico`. Representa una excursión cultural y añade el atributo `lugarHistorico` para identificar el lugar histórico visitado.

### PaseoLacustre

Subclase que extiende `ServicioTuristico`. Representa un paseo en embarcación y añade el atributo `tipoEmbarcacion` para especificar la clase de bote o nave utilizada.

### RutaGastronomica

Subclase que extiende `ServicioTuristico`. Representa una ruta gastronómica y añade el atributo `numeroParadas` para indicar la cantidad de restaurantes o paradas incluidas.

### GestorServicios

Clase responsable de la gestión centralizada de servicios turísticos. Instancia dos objetos de cada subclase durante la inicialización y proporciona múltiples métodos para buscar, filtrar, agregar, eliminar y visualizar servicios. Incluye métodos especializados para obtener servicios por categoría: excursiones culturales, paseos lacustres y rutas gastronómicas.

### Main

Clase principal del programa. Inicializa una instancia de `GestorServicios` dentro de un bloque try-catch para el manejo de excepciones. Utiliza el método `mostrarTodosLosServicios()` para desplegar la información detallada de cada servicio y presenta un resumen estadístico por categoría de servicios turísticos.

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

- Herencia de clases con una clase base abstracta `ServicioTuristico`.
- Creación de múltiples subclases especializadas.
- Polimorfismo mediante el método `mostrarInformacion()` sobrescrito en cada subclase.
- Uso de constructores con parámetros en clases base y subclases.
- Encapsulamiento mediante atributos privados.
- Implementación de getters y setters para todos los atributos.
- Gestión centralizada de objetos mediante una clase `GestorServicios`.
- Almacenamiento de objetos en colecciones `ArrayList`.
- Recorrido e iteración de colecciones.
- Búsqueda y filtrado de servicios por tipo y nombre.
- Manejo de excepciones en la clase principal para mayor robustez.
- Visualización formatada y categorizada de servicios turísticos.

---

## Autor

**Karla Paz Soto**