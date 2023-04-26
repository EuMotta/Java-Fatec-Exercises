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
        System.out.println("Digite o preço do produto:");
        double price = num.nextDouble();
        num.nextLine(); // consome o caractere de quebra de linha pendente
        System.out.println("Digite o nome do produto:");
        String name = num.nextLine();
        System.out.println("Digite a descrição do produto:");
        String description = num.nextLine();
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

  public void editProduct() {
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o ID do produto que deseja editar:");
    UUID id = UUID.fromString(num.next());

    boolean found = false;
    for (Product produto : listaDeProdutos) {
      if (produto.getId().equals(id)) {
        found = true;
        System.out.println("Qual atributo você deseja editar? (nome/descrição/preço)");
        String atributo = num.next();
        switch (atributo.toLowerCase()) {
          case "nome":
            System.out.println("Digite o novo nome:");
            produto.setName(num.nextLine());
            System.out.println("Produto atualizado com sucesso!");
            break;

          case "descrição":
            System.out.println("Digite a nova descrição:");
            produto.setDescription(num.next());
            System.out.println("Produto atualizado com sucesso!");
            break;

          case "preço":
            System.out.println("Digite o novo preço:");
            produto.setPrice(num.nextDouble());
            System.out.println("Produto atualizado com sucesso!");
            break;

          default:
            System.out.println("Atributo inválido!");
            break;
        }
        break;
      }
    }
    if (!found) {
      System.out.println("Produto não encontrado!");
    }
  }

  public void showProducts() {
    System.out.println("Produtos no carrinho:");
    for (Product produto : listaDeProdutos) {
      System.out.println("Nome: " + produto.getName());
      System.out.println("Descrição: " + produto.getDescription());
      System.out.println("ID: " + produto.getId());
      System.out.println("Preço: " + produto.getPrice());
      System.out.println("-----------------------");
    }
  }
}
