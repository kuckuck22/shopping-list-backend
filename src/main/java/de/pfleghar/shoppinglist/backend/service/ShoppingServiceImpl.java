package de.pfleghar.shoppinglist.backend.service;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;
import de.pfleghar.shoppinglist.backend.persistence.ShoppingPersintence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingPersintence persistenceService;

    @Override
    public List<ShoppingItem> getItems() {
        return persistenceService.getItems();
    }

    @Override
    public void addItem(ShoppingItem item) {
        persistenceService.addItem(item);
    }

    @Override
    public void updateItem(ShoppingItem item) {
        persistenceService.updateItem(item);
    }

    @Override
    public void deleteItem(long id) {
        persistenceService.deleteItem(id);
    }

    @Override
    public void clearShoppingList() {
        persistenceService.deleteAll();
    }
}
