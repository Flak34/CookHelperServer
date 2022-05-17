package com.example.controllers;


import com.example.entity.Recipes;
import com.example.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipe")
public class RecipesController {

    @Autowired
    private RecipeRepository recipe;

    @RequestMapping(value = "/getrecipe", method= RequestMethod.GET)
    public Recipes getRecipe(@RequestParam("name") String name){
        return recipe.getRecipe(name);
    }


}
