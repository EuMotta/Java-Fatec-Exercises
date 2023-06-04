import java.util.List;
import java.util.Scanner;

public class User {

    UserManager userManager = new UserManager();
    List<UserData> userList = userManager.loadUsersFromFile();

    private String user() {
        Scanner num = new Scanner(System.in);
        int opcao;
        System.out.println("Escolha uma opção: ");
        System.out.println("C - Criar");
        System.out.println("E - Editar: ");
        System.out.println("X - Comprar: ");
        System.out.println("S - Sair: ");
        System.out.print("Opção: ");
        String escolher = num.next().toLowerCase();
        System.out.println("-----------------------\n");
        if (escolher.charAt(0) == 'c') {
            userManager.createUser();
        }
        if (escolher.charAt(0) == 'e') {
            userManager.editUser(userList);
        }
        if (escolher.charAt(0) == 'x') {
            userManager.userShop(userList);
        }
        if (escolher.charAt(0) == 's') {
            return "sair";
        } else if(escolher.charAt(0) != 's' && escolher.charAt(0) != 'x' && escolher.charAt(0) != 'c' && escolher.charAt(0) != 's') {
            System.out.println("|---- Opção inválida, digite novamente. ----|");
            System.out.println();
            return "invalida";
        }else return "invalida";
    }

    public String showUser() {
        return this.user();
    }

}
