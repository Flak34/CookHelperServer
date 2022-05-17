package com.example.repositories;

import com.example.entity.Recipes;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipesMapper implements RowMapper<Recipes> {
    public Recipes mapRow(ResultSet rs, int rowNum) throws SQLException {
        Recipes recipe = new Recipes();
        recipe.setName(rs.getString("name"));
        recipe.setCuisine(rs.getString("cuisine"));
        return recipe;
    }
}
