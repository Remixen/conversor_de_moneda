# Conversor de Monedas

Este proyecto es una aplicación de consola que permite convertir entre diferentes monedas utilizando una API externa para obtener las tasas de conversión.

## Tabla de Contenidos
- [Descripción](#descripción)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Cómo Ejecutar el Proyecto](#cómo-ejecutar-el-proyecto)
- [Casos de Uso](#casos-de-uso)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

---

## Descripción

El proyecto es un conversor de monedas que interactúa con una API para obtener las tasas de conversión en tiempo real. El programa permite al usuario convertir entre varias monedas comunes como USD, ARS, BRL, y COP.

Este es un proyecto sencillo desarrollado en **Java** que utiliza el patrón de programación orientado a objetos (POO), incluye manejo de excepciones, y hace uso de la librería **Gson** para manejar el JSON proveniente de la API.

---

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la lógica del programa.
- **HttpClient**: Biblioteca de Java utilizada para realizar solicitudes HTTP.
- **Gson**: Biblioteca utilizada para convertir JSON a objetos en Java.
- **Scanner**: Biblioteca para leer entradas del usuario desde la consola.
- **API REST**: La API externa se utiliza para obtener las tasas de conversión en tiempo real.

---

## Cómo Ejecutar el Proyecto

1. **Requisitos**:
   - Tener instalado **Java** en tu máquina.
   - Configurar un entorno de desarrollo (IDE como IntelliJ IDEA, Eclipse, o usar una terminal de comandos).

2. **Paso a Paso**:
   1. Clona este repositorio en tu máquina local usando:
      ```bash
      git clone https://github.com/tu-usuario/tu-repositorio.git
      ```
   2. Navega hasta el directorio del proyecto:
      ```bash
      cd tu-repositorio
      ```
   3. Compila el proyecto:
      ```bash
      javac Principal.java ConsultarMoneda.java ConvertirMoneda.java
      ```
   4. Ejecuta el programa:
      ```bash
      java Principal
      ```
   5. El programa te mostrará un menú donde podrás elegir las opciones de conversión.

---

## Casos de Uso

1. **Conversión de USD a ARS**: 
   Permite convertir dólares estadounidenses a pesos argentinos utilizando la tasa de cambio proporcionada por la API.

2. **Conversión de ARS a USD**:
   Permite convertir pesos argentinos a dólares estadounidenses utilizando la tasa de cambio proporcionada por la API.

3. **Conversión de USD a BRL**:
   Permite convertir dólares estadounidenses a reales brasileños utilizando la tasa de cambio proporcionada por la API.

4. **Conversión de BRL a USD**:
   Permite convertir reales brasileños a dólares estadounidenses utilizando la tasa de cambio proporcionada por la API.

5. **Conversión de USD a COP**:
   Permite convertir dólares estadounidenses a pesos colombianos utilizando la tasa de cambio proporcionada por la API.

6. **Conversión de COP a USD**:
   Permite convertir pesos colombianos a dólares estadounidenses utilizando la tasa de cambio proporcionada por la API.

7. **Conversión personalizada**:
   Opción para que el usuario ingrese las monedas base y objetivo manualmente.


