# 🚀 projeto Back-End

> **Backend de um projeto de treino**, desenvolvido com **orientação de um professor especialista**.  
> Criado com o objetivo de **aprimorar habilidades** em desenvolvimento backend utilizando **Java, Spring Boot** e bancos de dados **H2** (memória) e **PostgreSQL** (persistência real).

---

## 📌 Sobre o projeto

Este repositório contém **apenas o backend** de uma aplicação web.  
O foco foi estudar e aplicar conceitos importantes do desenvolvimento Java moderno com Spring Boot, seguindo boas práticas e arquitetura em camadas.

**Objetivos principais:**
- Compreender e aplicar **Spring Boot** na criação de APIs REST.
- Aprender o uso de **Spring Data JPA / Hibernate** para persistência de dados.
- Configurar e utilizar diferentes bancos (**H2** para testes e **PostgreSQL** para desenvolvimento/produção).
- Entender a estruturação de um projeto backend em **camadas** (Controller, Service, Repository, DTO, Entity).
- Praticar versionamento e organização de código.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA / Hibernate**
- **Banco de dados:**  
  - [H2 Database](https://www.h2database.com/) *(memória, usado para testes e protótipos)*  
  - [PostgreSQL](https://www.postgresql.org/) *(persistência real)*
- **Maven** (gerenciador de dependências)
- **JPA / Hibernate** (mapeamento objeto-relacional)

---


---

## ⚙️ Como executar o projeto

### 🔹 Pré-requisitos
- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- (Opcional para PostgreSQL) [PostgreSQL](https://www.postgresql.org/)

---

### 🔹 Executando com H2 (perfil `test`)

```bash
# Clonar repositório
git clone https://github.com/seu-usuario/projetoBack-End.git

# Entrar na pasta do projeto
cd projetoBack-End

# Executar
mvn clean spring-boot:run
```
Acesse o console do H2 em:
```bash
http://localhost:8080/h2-console
```

# 📌 Observações

Propósito: Aprendizado e prática — não recomendado para uso direto em produção.

Escopo: Somente backend; não contém parte visual (frontend).

Desenvolvimento: Realizado com acompanhamento de professor especialista.


# ✨ Autor

## Gustavo Henrique
📌 Técnico em Análise e Desenvolvimento de Sistemas
