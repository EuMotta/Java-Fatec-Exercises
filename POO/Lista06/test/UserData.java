import java.util.UUID;

public class UserData {
  private String name;
  private String lastName;
  private int age;
  private String cpf;
  private int money;
  private UUID id;

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserData(String cpf, String name, String lastName, int age, int money, UUID id) {
    this.cpf = cpf;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.money = money;
    this.id = id;
  }

  public int getMoney() {
    return this.money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
