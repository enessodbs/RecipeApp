package com.example.recipeapp.activities;

import static com.example.recipeapp.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.recipeapp.R;

public class FullView extends AppCompatActivity {

     Intent intent;
     String title;
     String material;
     String recipe;
     int image;
     int condition;



     TextView titleTxt,materialTitle,materialTxt,recipeTitle,recipeTxt,;
     ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_full_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        titleTxt = (TextView)findViewById(R.id.titleFullView);
        materialTitle = (TextView)findViewById(R.id.materialTitle);
        materialTxt = (TextView)findViewById(R.id.materialTxt);
        recipeTitle = (TextView)findViewById(R.id.recipeTitle);
        recipeTxt = (TextView)findViewById(R.id.recipeTxt);
        imageView = (ImageView)findViewById(R.id.thumbnailFullView);



        intent = getIntent();

        image = intent.getIntExtra("image",00);
        title = intent.getStringExtra("title");
        material = intent.getStringExtra("material");
        recipe = intent.getStringExtra("recipe");


        condition = intent.getIntExtra("condition",00);

        Toast.makeText(FullView.this, "title", Toast.LENGTH_SHORT).show();

        materialTitle.setText("Malzemeler");
        recipeTitle.setText("Hazırlanış");



        imageView.setImageResource(image);
        titleTxt.setText(title);
        materialTxt.setText(material);
        recipeTxt.setText(recipe);

        



    }


}