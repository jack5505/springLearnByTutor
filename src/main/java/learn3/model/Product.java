package learn3.model;

public class Product {
    private Long id;
    private String names;
    private Long price;

    public Product(Long id, String names, Long price) {

        this.id = id;
        this.names = names;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
