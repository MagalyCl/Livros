# Desafio Literatura

Este projeto consiste na construção de um catálogo de livros utilizando **Java com Spring Boot**, persistência em **PostgreSQL** e consumo da **API pública Gutendex**, que disponibiliza dados sobre mais de 70 mil livros do Project Gutenberg.

O sistema é executado via terminal e foi criado com o objetivo de praticar conceitos como:

- Consumo de API REST com Java
- Manipulação de JSON com a biblioteca Jackson
- Persistência com Spring Data JPA
- Relacionamento entre entidades (Livro e Autor)
- Utilização de Derived Queries para consultas específicas
- Interação com o usuário através da linha de comando

---

## 📚 Funcionalidades Implementadas

### 1. **Buscar livro por título**
- Consulta a API Gutendex com base no título informado.
- Armazena o resultado retornado (título, autor, idioma, número de downloads).
- Os dados do autor (nome, ano de nascimento e falecimento) também são salvos.

### 2. **Listar livros cadastrados**
- Mostra todos os livros que já foram buscados e armazenados no banco.

### 3. **Filtrar autores cadastrados**
- Exibe os dados dos autores vinculados aos livros armazenados.

### 5. **Listar autores vivos em determinado ano**
- Consulta os autores cuja data de nascimento é anterior ou igual ao ano informado.

### 6. **Listar livros em um determinado idioma**
- Exibe quantos livros estão armazenados no banco para um determinado idioma (por exemplo: inglês e português).

---

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Jackson (para parse de JSON)**
- **Maven**
