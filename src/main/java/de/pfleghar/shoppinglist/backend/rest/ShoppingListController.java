package de.pfleghar.shoppinglist.backend.rest;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;
import de.pfleghar.shoppinglist.backend.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class ShoppingListController {

    @Autowired
    private ShoppingService shoppingService;

    @RequestMapping("/getItems")
    public @ResponseBody List<ShoppingItem> getShoppingItems() {
        return shoppingService.getItems();
    }

    @RequestMapping(value = "/addItem", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    public void addShoppingItems(@RequestBody ShoppingItem item) {
        shoppingService.addItem(item);
    }

    @RequestMapping(value="/updateItem", method = RequestMethod.POST)
    public void updateItem(@ RequestBody ShoppingItem item) {
        shoppingService.updateItem(item);
    }

    @RequestMapping(value = "/removeItem", method = RequestMethod.DELETE)
    public void removeItem(@RequestParam(value="id") long itemId) {
        shoppingService.deleteItem(itemId);
    }

    @RequestMapping(value = "/clearShoppingList", method = RequestMethod.DELETE)
    public void clearShoppingList() {
        shoppingService.clearShoppingList();
    }
}
