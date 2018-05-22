package de.pfleghar.shoppinglist.backend.persistence;

import de.pfleghar.shoppinglist.backend.domain.ShoppingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingPersistenceImpl implements ShoppingPersintence {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<ShoppingItem> getItems() {
        final String sql = "SELECT * FROM shoppingitem";
        return jdbcTemplate.query(sql, new ShoppingItemRowMapper());
    }

    @Override
    public void addItem(ShoppingItem item) {
        final String sql = "INSERT INTO shoppingitem (name, amount) VALUES (:name, :amount)";
        final SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("name", item.getName())
                .addValue("amount", item.getAmount());
        jdbcTemplate.update(sql, parameterSource);
    }

    @Override
    public void updateItem(ShoppingItem item) {
        final String sql = "UPDATE shoppingitem SET name = :name, amount = :amount " +
                " WHERE id = :id";
        final SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("id", item.getId())
                .addValue("name", item.getName())
                .addValue("amount", item.getAmount());
        jdbcTemplate.update(sql, parameterSource);

    }

    @Override
    public void deleteItem(long id) {
        final String sql = "DELETE FROM shoppingitem WHERE id = :id";
        final SqlParameterSource parameterSource = new MapSqlParameterSource("id", id);
        jdbcTemplate.update(sql, parameterSource);
    }

    @Override
    public void deleteAll() {
        final String sql = "DELETE FROM shoppingitem";
        jdbcTemplate.update(sql, new EmptySqlParameterSource());
    }
}
