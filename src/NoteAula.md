# Anotação de Estudo
- É uma linguagem de programação orientado a objetos e independente de plataforma.
- [[JDK]]
# Características do Java
1. **Portabilidade (WORE)**
	>Write Once, Run Everywhere
	- O programa de Java pode ser **escrito uma única vez, e rodar em qualquer sistema operacional**.
	- Essa portabilidade é possível graças ao uso da [[JVM]](Java Virtual Machine)
2. Orientação a Objetos (**OOP - Object-Oriented Programming**) [[OOP]] #orientaçãoAObjetos
3. **Forte Gerenciamento de Memória**
	- Java use um [[Gabage Collector]](Coleto de Lixo) para **automatizar a alocação e liberação de memória**, reduzindo o risco de vazamento.
4. **Segurança**
	- Java roda dentro da **JVM**, isolando a execução de código do sistema operacional.
	- Possui um forte sistema de verificação de segurança e gerenciamento de permissões.
5. Multithreading**
	- Suporte nativo a **multithreading**, permitindo que um programa execute várias tarefas simultaneamente.
---
# Estrutura de Dados
## Tipos Primitivos
- São os **tipos de dados mais básicos** da linguagem, usados para armazenar **valores simples** diretamente na **memória da pilha(stack)**. Eles **não são objetos**, o que os torna mais eficientes em termo de **uso de memórias e velocidade**

| Tipo      | Tamanho | Usado Para                            |
| --------- | ------- | ------------------------------------- |
| `byte`    | 8 bits  | (-128 a 127)                          |
| `short`   | 16bits  | (-32.768 a 32.767)                    |
| `int`     | 32bits  | Números inteiros comuns               |
| `long`    | 64bits  | Números inteiros muito grandes        |
| `float`   | 32 bits | Números decimais de precisão simples  |
| `double`  | 64 bits | Números decimais de precisão dupla    |
| `char`    | 16 bits | Armazena um único caractere (Unicode) |
| `boolean` | 1 bits  | Verdadeiro (`true`) e Falso (`false`) |

### Casting
- O processo de **converter um tipo de dado em outro**. Pode ser usado para converter entre **tipos primitivos** ou entre **objetos de classes relacionadas**.

#### Casting Implícito:
Um processo de **converter um tipo menor para um tipo maior**, por não há risco de perda de dados.

📌 **Exemplo:** int → long ou float → double
```java
public class CastingImplicito {
    public static void main(String[] args) {
        int numeroInt = 10;

        double numeroDouble = numeroInt; // Conversão automática (int → double)

        System.out.println("Número inteiro: " + numeroInt);
        System.out.println("Número convertido para double: " + numeroDouble);
    }
}

**Saída:**
Número inteiro: 10
Número convertido para double: 10.0
```
>✅ **Seguro, pois não já perda de dados**

#### Casting Explícito
Deve ser feito manualmente quando se converte **um tipo maior para um tipo menor**, pois pode ocorrer perda de dados.
📌 **Exemplo:** double → int ou long → byte
```java
public class CastingExplicito {
    public static void main(String[] args) {
        double numeroDouble = 9.99;

        int numeroInt = (int) numeroDouble; // Conversão manual (double → int)

        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número convertido para int: " + numeroInt);
    }
}

**Saída:**
Número double: 9.99
Número convertido para int: 9
```
>❌ **Pode haver perda de precisão**
>📌 **Nota:** O número decimal **9.99 foi truncado para 9**, pois um `int` não pode armazenar casas decimais.

## Operadores
- São símbolos especiais usados para **realizar operações matemáticas, lógicas e relacionais** sobre variáveis e valores. Eles são fundamentais para qualquer programa e ajudam a **manipular dados**
### 1. Operadores Aritméticos (Matemáticos)

Usados para realizar **operações matemáticas básicas**.

| Operador | Descrição                 | Exemplo                        |
| -------- | ------------------------- | ------------------------------ |
| +        | Adição                    | int soma = 5 + 3;   // 8       |
| -        | Subtração                 | int subtração = 10 - 4;   // 6 |
| **       | Multiplicação             | int produto = 6 * 7;   // 42   |
| /        | Divisão                   | int divisão = 10 / 2;   // 5   |
| %        | Módulo (resto da divisão) | int resto = 10 % 3;   // 1     |
**📌 Exemplo de Uso**
```java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }
}
```
### 2. Operadores de Atribuição

Usados para **atribuir valores a variáveis**.

