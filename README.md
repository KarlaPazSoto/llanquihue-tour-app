# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java que permite cargar información de tours turísticos desde un archivo de texto. Los datos son leídos desde un archivo `.txt`, convertidos en objetos y almacenados en una colección `ArrayList`.

El sistema permite mostrar todos los tours registrados y aplicar filtros sobre la información almacenada, utilizando conceptos fundamentales de Programación Orientada a Objetos y manejo de archivos.

---

## Estructura del proyecto

```text
src
├── model
│   └── Tour.java
│
├── data
│   └── CargadorDatos.java
│
└── ui
    └── Main.java

resources
└── tours.txt
```

---

## Descripción de las clases

### Tour

Clase que representa un tour turístico. Contiene los atributos, constructores, métodos getters, setters y el método `toString()`.

### CargadorDatos

Clase encargada de leer el archivo `tours.txt`, procesar cada línea mediante `split(";")`, crear objetos `Tour` y almacenarlos en un `ArrayList`.

### Main

Clase principal del programa. Permite cargar los datos, mostrar todos los tours y visualizar los resultados filtrados.

---

## Requisitos

- Java JDK 17 o superior.
- IntelliJ IDEA o cualquier IDE compatible con Java.

---

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el SDK de Java esté configurado correctamente.
3. Asegurarse de que el archivo `tours.txt` se encuentre dentro de la carpeta `resources`.
4. Ejecutar la clase `Main`.
5. Revisar la salida generada en la consola.

---

## Funcionalidades implementadas

- Lectura de archivos de texto.
- Uso de `split(";")` para separar datos.
- Creación de objetos a partir de datos externos.
- Almacenamiento de objetos en `ArrayList`.
- Recorrido de colecciones.
- Filtrado de información.
- Uso de encapsulamiento mediante atributos privados.
- Implementación de getters y setters.
- Sobrescritura del método `toString()`.

---

## Autor

**Karla Paz Alejandra Soto Albornoz**