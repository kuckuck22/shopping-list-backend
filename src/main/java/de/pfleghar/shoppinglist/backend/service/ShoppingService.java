package de.pfleghar.shoppinglist.backend.service;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;

import java.util.List;

public interface ShoppingService {

    List<ShoppingItem> getItems();

    void addItem(ShoppingItem item);

    void updateItem(ShoppingItem item);

    void deleteItem(long id);

    void clearShoppingList();
}
