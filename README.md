# 🚀 Projeto Java 2026

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Version-1.0-blue?style=for-the-badge"/>
</p>

---

## 📌 Sobre o Projeto

Esta aplicação foi desenvolvida em Java com o objetivo de praticar e demonstrar conceitos fundamentais de programação, incluindo Spring Boot e organização em camadas. O sistema implementa operações de CRUD (Create, Read, Update, Delete), permitindo o cadastro, consulta, atualização e remoção de dados, simulando o funcionamento de aplicações reais e servindo como base para evolução em projetos mais complexos.

---

## ✨ Funcionalidades

✔ Estrutura organizada em pacotes  
✔ Execução via console  
✔ Separação de responsabilidades  
✔ Código limpo e modular  

---

## 🛠️ Tecnologias Utilizadas

- ⚙️ Java 21
- ⚙️ IntelliJ IDEA  
- ⚙️ Git & GitHub
- ⚙️ Spring Web
- ⚙️ Spring Boot
- ⚙️ Spring Data JPA
- ⚙️ Insomnia
- ⚙️ DBeaver
- ⚙️ PostgreSQL
  

---

## 📂 Estrutura do Projeto

```bash
src/
 ├── model/
 ├── repository/
 ├── service/
 └── controller/
```
## ⚙️ Como Executar

🔹 Clone o projeto

```bash
git clone https://github.com/fernandosllnetto/projetojava2026.git
```
🔹 Configure o banco de dados

```bash
CREAT DATABASE aluno_online
```
🔹 Configure o application.properties

```bash
spring.datasource.url=jdbc:postgresq
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.form
```
🔹 Execute o projeto 

```bash
./mvnw spring-boot:run
```
## 📌 Requisição (JSON)

🚀 Criar Aluno 
```bash
{
	"nome": "João da Silva",
	"cpf": "00072554469",
	"email": "joaodasilva@gmail.com"
}
```
