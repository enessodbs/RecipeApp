package com.example.recipeapp.model;

import android.webkit.WebView;

public class Constant {
    int image;
    String title;
    String material;
    String recipe;



    public Constant(int image, String title, String material, String recipe) {
        this.image = image;
        this.title = title;
        this.material = material;
        this.recipe = recipe;

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getMaterial() {
        return material;
    }

    public String getRecipe() {
        return recipe;
    }


}
