import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UserManager {
    private List<UserData> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void userShop(List<UserData> userList) {
        Scanner scanner = new Scanner(System.in);
        String cpf;
        UserData userToUpdate = null;

        do {
            System.out.print("Digite o CPF do usuário que deseja utilizar: ");
            cpf = scanner.nextLine();

            for (UserData user : userList) {
                if (user.getCpf().equals(cpf)) {
                    userToUpdate = user;
                    break;
                }
            }

            if (userToUpdate == null) {
                System.out.println("Usuário não encontrado. Digite um CPF válido.");
            }
        } while (userToUpdate == null);

        boolean attributeValid = false;
        do {
            System.out.println("Seja bem vindo(a) " + userToUpdate.getName());
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Visualizar produtos ");
            System.out.println("2 - Comprar produtos ");
            System.out.print("Opção: ");
            int attribute = scanner.nextInt();

            switch (attribute) {
                case 1:
                    try {
                        File file = new File("products.txt");
                        Scanner scan = new Scanner(file);

                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            String[] parts = line.split(", ");

                            if (parts.length >= 5) {
                                String nome = parts[0].substring(6); // Remover "Nome: "
                                String descricao = parts[1].substring(12); // Remover "Descrição: "
                                int numero = Integer.parseInt(parts[3].substring(8)); // Remover "Número: " => converter
                                double preco = Double.parseDouble(parts[2].substring(7)); // Remover "Preço: "

                                System.out.println("Nome: " + nome);
                                System.out.println("Descrição: " + descricao);
                                System.out.println("Número: " + numero);
                                System.out.println("Preço: " + preco);
                                System.out.println("-----------------------");
                            } else {
                                System.out.println("Erro ao ler os dados do produto: " + line);
                            }
                        }

                        scan.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    boolean productFound = false;
                    do {
                        System.out.print("Digite o número do produto que deseja comprar: ");
                        int productNumber = scanner.nextInt();
                        scanner.nextLine();

                        try {
                            File file = new File("products.txt");
                            Scanner scan = new Scanner(file);

                            while (scan.hasNextLine()) {
                                String line = scan.nextLine();
                                String[] parts = line.split(", ");

                                if (parts.length >= 5) {
                                    int numero = Integer.parseInt(parts[3].substring(8));

                                    if (numero == productNumber) {
                                        String nome = parts[0].substring(6);
                                        double preco = Double.parseDouble(parts[2].substring(7));

                                        if (userToUpdate.getMoney() >= preco) {
                                            userToUpdate.setMoney((int) (userToUpdate.getMoney() - preco));
                                            System.out.println("Você comprou o produto: " + nome);
                                            System.out.println("Preço: " + preco);
                                            System.out.println("Dinheiro restante: " + userToUpdate.getMoney());
                                            saveUsersToFile(userList);
                                        } else {
                                            System.out.println("Você não tem dinheiro suficiente.");
                                        }

                                        productFound = true;
                                        break;
                                    }
                                } else {
                                    System.out.println("Erro ao ler o produto: " + line);
                                }
                            }

                            scan.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }

                        if (!productFound) {
                            System.out.println("Produto não encontrado. Digite um número de produto válido.");
                        }
                    } while (!productFound);
                    break;

                case 3:
                    System.out.println("+----------------------------------------+");
                    System.out.println("Nome: " + userToUpdate.getName());
                    System.out.println("Sobrenome: " + userToUpdate.getLastName());
                    System.out.println("Idade: " + userToUpdate.getAge());
                    System.out.println("CPF: " + userToUpdate.getCpf());
                    System.out.println("Dinheiro: " + userToUpdate.getMoney());
                    System.out.println("ID: " + userToUpdate.getId());
                    System.out.println("+----------------------------------------+");
                    return;

                default:
                    System.out.println("Valor inválido, digite novamente.");
                    break;
            }
        } while (!attributeValid);
        saveUsersToFile(userList);
    }

    public void editUser(List<UserData> userList) {
        Scanner scanner = new Scanner(System.in);
        String cpf;
        UserData userToUpdate = null;

        do {
            System.out.println("Digite o CPF do usuário que deseja editar:");
            cpf = scanner.nextLine();

            for (UserData user : userList) {
                if (user.getCpf().equals(cpf)) {
                    userToUpdate = user;
                    break;
                }
            }

            if (userToUpdate == null) {
                System.out.println("Usuário não encontrado. Digite um CPF válido.");
            }
        } while (userToUpdate == null);

        boolean attributeValid = false;
        do {
            System.out.println("Qual atributo você deseja editar? (nome/sobrenome/idade/dinheiro/sair)");
            String attribute = scanner.next();
            scanner.nextLine();

            switch (attribute.toLowerCase()) {
                case "nome":
                    System.out.println("Digite o novo nome:");
                    String newName = scanner.nextLine();
                    userToUpdate.setName(newName);
                    System.out.println("Usuário atualizado com sucesso!");
                    attributeValid = true;
                    break;

                case "sobrenome":
                    System.out.println("Digite o novo sobrenome:");
                    String newLastName = scanner.nextLine();
                    userToUpdate.setLastName(newLastName);
                    System.out.println("Usuário atualizado com sucesso!");
                    attributeValid = true;
                    break;

                case "idade":
                    System.out.println("Digite a nova idade:");
                    int newAge = scanner.nextInt();
                    userToUpdate.setAge(newAge);
                    System.out.println("Usuário atualizado com sucesso!");
                    attributeValid = true;
                    break;

                case "dinheiro":
                    System.out.println("Digite a nova quantidade de dinheiro:");
                    int newMoney = scanner.nextInt();
                    userToUpdate.setMoney(newMoney);
                    System.out.println("Usuário atualizado com sucesso!");
                    attributeValid = true;
                    break;

                case "sair":
                    return;

                default:
                    System.out.println("Valor inválido, digite novamente.");
                    break;
            }
        } while (!attributeValid);
        saveUsersToFile(userList);
    }

    public static List<UserData> loadUsersFromFile() {
        List<UserData> users = new ArrayList<>();

        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");

                String cpf = parts[0];
                String name = parts[1];
                String lastName = parts[2];
                int age = Integer.parseInt(parts[3]);
                int money = Integer.parseInt(parts[4]);
                UUID id = UUID.fromString(parts[5]);

                UserData user = new UserData(cpf, name, lastName, age, money, id);
                users.add(user);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static void saveUsersToFile(List<UserData> users) {
        try {
            FileWriter writer = new FileWriter("users.txt");
            for (UserData user : users) {
                writer.write(user.getCpf() + ", " + user.getName() + ", " + user.getLastName() + ", " + user.getAge()
                        + ", " + user.getMoney() + ", " + user.getId() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserData getUserByName(String name) {
        for (UserData user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public void createUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("+--------------------------+");
        System.out.println("|    Criação de usuário    |");
        System.out.println("+--------------------------+");
    
        String cpf;
        do {
            System.out.print("Informe o CPF (de 6 até 12 dígitos): ");
            cpf = input.nextLine();
            if (cpf.length() > 12 || cpf.length() < 6) {
                System.out.println("+----------- CPF Inválido! -----------+");
            }
        } while (cpf.length() > 12 || cpf.length() < 6);
    
        String name;
        do {
            System.out.print("Informe o Nome (de 2 a 19 dígitos): ");
            name = input.nextLine();
            if (name.length() > 19 || name.length() < 2) {
                System.out.println("+----------- Nome Inválido! -----------+");
            }
        } while (name.length() > 19 || name.length() < 2);
    
        String lastName;
        do {
            System.out.print("Informe o Sobrenome (de 3 a 30 dígitos): ");
            lastName = input.nextLine();
            if (lastName.length() > 30 || lastName.length() < 3) {
                System.out.println("+----------- Sobrenome Inválido! -----------+");
            }
        } while (lastName.length() > 30 || lastName.length() < 3);
    
        int age;
        do {
            System.out.print("Informe a idade ( Obrigatório +18 anos ): ");
            age = input.nextInt();
            if (age <= 18) {
                System.out.println("+----------- Idade Inválida! -----------+");
            }
        } while (age <= 18);
    
        int money;
        do {
            System.out.print("Informe a quantidade de dinheiro: ");
            money = input.nextInt();
            if (money < 0) {
                System.out.println("O valor do dinheiro deve ser positivo. Tente novamente.");
            }
        } while (money < 0);
    
        input.nextLine();
        UserData user = new UserData(cpf, name, lastName, age, money, UUID.randomUUID());
    
        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(user.getCpf() + ", " + user.getName() + ", " + user.getLastName() + ", " + user.getAge()
                    + ", " + user.getMoney() + ", " + user.getId() + "\n");
            writer.close();
            System.out.println("Usuário criado com sucesso!");
            System.out.println("-----------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showProducts(List<UserData> userList) {
        System.out.println("Usuários registrados:");
        for (UserData user : userList) {
            System.out.println("Nome: " + user.getName());
            System.out.println("Sobrenome: " + user.getLastName());
            System.out.println("CPF: " + user.getCpf());
            System.out.println("ID: " + user.getId());
            System.out.println("Dinheiro: " + user.getMoney());
            System.out.println("-----------------------");
        }
    }
}
