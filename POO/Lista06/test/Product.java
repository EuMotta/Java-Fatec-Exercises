public class Product extends Item {
    private double price;
    private int number;
  
    public int getNumber() {
        return this.number;
    }
  
    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return this.price;
    }
  
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ", Descrição: " + getDescription() + ", Preço: " + price + ", Numero: " + number + ", ID: " + getId();
    }
}