| Operador | Descrição                  | Exemplo                |
| -------- | -------------------------- | ---------------------- |
| =        | Atribuição Simples         | int x = 10;            |
| +=       | Adição e atribuição        | x += 5;   // x = x + 5 |
| -=       | Subtração e atribuição     | x -= 2;   // x = x - 2 |
| =*       | Multiplicação e atribuição | x *= 3;   // x = x * 3 |
| /=       | Divisão e atribuição       | x /= 2;   // x = x / 2 |
| %=       | Módulo e atribuição        | x %= 3;   // x = x % 3 |
**📌 Exemplo de Uso**
```java
int x = 10;
x += 5; // Agora x = 15
x *= 2; // Agora x = 30
System.out.println(x); // Saída: 30
```
### 3. Operadores Relacionais (Comparação)

Usados para **comparar valores** e retornam um **boolean** (`true` ou `false`).

| Operador | Descrição          | Exemplo |
| -------- | ------------------ | ------- |
| ==       | Igual a            | x == y  |
| !=       | Diferente de       | x != y  |
| >        | Maior que          | x > y   |
| <        | Menor que          | x < y   |
| >-       | Maior ou igual que | x >= y  |
| <=       | Menor ou igual a   | x <= y  |
**📌 Exemplo de Uso**
```java
int a = 10, b = 5;
System.out.println(a > b);  // true
System.out.println(a == b); // false
System.out.println(a != b); // true
```
### 4. Operadores Lógicos

Usados para operações **booleana**.

| Operador | Nome | Descrição                                                                                                      | Exemplo                                        |
| -------- | ---- | -------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| &&       | AND  | Retorna `true` se **ambas** as condições forem `true`.                                                         | (5 > 2 && 10 < 20) → true                      |
| \|\|     | OR   | - Retorna `true` se pelo menos uma das condições for `true`.<br>- ==Se ambas forem `true`, retorna `true`.==   | 10 > 5 \|\| 2 > 20); // true \|\| false → true |
| !        | NOT  | **Inverte** o valor lógico (true vira false e vice-versa)                                                      | !(5 == 5) → false                              |
| ^        | XOR  | - Retorna `true` **SOMENTE se UMA** das condições for `true`.<br>- ==Se ambas forem `true`, retorna `false`.== |                                                |

## Estrutura Condicionais

Permitem que um programa **tomem decisões** com base em condições.
### 1. If / else if/ else

O `if` permite executar um bloco de código **se uma condição for verdadeira (`true`)**. O `else if` adiciona mais verificações, e o `else` é executado se nenhuma das condições anteriores for satisfeita.

**📌 Estrutura:**
```java
if (condição) {
    // Código executado se a condição for verdadeira
} else if (outra condição) {
    // Código executado se a primeira condição for falsa e essa for verdadeira
} else {
    // Código executado se nenhuma das condições acima for verdadeira
}
```
**📌 Exemplo Prático**
```java
public class ExemploIfElse {
    public static void main(String[] args) {
        int idade = 18;
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("Tem exatamente 18 anos");
        } else {
            System.out.println("Maior de idade");
        }
    }
}

**Saída**
Tem exatamento 18 anos
```
✅ **O Java verifica as condições em ordem.**
✅ **Se encontrar uma verdadeira, ele executa o bloco e ignora o restante.**
✅ **Se nenhuma for verdadeira, executa o bloco else (se existir).**
#### Operador Ternário (? :)
Uma for **simplificada** de escrever um **`if-else`** quando queremos atribuir um valor baseado em uma condição. 

**🔹Estrutura**
```java
variavel = (condição) ? valor_se_verdadeiro : valor_se_falso;
```
• **condição** → A expressão booleana que será avaliada (`true` ou `false`).

• **valor_se_verdadeiro** → Retornado **se a condição for `true`**.

• **valor_se_falso** → Retornado **se a condição for `false`**.

**🔹 Exemplo Básico**
```java
public class ExemploTernario{
	public static void main(String[] args){
		int idade = 18;
		String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
	System.out.prinln(status);
	}
}

*Saìda*
Maior de idade
```
>[!Hint]
**📌 Quando Usar o Operador Ternário?**
✅ **Quando queremos um código mais curto e simples**.
✅ **Quando temos apenas UMA condição e DUAS possibilidades (true ou false).**
✅ **Para atribuições de variáveis e retornos de métodos rapidamente.**

### 2.`switch`
O switch é uma **estrutura condicional** usada quando queremos testar **um único valor** contra **múltiplas possibilidades**. Ele é uma alternativa ao uso de vários `if-else`.

