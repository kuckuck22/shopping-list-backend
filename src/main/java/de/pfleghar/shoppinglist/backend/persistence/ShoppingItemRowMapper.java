package de.pfleghar.shoppinglist.backend.persistence;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ShoppingItemRowMapper implements RowMapper<ShoppingItem> {

    @Override
    public ShoppingItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ShoppingItem(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("amount")
        );
    }
}
