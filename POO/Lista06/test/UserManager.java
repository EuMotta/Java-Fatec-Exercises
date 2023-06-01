import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserManager {

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
        UserData user = new UserData();
        user.setCpf(cpf);
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        user.setMoney(money);

        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(user.getCpf() + ", " + user.getName() + ", " + user.getLastName() + ", " + user.getAge()
                    + ", " + user.getMoney() + "\n");
            writer.close();
            System.out.println("Usuário criado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