**🔹 Estrutura do switch**
```java
switch (variavel) {
    case valor1:
        // Código executado se variavel == valor1
        break;
    case valor2;
        // Código executado se variavel == valor2
        break;
    default:
        // Código executado se nenhum dos casos for verdadeiro
}
```
📌 **Explicação:**

✅ O switch compara a variável com **cada `case`**.

✅ Se encontrar um case igual, executa o código correspondente.

✅ O break impede que os próximos `case` sejam executados.

✅ O default é opcional e executado se **nenhum case for verdadeiro**.

**🔹 Importância do `break`**

❌ **Sem `break`, todos os próximos case são executados.**
✅ Para corrigir, devemos adicionar `break` após cada case.
## Estrutura de Repetição
### while`
O while é uma **estrutura de repetição** usada para executar um bloco de código **enquanto uma condição for verdadeira (true)**. Ele é útil quando **não sabemos antecipadamente quantas vezes o loop será executado**.

**🔹 Estrutura do while**
```java
while (condição) {
    // Código executado enquanto a condição for verdadeira
}
```
🔸**Exemplo Simples**
```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1; // Inicialização
        while (contador <= 5) { // Condição
            System.out.println("Número: " + contador);
            contador++; // Atualização
        }
    }
}
*Saìda*
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```
✅ **Enquanto contador <= 5, o código dentro do `while` será executado.**
✅ **Se esquecermos contador++, teremos um loop infinito!** 🔥
### `do while`
 O do-while sempre **executa o bloco ao menos uma vez**, mesmo que a condição seja `false`.
 
📌 **Exemplo Comparativo**
```java
int x = 10;
// while (só executa se a condição for verdadeira)
while(x < 5){
	System.out.println("Isso NUNCA será impresso.")
}

//do-while (executa pelo menos 1 vez)
do{
	System.out.println("Isso será impresso pelo menos uma vez")
}while (x < 5);
```
### `for`
O `for` é uma **estrutura de repetição** usada quando sabemos **quantas vezes** um bloco de código deve ser executada.

**🔹 Estrutura do for**
```java
for(inicialização; condição; atualização){
	// Código executado enquanto a condição for verdadeira
}
```
📌 **Explicação:**
1️⃣ **Inicialização** → Define a variável de controle (executada **apenas uma vez**).

2️⃣ **Condição** → O loop continua rodando **enquanto essa condição for true**.

3️⃣ **Atualização** → Modifica a variável de controle **após cada iteração**.

**🔹 Exemplo Básico**
```java
public class ExemploFor{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++){
			System.out.println("Numero: " + i) 
		}
	}
}

*Saída*
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```
✅ **Passo a Passo:**
1️⃣ i = 1 (inicialização)
2️⃣ i <= 5 → true, executa System.out.println("Número: " + i);
3️⃣ i++ → i = 2, e repete até i ser maior que 5.

✔ **O for é útil quando sabemos o número exato de repetições.**
✔ **Possui inicialização, condição e incremento na mesma linha.**
✔ **Podemos omitir partes do for, mas os ; são obrigatórios.**
✔ **O break interrompe o loop, e o continue pula uma iteração.**
✔ **O for-each é ideal para percorrer arrays e listas.**
### `break` / `continue`
#### 1️⃣`break`
O `break` **para** completamente a execução do loop assim que for encontrado.

**🔹 Exemplo Básico**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 2) {
            if (i == 50) { 
                break; // Sai do loop quando i for 50
            }
            System.out.println(i);
        }
    }
}
```
❗ **Saída:** Imprime os números pares de 0 a 48, pois quando i == 50, o loop é encerrado.
#### 2️⃣`continue`
O `cotinue` **ignora o restante do código na iteraçåo atual** e vai para a **próxima repetição do loop**.

**🔹 Exemplo Básico**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 2) {
            if (i == 50) { 
                continue; // Pula o 50 e continua o loop
            }
            System.out.println(i);
        }
    }
}
```
❗ **Saída:** Imprime os números pares de 0 a 100, **exceto** o 50.
## Arrays
`array` é uma estrutura de dados que **armazena múltiplos valores do mesmo tipo**. Ele permite acessar elementos individuais usando um **índice**, que começa em **0**.

📌 **Principais características do array em Java:**
==✔ **Tamanho fixo** → O tamanho do array é definido na criação e **não pode ser alterado**.
✔ **Armazena elementos do mesmo tipo** → Todos os valores do array devem ser do mesmo tipo (`int, double, String`, etc.).
✔ **Índices começam em 0** → O primeiro elemento está na posição 0, o segundo na 1 e assim por diante.==

