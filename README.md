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
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/8554c815-9942-40d4-8e38-0701069a5ace" />


🚀 Atualizar Aluno 
```bash
{
	"nome": "novo nome",
	"cpf": "000000000000",
	"email": "novoemail@gmail.com"
}
```
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/7efcc86f-32c1-48e2-89e2-fe963bed321d" />

🚀 Listar Aluno 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/33f42700-d1f9-44c9-8f90-ae23559154cb" />

🚀 Buscar Aluno 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/e95d0cfe-5278-43b1-9635-c5c22c8a8184" />

🚀 Deletar Aluno 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/1acd40fd-8882-4c68-b5c7-daaca7eb465c" />

✨ Criar Professor 
```bash
{
	"nome": "João da Silva",
	"cpf": "00072554469",
	"email": "joaodasilva@gmail.com"
}
```
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/a99cae53-6019-4d00-8ade-90aca5dfdedc" />

✨ Atualizar Professor
```bash
{
	"nome": "novo nome",
	"cpf": "000000000000",
	"email": "novoemail@gmail.com"
}
```
<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/3d4c98b0-5651-45a5-a9ca-236d82c2cd0b" />

✨ Listar Professor

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/f6299f6f-a8fb-4b77-a324-478ef09c9533" />

✨ Buscar Professor 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/02f1275f-1253-487d-944f-26ca322cd535" />

## 📂 Banco de Dados 

🛠️ Tabela do Aluno 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/1878da03-b716-440e-a92d-405e4ad6689f" />

🛠️ Tabela do Professor 

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/705949e2-e065-4d80-9c23-5dc4bc2629f5" />


## 🔹 ALUNO

Fernando da Silva Neto 
