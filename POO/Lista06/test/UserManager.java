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

        System.out.println("Informe o CPF:");
        String cpf = input.nextLine();
        System.out.println("Informe o nome:");
        String name = input.nextLine();

        System.out.println("Informe o sobrenome:");
        String lastName = input.nextLine();

        System.out.println("Informe a idade:");
        int age = input.nextInt();

        System.out.println("Informe a quantidade de dinheiro:");
        int money = input.nextInt();

        input.nextLine();
        UserData user = new UserData(cpf, name, lastName, age, money, UUID.randomUUID());

        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(user.getCpf() + ", " + user.getName() + ", " + user.getLastName() + ", " + user.getAge()
                    + ", " + user.getMoney() + ", " + user.getId() + "\n");
            writer.close();
            System.out.println("Usuário criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
