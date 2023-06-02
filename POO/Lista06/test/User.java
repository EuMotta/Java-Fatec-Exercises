import java.util.List;
import java.util.Scanner;

public class User {

    UserManager userManager = new UserManager();
    List<UserData> userList = userManager.loadUsersFromFile();
    private void user() {
        Scanner num = new Scanner(System.in);
        int opcao;
        System.out.println("Deseja criar, editar ou comprar com o usuário? (c/e/x)");
        System.out.print("Opção: ");
        String escolher = num.next().toLowerCase();
        if (escolher.charAt(0) == 's') {
            userManager.createUser();
        } if(escolher.charAt(0) == 'e') {
            userManager.editUser(userList);
        }if(escolher.charAt(0) == 'x') {
            userManager.userShop(userList);
        }else {
            System.out.println("|---- Opção inválida, digite novamente. ----|");
            System.out.println();
            return;
        }
    }

    public void showUser() {
        this.user();
    }

}
