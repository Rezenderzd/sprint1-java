# Escolhas técnicas
### Clareza nos Parâmetros do Construtor
Utilizei variáveis explícitas para definir os parâmetros passados ao construtor. Essa abordagem visa aumentar a legibilidade do código, tornando evidente o papel e o significado de cada argumento.

### Validação de Instanciação
Para garantir que o objeto foi criado corretamente, implementei uma classe de testes/validação responsável por verificar se todos os atributos obrigatórios foram preenchidos conforme o esperado.

### Restrição de Métodos para Objetos Inválidos
Para evitar a execução de métodos em objetos que não cumprem as condições de criação, implementei uma trava de segurança. A lógica valida se o nome do trecho está nulo — já que o objeto inicia nesse estado —, impedindo operações indesejadas em instâncias que ainda não foram totalmente inicializadas.

---

# Perguntas reflexivas

### 1- Por que TrechoRodovia é uma classe e "BR-116 KM 10 ao 15" é um objeto? 

### Resposta ###
A classe TrechoRodovia funciona como um molde, um modelo abstrato que define a estrutura (atributos) e os comportamentos (métodos) que qualquer trecho de rodovia deve possuir. Já "BR-116 KM 10 ao 15" é um objeto (ou instância) concreto desse molde, possuindo dados específicos na memória. Centralizar essa lógica em uma classe permite a reutilização de código para criar múltiplos trechos diferentes, facilitando a manutenção e a legibilidade do sistema.

---
### 2- Se o nivelVegetacao fosse público, que tipo de "quebra" no sistema de previsão da Motiva um programador descuidado poderia causar?

### Resposta ### 
Caso o atributo fosse público, haveria uma quebra no princípio do Encapsulamento. Qualquer parte do sistema poderia alterar diretamente o valor de nivelVegetacao sem passar por validações ou regras de negócio necessárias. Um programador descuidado poderia inserir valores inválidos (como números negativos ou acima do limite permitido), corrompendo a integridade dos dados e gerando previsões totalmente incorretas e imprevisíveis no site.

---

## Integrantes - 2CCPO
| Integrante | RM |
|---|---|
| Fernando Caires Silva | 563415 |
| Giovanna Fernandes Pereira | 565434 |
| Guilherme Martins Rezende | 563500 |
| João Pedro de Moura Albino | 565323 |
| Kauê Silva Matheus | 561675 |
| Raphael Mischiatti de Souza | 563567 |