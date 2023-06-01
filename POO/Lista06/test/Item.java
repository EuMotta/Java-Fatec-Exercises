import java.util.UUID;

public class Item {
    private String name;
    private String description;
    private UUID id;

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

    public void printDetails() {
        System.out.println("Nome: " + this.name + ", Descrição: " + this.description + ", ID: " + this.id);
    }
}
