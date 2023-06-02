import java.util.List;
import java.util.Scanner;

public class User {

    UserManager userManager = new UserManager();
    List<UserData> userList = userManager.loadUsersFromFile();
    private void user() {
        Scanner num = new Scanner(System.in);
        int opcao;
        System.out.println("Deseja editar o usuário existente? (s/n)");
        String escolher = num.next().toLowerCase();
        if (escolher.charAt(0) == 's') {
            userManager.createUser();
        } else {
            userManager.editUser(userList);
        }
        do {
            System.out.println("+--------------------------+");
            System.out.println("|                          |");
            System.out.println("|     Canal do Usuário     |");
            System.out.println("|                          |");
            System.out.println("+--------------------------+");
            System.out.println("O que deseja fazer? ");
            System.out.println("1 - Visualizar produtos ");
            System.out.println("2 - Saldo ");
            System.out.println("3 - Carrinho de produtos ");
            opcao = num.nextInt();
        } while (opcao != 8);
    }

    public void showUser() {
        this.user();
    }

}
