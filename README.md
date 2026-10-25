# AC02-Repaso

Ejercicio de repaso de **Kotlin** que muestra el uso de funciones con parámetros
opcionales y argumentos nombrados.

## Funcionamiento

El programa define la función:

```kotlin
fun calcularRiego(
    litros: Int,
    minutos: Int = 10,
    zona: String = "A"
): String
```

`minutos` y `zona` tienen valores predeterminados, por lo que pueden omitirse
al invocar la función. El programa incluye ejemplos de:

- Uso de valores predeterminados:
  `calcularRiego(50)`
- Uso de argumentos nombrados:
  `calcularRiego(50, zona = "B")`
- Uso de argumentos posicionales:
  `calcularRiego(50, 15, "B")`

La salida esperada es:

```text
Zona A: 50 litros durante 10 minutos
Zona B: 50 litros durante 10 minutos
Zona B: 50 litros durante 15 minutos
```