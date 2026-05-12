# 📚 RegistroAcademia

Sistema de gestión académica desarrollado con Spring Boot aplicando arquitectura en capas y buenas prácticas de desarrollo backend.

---

# 🚀 Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Lombok
* MapStruct
* Maven

---

# 🏗️ Arquitectura del proyecto

El proyecto está organizado usando arquitectura por capas:

```text
src/main/java/com/academia/RegistroAcademia
│
├── Controller
├── DTO
├── Mapper
├── Model
├── Repository
├── Service
```

---

# 📂 Estructura del sistema

## 📌 Modelos principales

* Area
* Aula
* Ciclo
* Curso
* Docente
* Estudiante
* Grupo
* Matricula

---

# 🔄 Relaciones implementadas

* Un Curso pertenece a un Área
* Un Grupo pertenece a:

  * Curso
  * Aula
  * Ciclo
  * Docente
* Una Matrícula pertenece a:

  * Estudiante
  * Área
  * Grupo

---

# ⚙️ Funcionalidades

✅ Registro de estudiantes
✅ Registro de cursos
✅ Registro de áreas
✅ Registro de grupos
✅ Registro de matrículas
✅ Relaciones entre entidades
✅ Uso de DTOs
✅ Uso de MapStruct para mapeo
✅ API REST con Spring Boot

---

# 🧠 Conceptos aplicados

* Programación Orientada a Objetos (POO)
* Arquitectura backend
* Relaciones JPA
* DTO Pattern
* Mapper Pattern
* Inyección de dependencias
* API REST
* Persistencia de datos

---

# 🛠️ Configuración del proyecto

## 1️⃣ Clonar repositorio

```bash
git clone https://github.com/JoahanCarlo/RegistroAcademia.git
```

---

## 2️⃣ Configurar MySQL

Crear una base de datos:

```sql
CREATE DATABASE registro_academia;
```

---

## 3️⃣ Configurar application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/registro_academia
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Ejecutar proyecto

Desde NetBeans o IntelliJ ejecutar:

```text
Run Project
```

O usando Maven:

```bash
mvn spring-boot:run
```

---

# 📮 Endpoints principales

## 👨‍🎓 Estudiantes

```http
GET /estudiante
POST /estudiante
```

## 📘 Cursos

```http
GET /curso
POST /curso
```

## 📝 Matrículas

```http
GET /matricula
POST /matricula
```

---

# 📖 Ejemplo JSON Matrícula

```json
{
  "estudianteId": 1,
  "areaId": 1,
  "grupoId": 1,
  "fechaMatricula": "2026-05-11"
}
```

---

# 🎯 Objetivo del proyecto

Este proyecto fue desarrollado con fines de aprendizaje para fortalecer conocimientos en:

* Java Backend
* Spring Boot
* Arquitectura de aplicaciones
* JPA/Hibernate
* Desarrollo de APIs REST

---

# 👨‍💻 Autor

## Joahan Carlo Nuñez Soto

GitHub:
[https://github.com/JoahanCarlo](https://github.com/JoahanCarlo)
