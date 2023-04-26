import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ProductManager {
  private static List<Product> listaDeProdutos = new ArrayList<>();
  
  public List<Product> getListaDeProdutos() {
    return listaDeProdutos;
  }
  public void addProduct() {
    Scanner num = new Scanner(System.in);
    do {
      System.out.println("Deseja adicionar um produto ao carrinho? (s/n)");
      String resposta = num.next();
      if (resposta.equalsIgnoreCase("s")) {
        System.out.println("Digite o nome do produto:");
        String name = num.nextLine();
        System.out.println("Digite a descrição do produto:");
        String description = num.nextLine();
        System.out.println("Digite o preço do produto:");
        double price = num.nextDouble();
        Product produto = new Product();
        produto.setName(name);
        produto.setDescription(description);
        produto.setId(UUID.randomUUID());
        produto.setPrice(price);
        listaDeProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");

      } else if (resposta.equalsIgnoreCase("n")) {

        break;
      }

    } while (true);
  }
}
