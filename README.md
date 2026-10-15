# Sistema de Cadastro de Alunos com Herança e Polimorfismo

Sistema de linha de comando desenvolvido em Java para cadastrar, listar e buscar alunos e professores de uma instituição de ensino, aplicando os principais conceitos da Programação Orientada a Objetos.

## Projeto Acadêmico

Este projeto foi desenvolvido como atividade acadêmica da disciplina de Programação Orientada a Objetos (Java), ministrada pelo Prof. Dr. Renato Matroniani, com o objetivo de colocar em prática os conceitos fundamentais da linguagem Java e da orientação a objetos.

**Aluno:** Elias Teixeira Santana Junior

O projeto faz parte da minha jornada de aprendizado em desenvolvimento de software e representa uma etapa da minha evolução com Java. Novas melhorias poderão ser implementadas conforme o aprofundamento nos conceitos estudados.

## Sobre o Projeto

O Sistema de Cadastro de Alunos foi desenvolvido para organizar informações de pessoas vinculadas a uma instituição de ensino, permitindo registrar alunos e professores, consultar os cadastros existentes e visualizar seus dados.

A aplicação funciona por meio de um menu interativo no terminal, no qual o usuário escolhe a operação desejada.

O principal objetivo é aplicar conceitos de Programação Orientada a Objetos em uma aplicação prática, com uma estrutura simples, organizada e de fácil compreensão.

## Objetivos

O desenvolvimento do projeto tem como objetivos:

- Aplicar os fundamentos da Programação Orientada a Objetos em Java.
- Trabalhar com classes, objetos, atributos e métodos.
- Implementar encapsulamento por meio de atributos privados e métodos de acesso.
- Utilizar herança para compartilhar características entre classes.
- Compreender o uso de construtores e sobrecarga de construtores.
- Armazenar diferentes tipos de objetos em uma mesma coleção.
- Desenvolver um menu interativo para realizar operações de cadastro e consulta.

## Funcionalidades

### Cadastro de Alunos

Permite cadastrar alunos com as seguintes informações:

- Nome
- CPF
- Data de nascimento
- Matrícula
- Nota

### Cadastro de Professores

Permite cadastrar professores com as seguintes informações:

- Nome
- CPF
- Data de nascimento
- Disciplina
- Titulação

### Listagem de Pessoas

Exibe os registros cadastrados durante a execução do programa, incluindo os dados comuns e as informações específicas de alunos e professores.

### Busca por Nome

Permite pesquisar uma pessoa pelo nome cadastrado. A comparação não diferencia letras maiúsculas de minúsculas.

### Menu Interativo

O sistema apresenta as seguintes opções:

- Cadastrar aluno
- Cadastrar professor
- Listar pessoas
- Buscar pessoa por nome
- Encerrar o programa

## Conceitos de Programação Orientada a Objetos

### Encapsulamento

Os atributos das classes são declarados como `private`, restringindo o acesso direto aos dados. Os métodos getters e setters permitem consultar e modificar essas informações.

### Herança

A classe `Pessoa` funciona como superclasse, reunindo os atributos comuns aos registros.

As classes `Aluno` e `Professor` utilizam `extends Pessoa` para herdar essas características e acrescentar seus próprios atributos.

### Construtores

A classe `Pessoa` possui dois construtores sobrecarregados: um sem parâmetros e outro com parâmetros. O construtor sem parâmetros utiliza `this(...)` para chamar a outra versão.

As subclasses utilizam `super(...)` para inicializar os atributos herdados.

### Polimorfismo

A coleção `ArrayList<Pessoa>` permite armazenar objetos das classes `Aluno` e `Professor` utilizando o tipo comum `Pessoa`.

O método de exibição recebe uma referência do tipo `Pessoa` e utiliza `instanceof` para identificar a classe concreta e apresentar os dados específicos de cada tipo.

### Coleções

O `ArrayList` é utilizado para armazenar os registros em memória durante a execução do programa, permitindo percorrer e consultar as pessoas cadastradas.

## Tecnologias Utilizadas

- **Java:** linguagem utilizada no desenvolvimento da aplicação.
- **JDK:** ambiente de desenvolvimento necessário para compilar e executar o código.
- **IntelliJ IDEA ou outra IDE Java:** ambiente que pode ser utilizado para editar, compilar e executar o projeto.
- **Git e GitHub:** ferramentas para versionamento e disponibilização do código-fonte.

## Estrutura do Projeto

O código-fonte foi organizado em um arquivo Java que contém a classe principal e as classes utilizadas pelo sistema.

```text
SistemaCadastroAlunos/
|
|-- Main.java
|   |-- Main
|   |-- Pessoa
|   |-- Aluno
|   |-- Professor
|
|-- README.md
```

A classe `Main` controla o menu e as operações do sistema. A classe `Pessoa` reúne os atributos comuns, enquanto `Aluno` e `Professor` representam os tipos específicos de cadastro.

## Como Executar

### Pré-requisitos

- JDK instalado.
- IDE Java ou terminal com acesso aos comandos `javac` e `java`.

### Executando pela IDE

1. Clone ou baixe o repositório.
2. Abra o projeto na IDE de sua preferência.
3. Certifique-se de que o arquivo `Main.java` está configurado corretamente.
4. Execute a classe `Main`.

### Executando pelo Terminal

Se o arquivo estiver salvo como `Main.java` e o Java estiver configurado no sistema, execute:

```bash
javac Main.java
java Main
```

O menu será exibido no terminal, permitindo interagir com as funcionalidades disponíveis.

## Testes

Para verificar o funcionamento da aplicação, recomenda-se executar os seguintes cenários:

- Cadastrar pelo menos três alunos.
- Cadastrar pelo menos dois professores.
- Listar todos os registros cadastrados.
- Pesquisar nomes existentes.
- Pesquisar um nome inexistente.
- Informar uma opção inválida no menu.
- Selecionar a opção de saída.

Os resultados devem ser confirmados por meio da execução do programa.

## Possíveis Melhorias Futuras

Conforme a evolução dos estudos em Java e Programação Orientada a Objetos, o projeto poderá receber melhorias como:

- Separação das classes em arquivos individuais.
- Validação de entradas e tratamento de exceções.
- Melhorias na apresentação das informações no terminal.
- Implementação de edição e exclusão de registros.
- Persistência dos dados em arquivos ou banco de dados.
- Criação de testes automatizados.
- Aprimoramento da estrutura do projeto seguindo boas práticas de desenvolvimento.

## Aprendizados

Este projeto representa uma oportunidade de praticar os fundamentos da linguagem Java e compreender como os conceitos de orientação a objetos podem ser aplicados na construção de sistemas.

A implementação contribui para o aprendizado de encapsulamento, herança, construtores, coleções e organização de código, servindo como base para projetos mais complexos no futuro.

## Autor

**Elias Teixeira Santana Junior**

Estudante de Análise e Desenvolvimento de Sistemas, com foco no aprendizado de Java, desenvolvimento backend e construção de aplicações utilizando boas práticas de programação.

GitHub: [Elias-official](https://github.com/Elias-official)

---

Projeto acadêmico desenvolvido para fins educacionais, com foco no aprendizado e na evolução contínua em desenvolvimento de software.
