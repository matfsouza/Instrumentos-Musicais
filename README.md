# 🎵 Projeto Orquestra: Instrumentos Musicais

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)

Este é um projeto simples em Java desenvolvido para fins de estudo, demonstrando conceitos fundamentais de Programação Orientada a Objetos (POO).

O programa simula uma pequena orquestra, onde diferentes instrumentos musicais são afinados e tocados, cada um com seu comportamento específico, mostrando como classes e objetos podem interagir de forma coesa.

## 🚀 Conceitos de POO Aplicados

-   **Abstração:** Através da classe abstrata `InstrumentoMusical`, que define um contrato comum para todos os instrumentos.
-   **Herança:** As classes `PianoExercicio`, `ViolaoExercicio`, `BateriaExercicio` e `SaxofoneExercicio` herdam as características e comportamentos básicos de `InstrumentoMusical`.
-   **Polimorfismo:** O método `tocar()` é implementado de maneira única em cada instrumento, permitindo que seja chamado de forma genérica mas executado de forma específica.
-   **Encapsulamento:** Os atributos de cada instrumento são protegidos e acessados através de métodos públicos (`getters`).

## 📂 Estrutura do Projeto

-   **`InstrumentoMusical.java`**: Classe abstrata que serve como molde para todos os instrumentos.
-   **`PianoExercicio.java`**, **`ViolaoExercicio.java`**, etc.: Implementações concretas de cada instrumento, cada um com suas particularidades.
-   **`EscolaMusica.java`**: A classe principal (`main`) que cria a "orquestra" (um array de instrumentos) e gerencia a apresentação, afinando e tocando cada um deles.

## ▶️ Como Executar

O projeto foi desenvolvido para ser executado em uma IDE Java (como IntelliJ IDEA, Eclipse, VS Code com extensions Java, etc.).

1.  Clone ou baixe o repositório.
2.  Abra a pasta do projeto na sua IDE de preferência.
3.  Localize o arquivo `EscolaMusica.java`.
4.  Execute o método `main` contido nesta classe.

## 👨‍💻 Autor

-   **Matheus Souza** - [matfsouza](https://github.com/matfsouza)
