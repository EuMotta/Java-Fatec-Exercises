import java.util.List;
import java.util.Scanner;

public class Index {

  private static ProductManager product = new ProductManager();
  List<Product> listaDeProdutos = product.getListaDeProdutos();

  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("admin");
    System.out.println("usuario");
    String opcao = leia.next();
    if (opcao.equals("admin")) {
      Admin admin = new Admin();
      admin.showAdmin();
    }if (opcao.equals("usuario")) {
      System.out.println("em construção");
    }
  }

}
