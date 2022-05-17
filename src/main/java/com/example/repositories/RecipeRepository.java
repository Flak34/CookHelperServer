package com.example.repositories;


import com.example.entity.Recipes;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class RecipeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Recipes getRecipe(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM \"RECIPES\" WHERE \"NAME\"=?", new RecipesMapper(), name);
    }


}
