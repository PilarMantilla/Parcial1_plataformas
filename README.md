# Parcial1\_plataformas

Proyecto MVC Estudiantes - Spring Boot


API REST para gestión de estudiantes desarrollada con Spring Boot, siguiendo el patrón de arquitectura MVC por capas.


Instrucciones de ejecución:



Prerrequisitos: Java 17 o superior y Gradle



Pasos para ejecutar el proyecto:

1\. Clonar el repositorio

* git clone https://github.com/PilarMantilla/Parcial1\_plataformas.git
* cd Parcial1\_plataformas/mvc-estudiantes

2\. Dar permisos al Gradle Wrapper

* chmod +x ./gradlew

3\. Compilar el proyecto

* ./gradlew clean build

4\. Ejecutar la aplicación

* ./gradlew bootRun

La aplicación quedará disponible en: http://localhost:6002

Estrategia de control de versiones: 

Trunk-Based Development: Se eligió Trunk-Based Development porque el proyecto es pequeño y necesita integración rápida y constante. Se trabaja en ramas cortas (feature/...) y se integra a main mediante Pull Requests, evitando cambios largos y difíciles de mezclar.

Explicación breve de las herramientas usadas en el Pipeline:
Las herramientas usadas son GitHub Actions, que es la plataforma de automatización integrada en GitHub que permite ejecutar workflows ante eventos del repositorio; Gradle Wrapper, que es la herramienta de build para proyectos Java que garantiza la misma versión de Gradle en cualquier entorno; y softprops/action-gh-release, que es una acción de la comunidad que simplifica la creación de GitHub Releases desde un workflow.

