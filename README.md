# Padrão Builder

Implementação do padrão de projeto Builder (Padrão Criacional) aplicado ao contexto de jogadores de basquete.

## 🏗️ Estrutura do Projeto

```
basquete/
├── pom.xml
└── src/
    ├── main/java/padroescriacionais/builder/
    │   ├── JogadorBasquete.java          # Classe do jogador
    │   └── JogadorBasqueteBuilder.java   # Builder para construir jogadores
    └── test/java/padroescriacionais/builder/
        └── JogadorBasqueteBuilderTest.java # Testes unitários
```

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior
- Maven 3.6 ou superior

### Compilar o projeto
```bash
cd basquete
mvn clean compile
```

### Executar os testes
```bash
mvn test
```

### Compilar e testar
```bash
mvn clean test
```

## 💡 Exemplo de Uso

```java
JogadorBasqueteBuilder builder = new JogadorBasqueteBuilder();
JogadorBasquete jogador = builder
    .setNumero(23)
    .setNome("LeBron James")
    .setPosicao("Ala")
    .setAltura(2.06)
    .setPeso(113.0)
    .setNacionalidade("Estados Unidos")
    .setEmail("lebron@nba.com")
    .build();
```

## ✅ Validações

O builder valida os seguintes campos obrigatórios:
- **Número**: não pode ser 0
- **Nome**: não pode ser vazio

Se alguma validação falhar, uma `IllegalArgumentException` será lançada.

## 🧪 Testes

O projeto inclui testes unitários que verificam:
- Exceção para jogador sem número
- Exceção para jogador sem nome
- Criação bem-sucedida de jogador válido