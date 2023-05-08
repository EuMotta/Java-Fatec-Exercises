<p align="center">

  <img src="https://www.svgrepo.com/show/452234/java.svg" alt="Matriz Logo" width="200px" height="50px" align="right">
  <h1 align="left"> Introdução LP </h1>

</p>

### Exercício 1
> Crie um arquivo chamado `ConversaoPrimitivos.java`. Para eliminar os erros de compilação, complete os espaços marcados por “xxxxx” do código abaixo quando necessário.

```java
public class ConversaoPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        long b = xxxxx a;
        int c = xxxxx b;
        float d = xxxxx b;
        short e = xxxxx a;
        double f = xxxxx d;
        Long g = xxxxx b;
        long h = xxxxx g;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
```

---

### Exercício 2
> Crie um arquivo chamado `Casting.java`. Crie uma variável chamada `numero1` do tipo `long` e inicialize-a com o valor `2147483648L`. Depois, crie uma variável chamada `numero2` do tipo `int` e copie o valor da variável `numero1` para a variável `numero2`. Por fim, exiba, na saída padrão, os valores dessas duas variáveis.

---

### Exercício 3
> Crie um arquivo chamado `Conversao.java`. Crie uma variável chamada `texto` do tipo `String` e associe a ela a sequência de caracteres `"19.09"`. Depois, faça a conversão do valor associado a essa variável para `double` e armazene o resultado em uma variável chamada `numero` do tipo `double`. Por fim, exiba o valor da variável `numero`.

---

### Exercício 4
> Crie um arquivo chamado `OperadoresAritmeticos.java`. Complete o código a seguir no local indicado por `xxxxx`, com os operadores aritméticos da linguagem Java. Não utilize operadores repetidos. O programa deve exibir os números 11, 8, 60, 5 e 2 nessa ordem.

```java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10 xxxxx 1;
        int b = 10 xxxxx 2;
        int c = 20 xxxxx 3;
        int d = 25 xxxxx 5;
        int e = 10 xxxxx 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

```

---

### Exercício 5
> Crie um arquivo chamado `TiposDeResultado.java`. Complete o código a seguir, substituindo a seqüência `xxxxx` com os tipos primitivos numéricos da linguagem Java. Utilize sempre o tipo que ocupa o menor espaço na memória.

```java
public class TiposDeResultado {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        double c = 3.14;

        xxxxx d = a + b;
        xxxxx e = b + c;

        System.out.println(d);
        System.out.println(e);
    }
}
```

---

### Exercício 6
> Crie um arquivo chamado `DivisaoInteiraReal.java`. Complete o código, substituindo a seqüência `xxxxx` com operações de divisão, operações de casting e parênteses. O programa deve exibir os números 2, 2.5, 2.5, 2.5 e 2.0 nessa ordem. A cada linha complete o código de uma forma diferente. Não é necessário completar todas as seqüências.

```java
public class DivisaoInteiraReal {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println(xxxxx a xxxxx b xxxxx);
        System.out.println(xxxxx a xxxxx b xxxxx);
        System.out.println(xxxxx a xxxxx b xxxxx);
        System.out.println(xxxxx a xxxxx b xxxxx);
        System.out.println(xxxxx a xxxxx b xxxxx);
    }
}
```
---

### Exercício 7
> Crie um arquivo chamado `OverflowUnderflow.java`. Complete o código, substituindo a seqüência `xxxxx` com valores literais. O programa deve exibir os números -2147483648 e 2147483647 nessa ordem.

```java
public class OverflowUnderflow {
    public static void main(String[] args) {
        System.out.println( xxxxx + 1);
        System.out.println( xxxxx - 1);
    }
}
```
---

### Exercício 8
> Crie um arquivo chamado `Concatenacao.java`. Complete o código, substituindo a seqüência `xxxxx` com operações de concatenação e parênteses. O programa deve exibir as mensagens "Java123", "Java6", "123Java" e "6Java" nessa ordem. Não é necessário completar todas as seqüências.

