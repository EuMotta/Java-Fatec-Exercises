import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Index {
  private static List<Carrinho> listaDeProdutos = new ArrayList<>();

  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);

    int opcao;
    do {
      System.out.println("Escolha uma opção: ");
      opcao = num.nextInt();
      switch (opcao) {
        /* Adicionar produtos */
        case 1:
          do {
            System.out.println("Deseja adicionar um produto ao carrinho? (s/n)");
            String resposta = num.next();
            if (resposta.equalsIgnoreCase("s")) {
              Carrinho produto = new Carrinho();
              System.out.println("Digite o nome do produto:");
              produto.setName(num.next());
              System.out.println("Digite a descrição do produto:");
              produto.setDescription(num.next());
              produto.setId(UUID.randomUUID());
              System.out.println("Digite o preço do produto:");
              produto.setPrice(num.nextDouble());
              listaDeProdutos.add(produto);
            } else if (resposta.equalsIgnoreCase("n")) {
              break;
            }
          } while (true);
          break;

        /* Exibir produtos */
        case 2:
          Index index = new Index();
          index.showProducts();
          break;
        case 3: 
        System.out.println("Digite o ID do produto que deseja editar:");
        UUID id = UUID.fromString(num.next());

        boolean found = false;
        for (Carrinho produto : listaDeProdutos) {
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
        break;
        default:
          break;
      }
    } while (opcao != 4);
    num.close();
  }

  public void showProducts() {
    System.out.println("Produtos no carrinho:");
    for (Carrinho produto : listaDeProdutos) {
      System.out.println("Nome: " + produto.getName());
      System.out.println("Descrição: " + produto.getDescription());
      System.out.println("ID: " + produto.getId());
      System.out.println("Preço: " + produto.getPrice());
      System.out.println("-----------------------");
    }
  }
}
