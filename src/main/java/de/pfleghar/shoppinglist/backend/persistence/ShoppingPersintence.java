package de.pfleghar.shoppinglist.backend.persistence;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;

import java.util.List;

public interface ShoppingPersintence {

    List<ShoppingItem> getItems();
    void addItem(ShoppingItem item);
    void updateItem(ShoppingItem item);
    void deleteItem(long id);
    void deleteAll();
}
