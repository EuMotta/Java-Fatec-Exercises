import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ProductManager {
  private static List<Product> listaDeProdutos = new ArrayList<>();
  private int i = 0;

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
        produto.setNumber(++i);
        System.out.println("Produto adicionado com sucesso!");

      } else if (resposta.equalsIgnoreCase("n")) {
        break;
      }
    } while (true);
  }

  public void editProduct() {
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o número do produto que deseja editar:");
    int number = num.nextInt();

    boolean found = false;
    UUID id = null;
    for (Product produto : listaDeProdutos) {
      if (produto.getNumber() == number) {
        found = true;
        id = produto.getId();
        break;
      }
    }

    if (!found) {
      System.out.println("Produto não encontrado.");
      return;
    }

    for (Product produto : listaDeProdutos) {
      if (produto.getId().equals(id)) {
        boolean atributoValido = false;
        do {
          System.out.println("Qual atributo você deseja editar? (nome/descrição/preço/sair)");
          String atributo = num.next();
          switch (atributo.toLowerCase()) {
            
            case "nome":
              System.out.println("Digite o novo nome:");
              num.nextLine();
              produto.setName(num.nextLine());
              System.out.println("Produto atualizado com sucesso!");
              atributoValido = true;
              break;
    
            case "descrição":
              System.out.println("Digite a nova descrição:");
              produto.setDescription(num.next());
              System.out.println("Produto atualizado com sucesso!");
              atributoValido = true;
              break;
    
            case "preço":
              System.out.println("Digite o novo preço:");
              produto.setPrice(num.nextDouble());
              System.out.println("Produto atualizado com sucesso!");
              atributoValido = true;
              break;
    
            case "sair":
              return;
    
            default:
              System.out.println("Valor invalido, digite novamente.");
              break;
          }
        } while (!atributoValido);
        break;
      }
    }
    if (!found) {
      System.out.println("Produto não encontrado.");
    }
  }

  public void showProducts() {
    System.out.println("Produtos no carrinho:");
    for (Product produto : listaDeProdutos) {
      System.out.println("Nome: " + produto.getName());
      System.out.println("Descrição: " + produto.getDescription());
      System.out.println("Numero: " + produto.getNumber());
      System.out.println("ID: " + produto.getId());
      System.out.println("Preço: " + produto.getPrice());
      System.out.println("-----------------------");
    }
  }
}
