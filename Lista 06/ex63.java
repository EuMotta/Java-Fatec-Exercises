import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int idade = 0, tempoTrabalho = 0;

        System.out.print("Insira o codigo do funcionario: ");
        int codigo = scan.nextInt();

        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        System.out.print("Insira o ano de ingresso na empresa: ");
        int anoEmpresa = scan.nextInt();

        idade = 2022 - anoNascimento;
        tempoTrabalho = 2022 - anoEmpresa;

        System.out.println("Idade: " + idade);
        System.out.println("Tempo de trabalho: " + tempoTrabalho);

        if(idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)){
            System.out.println("Pode requerer aposentadoria");
        }else{
            System.out.println("Nao pode requerer aposentadoria");
        }
        scan.close();
    }
}