```java
public class Concatenacao {
    public static void main(String[] args) {
        System.out.println( xxxxx "Java" xxxxx 1 xxxxx 2 xxxxx 3 xxxxx );
        System.out.println( xxxxx "Java" xxxxx 1 xxxxx 2 xxxxx 3 xxxxx );
        System.out.println( xxxxx 1 xxxxx 2 xxxxx 3 xxxxx "Java" xxxxx );
        System.out.println( xxxxx 1 xxxxx 2 xxxxx 3 xxxxx "Java" xxxxx );
    }
}
```
---

### Exercício 9
> Crie um arquivo chamado `OperadoresDeAtribuicao.java`. Complete o código, substituindo a seqüência `xxxxx` com operações de atribuição. O programa deve exibir os valores 1, 3, 2, 6, 3, 1, 2 e 1 nessa ordem. Não utilize o mesmo operador duas ou mais vezes.

```java
public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int a xxxxx1;
        System.out.println(a);

        a xxxxx 2;
        System.out.println(a);

        a xxxxx 1;
        System.out.println(a);

        a xxxxx 3;
        System.out.println(a);

        a xxxxx 2;
        System.out.println(a);

        a xxxxx 2;
        System.out.println(a);

        a xxxxx;
        System.out.println(a);

        a xxxxx;
        System.out.println(a);
    }
}
```
---

### Exercício 10
> Crie um arquivo chamado `OperadoresRelacionais.java`. Complete o código, substituindo a seqüência `xxxxx` com operações de comparação. O programa deve exibir os valores `false`, `false`, `true`, `true`, `false` e `true` nessa ordem. Não utilize o mesmo operador duas ou mais vezes.

```java
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println(a xxxxx b);
        System.out.println(a xxxxx b);
        System.out.println(a xxxxx b);
        System.out.println(a xxxxx b);
        System.out.println(a xxxxx b);
        System.out.println(a xxxxx b);
    }
}
```

---

### Exercício 11
> Crie um arquivo chamado `OperadoresLogicos.java`. Complete o código, substituindo a seqüência `xxxxx` com operações lógicas. O programa deve exibir os valores `true`, `true`, `false`, `false` e `true` nessa ordem. Não utilize o mesmo operador duas ou mais vezes.

```java
public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a > b xxxxx c < d);
        System.out.println(a > b xxxxx c < d);
        System.out.println(a > b xxxxx c < d);
        System.out.println(a > b xxxxx c < d);
        System.out.println(a > b xxxxx c < d);
    }
}
```

---

### Exercício 12
> Crie um arquivo chamado `OperadorTernario.java`. Complete o código, substituindo a seqüência `xxxxx` com o operador ternário. O programa deve exibir a mensagem `a < b` quando o valor da variável `a` for menor do que o valor da variável `b` e `a >= b` caso contrário.

```java
public class OperadorTernario {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);

        System.out.println(a < b xxxxx );
    }
}
```

---

### Exercício 13
> Crie um arquivo chamado `OperadorNegacao.java`. Complete o código, substituindo a seqüência `xxxxx` com o operador de negação e parênteses. O programa deve exibir os valores `true` e `false` nessa ordem. Não é necessário preencher todas as seqüências.

```java
class OperadorNegacao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(xxxxx a < b xxxxx );
        System.out.println(xxxxx a < b xxxxx );
    }
}
```

---

### Exercício 14
> Crie um arquivo chamado `PrePosIncrementoDecremento.java`. Complete o código, substituindo a seqüência `xxxxx` com os operadores de incremento e decremento. O programa deve exibir os valores 1, 3, 3 e 1 nessa ordem. Não é necessário preencher todas as seqüências.

```java
class PrePosIncrementoDecremento {
    public static void main(String[] args) {
        int a = 1;

        System.out.println( xxxxx a xxxxx );
        System.out.println( xxxxx a xxxxx );
        System.out.println( xxxxx a xxxxx );
        System.out.println( xxxxx a xxxxx );
    }
}
```

---

