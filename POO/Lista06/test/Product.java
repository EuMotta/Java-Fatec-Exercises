import java.util.UUID;
public class Product{
  private String name;
  private String description;
  private UUID id;
  private double price;

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


}