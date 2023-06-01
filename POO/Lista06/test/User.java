import java.util.Scanner;

public class User {

    UserManager userManager = new UserManager();

    private void admin() {
        Scanner num = new Scanner(System.in);
        int opcao;
        System.out.println("Deseja criar um usuário ou entrar em um existente?");
        System.out.println("C - Criar");
        System.out.println("E - Entrar");
        String escolher = num.next().toLowerCase();
        if (escolher.charAt(0) == 'c') {
            userManager.createUser();
        }
        do {
            System.out.println("+--------------------------+");
            System.out.println("|                          |");
            System.out.println("|   Comércio de produtos   |");
            System.out.println("|                          |");
            System.out.println("+--------------------------+");
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Visualizar produtos ");
            System.out.println("2 - Saldo ");
            System.out.println("3 - Carrinho de produtos ");
            opcao = num.nextInt();
        } while (opcao != 8);
    }

    public void showAdmin() {
        this.admin();
    }

}
