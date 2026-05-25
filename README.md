# 🥷 Cadastro De Ninjas API

API REST desenvolvida com Java e Spring Boot para gerenciamento de ninjas e missões.  
O sistema permite realizar operações completas de CRUD, relacionamento entre entidades e gerenciamento através de endpoints REST e interface web com Thymeleaf.

---

# 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- Hibernate
- Flyway
- H2 Database
- Lombok
- Swagger / OpenAPI
- Thymeleaf
- Maven

---

# 📌 Funcionalidades

## 🥷 Ninja
- Cadastrar ninja
- Listar ninjas
- Buscar ninja por ID
- Atualizar ninja
- Remover ninja

## 🎯 Missão
- Cadastrar missão
- Listar missões
- Buscar missão por ID
- Atualizar missão
- Remover missão

## 🖥️ Interface Web
- Tela de listagem de ninjas
- Tela de cadastro
- Tela de edição
- Exclusão de ninjas
- Integração com Thymeleaf

---

# 🧱 Arquitetura do Projeto

O projeto segue arquitetura em camadas:

```txt
Controller → Service → Repository → Database
```

Organização:
- Controller
- Service
- Repository
- DTO
- Mapper
- Model
- Templates (Thymeleaf)

---

# 🗂️ Estrutura das Entidades

## 🥷 Ninja

| Campo | Tipo |
|---|---|
| id | Long |
| nome | String |
| email | String |
| idade | Integer |
| rank | String |
| missao | Missao |

---

## 🎯 Missão

| Campo | Tipo |
|---|---|
| id | Long |
| nome | String |
| dificuldade | String |

---

# 🛠️ Dependências Principais

```xml
Spring Web MVC
Spring Data JPA
Flyway
H2 Database
Lombok
Swagger OpenAPI
Thymeleaf
```

---

# ⚙️ Como Executar o Projeto

## ✅ Pré-requisitos

- Java 17+
- Maven

---

## 📥 Clonar o repositório

```bash
git clone https://github.com/DevLuizEduardo/CadastroDeNinjas.git
```

---

## 📂 Entrar na pasta do projeto

```bash
cd CadastroDeNinjas
```

---

## ▶️ Executar a aplicação

```bash
mvn spring-boot:run
```

---

# 🛢️ Banco de Dados H2

O projeto utiliza banco H2 em memória para desenvolvimento.

## 🔗 Console H2

```txt
http://localhost:8080/h2-console
```

---

## ⚙️ Configuração padrão

```txt
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password:
```

---

# 📚 Documentação Swagger

Após iniciar o projeto:

```txt
http://localhost:8080/swagger-ui/index.html
```

---

# 📡 Endpoints REST

## 🥷 Ninja

| Método | Endpoint | Descrição |
|---|---|---|
| POST | /ninjas | Criar ninja |
| GET | /ninjas | Listar ninjas |
| GET | /ninjas/{id} | Buscar ninja por ID |
| PUT | /ninjas/{id} | Atualizar ninja |
| DELETE | /ninjas/{id} | Deletar ninja |

---

## 🎯 Missão

| Método | Endpoint | Descrição |
|---|---|---|
| POST | /missoes | Criar missão |
| GET | /missoes | Listar missões |
| GET | /missoes/{id} | Buscar missão por ID |
| PUT | /missoes/{id} | Atualizar missão |
| DELETE | /missoes/{id} | Deletar missão |

---

# 🖥️ Rotas do Controller UI

| Método | Rota | Descrição |
|---|---|---|
| GET | /ninjas/ui/listar | Tela de listagem |
| GET | /ninjas/ui/cadastrar | Tela de cadastro |
| POST | /ninjas/ui/salvar | Salvar ninja |
| GET | /ninjas/ui/editar/{id} | Tela de edição |
| POST | /ninjas/ui/atualizar/{id} | Atualizar ninja |
| GET | /ninjas/ui/deletar/{id} | Remover ninja |

---

# 🧪 Exemplo de JSON

## 🥷 Criar Ninja

```json
{
  "nome": "Naruto Uzumaki",
  "email": "naruto@konoha.com",
  "idade": 17,
  "rank": "Genin",
  "missao": {
    "id": 1
  }
}
```

---

## 🎯 Criar Missão

```json
{
  "nome": "Proteger a Vila da Folha",
  "dificuldade": "Alta"
}
```

---

# 🧠 Conceitos Aplicados

- API REST
- Arquitetura em camadas
- DTO Pattern
- JPA/Hibernate
- Relacionamento entre entidades
- Migrations com Flyway
- Swagger/OpenAPI
- Thymeleaf
- CRUD completo
- Persistência de dados
- Boas práticas no backend Java

---

# 🚀 Melhorias Futuras

- Autenticação JWT
- Spring Security
- Docker
- Testes com JUnit e Mockito
- Deploy em nuvem
- Banco PostgreSQL
- Paginação
- Tratamento global de exceções

---

# 👨‍💻 Autor

Desenvolvido por **Luiz Eduardo** 🚀

- GitHub: https://github.com/DevLuizEduardo
