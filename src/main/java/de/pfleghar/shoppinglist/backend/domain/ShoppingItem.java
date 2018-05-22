package de.pfleghar.shoppinglist.backend.domain;

public class ShoppingItem {

    private String name;
    private String amount;
    private long id;

    public ShoppingItem() {

    }

    public ShoppingItem(long id, String name, String amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
