# CRUD Simples — Spring Boot

API REST simples feita para praticar os fundamentos do Spring Boot.

## Tecnologias
- Java 17
- Spring Boot 3.x
- Lombok
- Maven

## Endpoints

| Método | URL | Descrição |
|--------|-----|-----------|
| GET | /usuarios | Lista todos os usuários |
| GET | /usuarios/{id} | Busca usuário por ID |
| POST | /usuarios | Cria um usuário |
| DELETE | /usuarios/{id} | Remove um usuário |

## Como rodar

```bash
mvn spring-boot:run
```

## Observação
Os dados ficam em memória — ao reiniciar a aplicação os dados são perdidos.
Esta é a etapa 1 do roadmap, sem banco de dados ainda.