**🔹 Estrutura Array**
**1️⃣** Declarando e inicializando um Array
```java
int[] numeros = new int[5]; // Cria um array de 5 posições
```
📌 **Explicação:**

✅ `int[] numeros` → Declara um `array` do tipo int.
✅ `new int[5]` → Cria um espaço na memória para armazenar **5 números inteiros**.

**2️⃣** Criando e Inicializando com Valores
```java
int[] numeros = {10, 20, 30, 40, 50}; // Array com valores já definidos
```
📌 **Explicação:**

✅ O tamanho do array é **automaticamente ajustado** para 5 elementos.
### loop for-each
- Também conhecido como **Enhanced for loop**.

É uma maneira mais simples e segura de percorrer elementos de uma `array` ou de uma coleção, sem precisar gerenciar um índice manualmente.

**📌 Como funciona o for-each?**
🔹**Estrutura Básica**
```java
for (Tipo elemento : coleçãoOuArray){
	// Código que usa o elemento
}
```
🔸**Explicação:**
- **Tipo** -> Tipo de dado do elemento dentro do array ou coleção;
- **`elemento`** -> Nome da variável que representará cada item dentro do loop.
- **`coleçãoOUArray`** -> A estrutura de dados que está sendo percorrido.

💡 O for-each **não** permite modificar a estrutura da coleção enquanto itera sobre ela.

**🔹 Exemplo com Arrays**
```java
public class ExemploForEachArray{
	public static void main(String[] args){
		int[] numeros = {10, 20, 30, 40, 50};

		for (int num : numeros) {
			System.out.println("Número: " + num)
		}
	}
}
```
### Arrays Multidimencionais 
Um **array multidimensional** em Java w um array que contém outros arrays como seus elementos. O mais comum é o **array bidimensional(matriz)**, mas podemos ter arrys de mais dimensões.

**🔹 Declaração e Inicialização**

**✅ Matriz (Array Bidimensional)**

A sintaxe básica para declarar um array bidimensional é:
```java
tipo[][] moneDoArray = new tipo[linhas][colunas];
```
Ou podemos inicializá-lo diretamente:
```java
int[][] matriz = {
	{1, 2, 3},
	{4, 5, 6},
	{7, 8, 9},
}
```
**📌 Resumo**

✔ Arrays multidimensionais são arrays dentro de arrays.
✔ O mais comum é o **array bidimensional** (matriz).
✔ O acesso aos elementos é feito com **dois índices** (matriz\[linha]\[coluna]).
✔ Pode-se criar **arrays irregulares** onde cada linha tem um tamanho diferente.
✔ O **for-each** pode ser usado para percorrer matrizes de forma mais simples.
✔ São muito utilizados em algoritmos matemáticos, jogos, e tabelas de dados.

# Orientação Objetos
Uma maneira de organizar o código de forma mais parecido com o mundo real.

**📌 O que é a Programação Orientada a Objetos (POO)?**

A **POO** é um **paradigma de programação**(um estilo de programar) baseado em **objetos**. Ao invés de apenas usar variáveis e funções soltas, organizamos tudo em **objetos**, que representam coisas do mundo real.

Cada **objeto** possui:
- **Atributos** -> São os características do objeto (ex: um carro tem cor, marca, velocidade).
- **Métodos** -> São as ações do objeto (ex: um carro pode acelerar, frear)

📝Por exemplo:
- Se estamos fazendo um jogo de carros, podemos criar um **objeto "Carro"** que tem características como **cor, marca, valocidade** e ações como **acelerar() e frear()**.

**📌 Principais conceitos da POO**
## Classes e Objetos (O básico de tudo)
- Uma **classes** é como um **moide** ou **modelo** para criar objetos.
- Um **objetos** é uma **instância** de uma classe(ou seja, uma cópia com valores prórprios).

Exemplo: **Criando uma classse "Carro**
```java
public class Carro{
	String marca;
	String cor;
	int velocidade;

	void acelerar(){
		velocidade += 10;
		System.out.println("Aceletrando..... Velocidade atual " + velocidade)
	}

	void frear(){
		velocidade -= 0;
		System.out.pritln("Freando... Velocidade atual: " + velocidad)
	}
}
```

💡 **Explicação:**

- Criamos a classe Carro com três atributos (**marca**, **cor** e **velocidade**).
- Criamos dois métodos (**acelerar()** e **frear()** para alterar a velocidade do carro.