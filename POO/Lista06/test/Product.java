import java.util.UUID;
public class Product{
  private String name;
  private String description;
  private UUID id;
  private double price;
  private int number;

  public int getNumber() {
  	return this.number;
  }
  public void setNumber(int number) {
  	this.number = number;
  }


  public String getName() {
  	return this.name;
  }
  public void setName(String name) {
  	this.name = name;
  }


  public String getDescription() {
  	return this.description;
  }
  public void setDescription(String description) {
  	this.description = description;
  }


  public UUID getId() {
  	return this.id;
  }
  public void setId(UUID id) {
  	this.id = id;
  }


  public double getPrice() {
  	return this.price;
  }
  public void setPrice(double price) {
  	this.price = price;
  }

  @Override
public String toString() {
    return "Nome: " + this.name + ", Descrição: " + this.description + ", Preço: " + this.price + ", Numero: " + this.number+ ", ID: " + this.id;
}


}