package com.example.recipeapp.activities;

import static com.example.recipeapp.R.*;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipeapp.R;

import java.util.ArrayList;
import java.util.List;

public class DashBoard extends AppCompatActivity {

    List<SlideModel> slideModelList;
    List<SlideModel> slideModelList2;
    List<SlideModel> slideModelList3;
    List<SlideModel> slideModelList4;
    List<SlideModel> slideModelList5;
    List<SlideModel> slideModelList6;
    List<SlideModel> slideModelList7;
    ImageSlider imageSlider1,imageSlider2,imageSlider3,imageSlider4,imageSlider5,imageSlider6,imageSlider7;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }

        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dash_board);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageSlider1 = (ImageSlider)findViewById(R.id.main_slider);
        imageSlider2 = (ImageSlider)findViewById(R.id.main_popular_slider1);
        imageSlider3 = (ImageSlider)findViewById(R.id.main_popular_slider2);
        imageSlider4 = (ImageSlider)findViewById(R.id.main_popular_slider3);
        imageSlider5 = (ImageSlider)findViewById(R.id.farkli_lezzetler1);
        imageSlider6 = (ImageSlider)findViewById(R.id.farkli_lezzetler2);
        imageSlider7 = (ImageSlider)findViewById(R.id.farkli_lezzetler3);

        addMainImages();
    }

    void addMainImages(){
        slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.spagetti2,"Fırında Spagetti",ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.baklava1,"Baklava", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.manti1,"Mantı", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.sarma1,"Sarma", ScaleTypes.CENTER_CROP));
        imageSlider1.setImageList(slideModelList,ScaleTypes.FIT);

        slideModelList2 = new ArrayList<>();
        slideModelList2.add(new SlideModel(R.drawable.spagetti1,"Fırında Kıymalı Spagetti",ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.spagetti2,"Fırında Kıymalı Spagetti",ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.spagetti3,"Fırında Kıymalı Spagetti",ScaleTypes.CENTER_CROP));
        imageSlider2.setImageList(slideModelList2,ScaleTypes.FIT);

        slideModelList3 = new ArrayList<>();
        slideModelList3.add(new SlideModel(R.drawable.kurabiye2,"Çikolata Fıstıklı Kurabiye",ScaleTypes.CENTER_CROP));
        slideModelList3.add(new SlideModel(R.drawable.kurabiye1,"Çikolata Fıstıklı Kurabiye",ScaleTypes.CENTER_CROP));
        slideModelList3.add(new SlideModel(R.drawable.kurabiye3,"Çikolata Fıstıklı Kurabiye",ScaleTypes.CENTER_CROP));
        imageSlider3.setImageList(slideModelList3,ScaleTypes.FIT);

        slideModelList4 = new ArrayList<>();
        slideModelList4.add(new SlideModel(R.drawable.falafel1,"Falafel",ScaleTypes.CENTER_CROP));
        slideModelList4.add(new SlideModel(R.drawable.falafel2,"Falafel",ScaleTypes.CENTER_CROP));
        slideModelList4.add(new SlideModel(R.drawable.falafel3,"Falafel",ScaleTypes.CENTER_CROP));
        imageSlider4.setImageList(slideModelList4,ScaleTypes.FIT);

        slideModelList5 = new ArrayList<>();
        slideModelList5.add(new SlideModel(R.drawable.avrupa1,"Paella, İspanya",ScaleTypes.CENTER_CROP));
        slideModelList5.add(new SlideModel(R.drawable.avrupa2,"Bouillabaisse, Fransa",ScaleTypes.CENTER_CROP));
        slideModelList5.add(new SlideModel(R.drawable.avrupa3,"Choucroute Garnie, Fransa",ScaleTypes.CENTER_CROP));
        imageSlider5.setImageList(slideModelList5,ScaleTypes.FIT);

        slideModelList6 = new ArrayList<>();
        slideModelList6.add(new SlideModel(R.drawable.asya1,"Sushi, Japonya",ScaleTypes.CENTER_CROP));
        slideModelList6.add(new SlideModel(R.drawable.asya2,"Ramen, Japonya",ScaleTypes.CENTER_CROP));
        slideModelList6.add(new SlideModel(R.drawable.asya3,"Pekin Ördeği, Çin",ScaleTypes.CENTER_CROP));
        imageSlider6.setImageList(slideModelList6,ScaleTypes.FIT);

        slideModelList7 = new ArrayList<>();
        slideModelList7.add(new SlideModel(R.drawable.amerika1,"Pot Roast, Amerika",ScaleTypes.CENTER_CROP));
        slideModelList7.add(new SlideModel(R.drawable.amerika2,"Deep Dish Pizza, Amerika",ScaleTypes.CENTER_CROP));
        slideModelList7.add(new SlideModel(R.drawable.amerika3,"Mac And Cheese, Amerika",ScaleTypes.CENTER_CROP));
        imageSlider7.setImageList(slideModelList7,ScaleTypes.FIT);
    }
    public void ViewAll(View view){
        Intent intent = new Intent(DashBoard.this, MainActivity.class);

        int id = view.getId();

        if (id == R.id.avrupaLezzetleri){
            intent.putExtra("condition",1);
        } else if (id == R.id.asyaLezzetleri) {
            intent.putExtra("condition",2);
        } else if (id == R.id.amerikaLezzetleri) {
            intent.putExtra("condition",3);
        }else if(id == R.id.spagettivemakarna){
            intent.putExtra("condition",4);
        }else if(id == R.id.kurabiyeler){
            intent.putExtra("condition",5);
        }else if(id == R.id.salatalar){
            intent.putExtra("condition",6);
        }

        startActivity(intent);
    }
}