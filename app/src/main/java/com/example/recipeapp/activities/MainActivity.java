package com.example.recipeapp.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipeapp.R;
import com.example.recipeapp.adapter.CustomAdapter;
import com.example.recipeapp.model.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    int condition;
    Intent intent;
    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant> constantList;
    Constant constant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView = (GridView)findViewById(R.id.gridView);
        constantList = new ArrayList<>();

        intent = getIntent();
        condition=intent.getIntExtra("condition",00);

        customAdapter = new CustomAdapter(MainActivity.this,constantList,condition);
        gridView.setAdapter(customAdapter);

        if (condition==1)
        {
            avrupaLezzetleri();
        } else if (condition==2)
        {
            asyaLezzetleri();
        } else if (condition==3)
        {
            amerikaLezzetleri();
        } else if (condition==4) {
           makarnalar();
        } else if (condition==5) {
            tatlılar();
        } else if (condition==6) {
            etler();
        } else if (condition==7) {
            corbalar();
        } else if (condition==8) {
            hamurisi();
        } else if (condition==9) {
            sebzeler();
        }


    }

    private void etler() {
    }

    private void sebzeler(){

    }
    private void hamurisi() {
    }
    private void corbalar() {
    }

    private void salatalar() {
    }

    private void tatlılar() {
    }

    private void makarnalar() {
    }

    private void avrupaLezzetleri() {

        constantList.add(new Constant(R.drawable.avrupa1,getResources().getString(R.string.paelle),getResources().getString(R.string.paellamalzeme),getResources().getString(R.string.paellatarif)));
        constantList.add(new Constant(R.drawable.avrupa2,getResources().getString(R.string.bouillabaisse),getResources().getString(R.string.borscorbasimalzeme),getResources().getString(R.string.borscorbasitarifi)));
        constantList.add(new Constant(R.drawable.avrupa4,getResources().getString(R.string.pizza),getResources().getString(R.string.pizzamalzeme),getResources().getString(R.string.pizzatarif)));
        constantList.add(new Constant(R.drawable.avrupa5,getResources().getString(R.string.escargot),getResources().getString(R.string.escargotmalzeme),getResources().getString(R.string.escargottarif)));
        constantList.add(new Constant(R.drawable.avrupa6,getResources().getString(R.string.risotto),getResources().getString(R.string.risottomalzeme),getResources().getString(R.string.risottotarif)));
        constantList.add(new Constant(R.drawable.avrupa7,getResources().getString(R.string.bratwursts),getResources().getString(R.string.bratwurstsmalzeme),getResources().getString(R.string.bratwurststarif)));
        constantList.add(new Constant(R.drawable.avrupa8,getResources().getString(R.string.borscorbasi),getResources().getString(R.string.borscorbasimalzeme),getResources().getString(R.string.borscorbasitarifi)));
        constantList.add(new Constant(R.drawable.avrupa9,getResources().getString(R.string.cannoli),getResources().getString(R.string.cannolimalzeme),getResources().getString(R.string.cannolitarif)));
        constantList.add(new Constant(R.drawable.avrupa12,getResources().getString(R.string.arancini),getResources().getString(R.string.arancinimalzeme),getResources().getString(R.string.arancinitarif)));
        constantList.add(new Constant(R.drawable.avrupa14,getResources().getString(R.string.pesto),getResources().getString(R.string.pestomalzeme),getResources().getString(R.string.pestotarif)));
        constantList.add(new Constant(R.drawable.avrupa15,getResources().getString(R.string.kalamar),getResources().getString(R.string.kalamarmalzeme),getResources().getString(R.string.kalamartarif)));
        constantList.add(new Constant(R.drawable.avrupa16,getResources().getString(R.string.italyanPisi),getResources().getString(R.string.italyanPisimalzeme),getResources().getString(R.string.italyanPisitarif)));
        constantList.add(new Constant(R.drawable.avrupa18,getResources().getString(R.string.Stracciatella),getResources().getString(R.string.Stracciatellamalzeme),getResources().getString(R.string.Stracciatellatarif)));

    }

    private void asyaLezzetleri(){

    }

    private void amerikaLezzetleri(){

    }
}