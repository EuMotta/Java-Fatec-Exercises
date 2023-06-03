import java.util.List;
import java.util.Scanner;

public class Index {

    private static ProductManager product = new ProductManager();
    List<Product> listaDeProdutos = product.getListaDeProdutos();

    public static void main(String[] args) {
        product.loadProducts(); // carregar os produtos para não sobreescrever
        Scanner leia = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equals("admin") && !opcao.equals("usuario")) {
            System.out.println("+--------------------------+");
            System.out.println("|     Escolha uma opção    |");
            System.out.println("|                          |");
            System.out.println("|     Admin    Usuario     |");
            System.out.println("+--------------------------+");
            System.out.print("Opção: ");
            opcao = leia.next();
        }

        if (opcao.equals("admin")) {
            Admin admin = new Admin();
            admin.showAdmin();
        } else if (opcao.equals("usuario")) {
            User user = new User();
            String userOption = user.showUser();
            while (!userOption.equals("sair")) {
                userOption = user.showUser();
            }
        }
    }
}
