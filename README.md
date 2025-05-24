# Sistema de Controle de Tráfego Aéreo
## Implementação do Padrão Mediator em Java

**Projeto Final de Disciplina**

Este projeto demonstra a implementação do padrão de design **Mediator** (Comportamental) através de um sistema simulado de controle de tráfego aéreo.

## 🎯 Sobre o Padrão Mediator

O padrão de projeto **Mediator** define um objeto que encapsula a forma como um conjunto de objetos interage. O Mediator promove o acoplamento fraco ao evitar que os objetos se refiram uns aos outros explicitamente.

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/
            └── aviation/
                └── mediator/
                    ├── Main.java                    # Classe principal
                    ├── aircraft/                    # Pacote das aeronaves
                    │   ├── Aircraft.java           # Classe abstrata base
                    │   ├── Boeing747.java          # Implementação Boeing 747
                    │   └── AirbusA320.java         # Implementação Airbus A320
                    ├── controller/                  # Pacote dos controladores
                    │   └── TowerControl.java       # Mediator concreto
                    └── interfaces/                  # Pacote das interfaces
                        └── AirTrafficControl.java   # Interface do Mediator
```

## 🎯 Componentes do Padrão

- **Mediator (`AirTrafficControl`)**: Interface que define o contrato para comunicação
- **ConcreteMediator (`TowerControl`)**: Implementa o mediator e coordena a comunicação
- **Colleague (`Aircraft`)**: Classe base para objetos que se comunicam através do mediator
- **ConcreteColleagues (`Boeing747`, `AirbusA320`)**: Implementações específicas das aeronaves

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior instalado
- Terminal/Prompt de comando

### Comandos via Terminal

#### 1. Criar diretório de build
```bash
mkdir -p build/classes build/test-classes
```

#### 2. Compilar o projeto
```bash
javac -d build/classes -cp src/main/java src/main/java/com/aviation/mediator/*.java src/main/java/com/aviation/mediator/*/*.java
```

#### 3. Executar o projeto
```bash
java -cp build/classes com.aviation.mediator.Main
```

#### 4. Compilar testes (opcional)
```bash
javac -d build/test-classes -cp build/classes:src/test/java src/test/java/com/aviation/mediator/*.java
```

#### 5. Executar testes (opcional)
```bash
java -cp build/classes:build/test-classes com.aviation.mediator.SimpleTest
```

#### 6. Limpar build
```bash
rm -rf build/classes build/test-classes
```

### Comandos no Windows
Para usuários Windows, substitua:
- `/` por `\` nos caminhos
- `:` por `;` no classpath
- `rm -rf` por `rmdir /s /q`

Exemplo Windows:
```cmd
mkdir build\classes build\test-classes
javac -d build\classes -cp src\main\java src\main\java\com\aviation\mediator\*.java src\main\java\com\aviation\mediator\*\*.java
java -cp build\classes com.aviation.mediator.Main
```

## 🔄 Como Funciona

1. O `TowerControl` atua como mediador central
2. As aeronaves (`Boeing747` e `AirbusA320`) se registram no controlador
3. Quando uma aeronave envia uma mensagem, o controlador a retransmite para todas as outras aeronaves registradas
4. Isso permite comunicação entre aeronaves sem que elas se conheçam diretamente

## 💡 Vantagens do Padrão Mediator

- **Baixo acoplamento**: Objetos não precisam se referenciar diretamente
- **Centralização da lógica**: Toda comunicação passa pelo mediador
- **Facilidade de manutenção**: Mudanças na comunicação afetam apenas o mediador
- **Reutilização**: Novos tipos de aeronaves podem ser facilmente adicionados

## 📝 Exemplo de Saída

```
=== Sistema de Controle de Tráfego Aéreo ===
Demonstração do padrão Mediator

--- Registrando Aeronaves ---
Aeronave registrada no sistema de controle: Boeing747
Aeronave registrada no sistema de controle: AirbusA320

--- Comunicação entre Aeronaves ---
Boeing747 Boeing-747-123 enviando mensagem: Solicitando permissão para decolar.
AirbusA320 Airbus-A320-456 recebendo mensagem: Solicitando permissão para decolar.

AirbusA320 Airbus-A320-456 enviando mensagem: Solicitando permissão para aterrissar.
Boeing747 Boeing-747-123 recebendo mensagem: Solicitando permissão para aterrissar.

=== Fim da demonstração ===
```

---
**Projeto Final de Disciplina - Implementação do Padrão Mediator**
