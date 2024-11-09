# Conversor de Moneda

Este proyecto es un conversor de monedas que permite convertir cantidades entre diferentes divisas utilizando una API externa de tipo de cambio.

## Descripción

El conversor de moneda es una aplicación de consola en Java que permite al usuario convertir una cantidad específica de una moneda a otra. Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/docs) para obtener los tipos de cambio actuales.

## Requisitos

Para ejecutar este proyecto, necesitarás tener instalado:
- Java JDK 11 o superior
- Una clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/)
- *Tener importada la bibloteca Gson*

## Instalación

1. Clona el repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu-usuario/conversor-de-moneda.git
    cd conversor-de-moneda
    ```

2. Abre el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse, etc.).

3. Reemplaza `YOUR-API-KEY` en la clase `api` con tu clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/).

## Uso

Para ejecutar la aplicación, simplemente compila y ejecuta la clase `principal`.

### Menú de Opciones

Al ejecutar la aplicación, verás un menú con las siguientes opciones:

1. Convertir desde USD (Dólar estadounidense) a ARS (Peso argentino)
2. Convertir desde ARS (Peso argentino) a USD (Dólar estadounidense)
3. Convertir desde COP (Peso colombiano) a ARS (Peso argentino)
4. Convertir desde USD (Dólar estadounidense) a COP (Peso colombiano)
5. Convertir desde BRL (Real brasileño) a USD (Dólar estadounidense)
6. Convertir desde USD (Dólar estadounidense) a BRL (Real brasileño)
7. Salir

Selecciona una opción y sigue las instrucciones para ingresar la cantidad a convertir. La aplicación mostrará el resultado de la conversión utilizando el tipo de cambio actual.

## Estructura del Proyecto

- `principal.java`: Contiene la lógica principal de la aplicación y el menú interactivo.
- `api.java`: Maneja las solicitudes a la API de ExchangeRate y procesa las respuestas.
- `conversionDeMoneda.java`: Define el `record` para almacenar los datos de la conversión de la API.

