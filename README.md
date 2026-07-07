<p align="center">
  <img src="G2-Concurrency-Race-Condition-Lab.png" alt="G2-Concurrency-Race-Condition-Lab" width="100%">
</p>

[![Java 25 CI](https://github.com/jerry-felipe/G2-Concurrency-Race-Condition-Lab-Java/actions/workflows/java-ci.yml/badge.svg)](https://github.com/jerry-felipe/G2-Concurrency-Race-Condition-Lab-Java/actions/workflows/java-ci.yml)

# Java 25 Concurrency Race Condition Lab

Laboratorio práctico en **Java 25 LTS** para entender uno de los problemas más críticos en sistemas concurrentes: las **Race Conditions** o condiciones de carrera.

Este proyecto demuestra cómo un sistema puede intentar procesar muchas operaciones al mismo tiempo para mejorar el rendimiento, pero terminar generando resultados incorrectos cuando varios hilos modifican el mismo estado compartido sin coordinación.

## ¿Qué demuestra este proyecto?

El laboratorio presenta un caso simple pero muy realista:

Un sistema procesa muchas órdenes en paralelo.  
Cada orden debe actualizar un resumen compartido con:

- Cantidad de órdenes procesadas
- Monto total acumulado

El problema aparece cuando muchos hilos actualizan esos valores al mismo tiempo sin control.

Aunque el sistema parece funcionar, el resultado final puede ser incorrecto.

## Idea clave

La concurrencia no se trata solamente de lanzar más hilos.

Se trata de ejecutar múltiples operaciones al mismo tiempo sin perder control sobre los datos compartidos.

Una mala implementación puede provocar:

- Datos inconsistentes
- Pérdida de actualizaciones
- Resultados impredecibles
- Errores difíciles de reproducir
- Fallos silenciosos en producción

Una buena implementación permite:

- Mayor rendimiento
- Mejor uso de recursos
- Datos confiables
- Código más seguro
- Sistemas más resistentes en escenarios de alta concurrencia

## Tecnologías utilizadas

- Java 25 LTS
- Maven
- `Thread`
- `AtomicInteger`
- Concurrencia básica en Java
- Estado compartido
- Secciones críticas

## Requisitos

Verificar que tienes Java 25 instalado:

```bash
java --version

---

## Autor

**Work Order IT**  
Soluciones tecnológicas, arquitectura de software y formación técnica para equipos de desarrollo.

Este repositorio forma parte de una iniciativa educativa orientada a explicar cómo la concurrencia en **Python 3.13** puede acelerar un sistema o volverlo impredecible cuando el estado compartido no se controla correctamente.

Website: [www.workorder-it.net](https://www.workorder-it.net)
