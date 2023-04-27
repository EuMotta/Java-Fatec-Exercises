import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ProductManager {
  /* Criar lista de produtos */
  private static List<Product> listaDeProdutos = new ArrayList<>();
  private int i = 0;

  public List<Product> getListaDeProdutos() {
    return listaDeProdutos;
  }

  /* Adicionar produtos Start */
  public void addProduct() {
    Scanner num = new Scanner(System.in);
    int i = 0;
    try {
      File file = new File("counter.txt");
      if (file.exists()) {
        Scanner scanner = new Scanner(file);
        if (scanner.hasNextInt()) {
          i = scanner.nextInt();
        }
        scanner.close();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
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
        try {
          FileWriter writer = new FileWriter("counter.txt");
          writer.write(String.valueOf(i));
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      }
    } while (true);
    saveProducts();
  }
  /* Adicionar produtos End */


public void loadProducts() {
    try {
        File file = new File("products.txt");
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(", ");
            UUID id = UUID.fromString(parts[4].split(": ")[1]);
            String name = parts[1].split(": ")[1];
            String description = parts[2].split(": ")[1];
            double price = Double.parseDouble(parts[3].split(": ")[1]);
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setNumber(++i);
            listaDeProdutos.add(product);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

  /* Deletar produtos Start */
  public void deleteProduct() {
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o numero do produto:");
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
      if (produto.getNumber() == number) {
        System.out.println("Nome: " + produto.getName());
        System.out.println("Descrição: " + produto.getDescription());
        System.out.println("Numero: " + produto.getNumber());
        System.out.println("ID: " + produto.getId());
        System.out.println("Preço: " + produto.getPrice());
        System.out.println("-----------------------");
      }
    }
    while (true) {
      System.out.println("Deseja realmente excluir o produto? (s/n)");
      String delete = num.next().toLowerCase();
      if (delete.charAt(0) == 's') {
        for (int i = 0; i < listaDeProdutos.size(); i++) {
          if (listaDeProdutos.get(i).getId().equals(id)) {
            listaDeProdutos.remove(i);
            System.out.println("Produto excluído com sucesso!");
            return;
          }
        }

      } else if (delete.charAt(0) == 'n') {
        return;
      }
      if (delete.charAt(0) == 's') {
        for (int i = 0; i < listaDeProdutos.size(); i++) {
          if (listaDeProdutos.get(i).getId().equals(id)) {
            listaDeProdutos.remove(i);
            System.out.println("Produto excluído com sucesso!");
            saveProducts();
            return;
          }
        }
      } else if (delete.charAt(0) == 'n') {
        return;
      } else {
        System.out.println("Atributo invalido.");
      }
      num.close();
    }

  }
  /* Deletar produtos End */

  /* Editar produtos Start */
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

            case "descricao":
              System.out.println("Digite a nova descrição:");
              produto.setDescription(num.next());
              System.out.println("Produto atualizado com sucesso!");
              atributoValido = true;
              break;

            case "preco":
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
    saveProducts();
  }
  /* Editar produtos End */

  /* Mostrar produtos Start */
  public void showProducts() {
    System.out.println("Produtos registrados:");
    for (Product produto : listaDeProdutos) {
      System.out.println("Nome: " + produto.getName());
      System.out.println("Descrição: " + produto.getDescription());
      System.out.println("Numero: " + produto.getNumber());
      System.out.println("ID: " + produto.getId());
      System.out.println("Preço: " + produto.getPrice());
      System.out.println("-----------------------");
    }
  }

  /* Mostrar produtos End */
  public void showProductsFromFile() {
    try {
      File file = new File("products.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public void saveProducts() {
    try {
      FileWriter writer = new FileWriter("products.txt");
      for (Product product : listaDeProdutos) {
        writer.write(product.toString() + "\n");
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
