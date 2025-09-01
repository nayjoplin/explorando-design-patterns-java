# Design Patterns em Java – DIO

Projeto desenvolvido como parte do desafio **Explorando Padrões de Projetos na Prática com Java**.  
O objetivo foi aplicar na prática três padrões de projeto fundamentais: **Singleton**, **Strategy** e **Facade**.

---

## Tecnologias utilizadas
- Java 21 (pode rodar em versões anteriores sem problemas)
- Compilação e execução direto no terminal (**sem Gradle/Maven**)

---

## Estrutura do Projeto
design-patterns-java/
├── src/
│ └── main/
│ └── java/
│ └── patterns/
│ ├── App.java
│ ├── SingletonExample.java
│ ├── StrategyExample.java
│ └── FacadeExample.java
└── README.md

---

## Padrões implementados
- **Singleton** → garante que uma classe tenha apenas uma instância em todo o sistema.  
- **Strategy** → permite mudar o comportamento do algoritmo em tempo de execução.  
- **Facade** → fornece uma interface simples para um sistema mais complexo.

---

## Como executar
No terminal, dentro da pasta do projeto:

```bash
cd src/main/java
javac patterns/*.java
java patterns.App

## Exemplo de saída esperada
=== Design Patterns em Java ===
Singleton funciona? true
10 + 5 = 15
10 * 5 = 50
=== Facade ===
CPU iniciada.
Memória carregada.
Disco lido.
Sistema iniciado com sucesso!

---
