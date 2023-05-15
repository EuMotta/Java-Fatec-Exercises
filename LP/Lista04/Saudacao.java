import java.util.Scanner;
import java.util.Random;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hora;
        System.out.println("Deseja informar a hora manualmente ou gerar aleatoriamente? (Digite 'm' para manualmente ou 'a' para aleatoriamente)");
        String opcao = scanner.nextLine();
        if (opcao.equals("m")) {
            System.out.println("Digite a hora (0-23):");
            hora = scanner.nextInt();
            while (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Digite novamente:");
                hora = scanner.nextInt();
            }
        } else {
            hora = random.nextInt(24);
            System.out.println(hora);
        }
        if (hora >= 0 && hora <= 6) {
            System.out.println("Zzzzz");
        } else if (hora >= 7 && hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}

/* 
### Exercício 1
> Crie um arquivo chamado `AprovadoReprovadoRandom.java`. Gere um número aleatório com valores entre 0 e 10 (inclusos) e atribua a variável `nota`. O programa deve exibir a mensagem `REPROVADO` quando a nota do aluno for menor do que 6 ou `APROVADO` caso contrário.

### Exercício 2
> Crie um arquivo chamado `AprovadoReprovado.java`. Solicite ao usuário que digite o valor para a variável `nota`. O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0 até 10 (inclusos), exibir a mensagem `VALOR INVALIDO` e finalizar o programa. Caso o valor digitado seja válido, exibir a mensagem `REPROVADO` quando a nota do aluno for menor do que 6 ou `APROVADO` caso contrário.

### Exercício 3
> Crie um arquivo chamado `VerificaValorProdutoRandom.java`. Gere dois números aleatórios entre 1 e 1000 (inclusos), atribuindo as variáveis `precoProduto1` e `precoProduto2`. O programa deve exibir a mensagem `O produto 1 é o mais barato` quando o preço do primeiro produto for menor. Caso contrário, se o preço do segundo produto for menor, a mensagem `O produto 2 é o mais barato` deve ser exibida. Caso contrário, a mensagem `Os preços dos dois produtos são iguais` é que deve ser exibida.

### Exercício 4
> Crie um arquivo chamado `VerificaValorProduto.java`. Solicite ao usuário que digite os valores para as variáveis `precoProduto1` e `precoProduto2`. O programa deve testar o valor digitado pelo usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a mensagem `VALOR INVALIDO` e finalizar o programa. Caso os valores digitados sejam válidos, exibir a mensagem `O produto 1 é o mais barato` quando o preço do primeiro produto for menor. Caso contrário, se o preço do segundo produto for menor, a mensagem `O produto 2 é o mais barato` deve ser exibida. Caso contrário, a mensagem `Os preços dos dois produtos são iguais` é que deve ser exibida.

### Exercício 5
> Crie um arquivo chamado `ADivisivelPorBRandom.java`. Implemente um programa em Java que guarde dois valores numéricos inteiros: `a` e `b`, gerados aleatoriamente, sendo `a` de 0 até 1000 (inclusos) e `b` de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.

### Exercício 6
> Crie um arquivo chamado `ADivisivelPorB.java`. Implemente um programa em Java que guarde dois valores numéricos inteiros: `a` e `b`, informados pelo usuário, sendo `a` de 0 até 1000 (inclusos) e `b` de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos. Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário. Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.

### Exercício 7
> Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11], Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo
 */