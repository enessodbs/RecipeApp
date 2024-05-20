package com.example.recipeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.recipeapp.R;
import com.example.recipeapp.activities.FullView;
import com.example.recipeapp.model.Constant;
import java.util.List;
public class CustomAdapter extends BaseAdapter {
    Context context;
    int condition;
    List<Constant> constantList;

    public  CustomAdapter(Context context, List<Constant> constantList, int condition) {
        this.context = context;
        this.constantList = constantList;
        this.condition = condition;
    }

    public void CustomAdapter(Context context,int condition){
        this.condition=condition;
        this.context=context;
    }

    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);


        final String title = constantList.get(i).getTitle();
        final String material = constantList.get(i).getMaterial();
        final String recipe = constantList.get(i).getRecipe();
        final int image = constantList.get(i).getImage();


        ImageView imageView = (ImageView)view.findViewById(R.id.thumbnail);
        TextView textView = (TextView)view.findViewById(R.id.title);
        CardView cardView = (CardView)view.findViewById(R.id.cardView);

        imageView.setImageResource(image);
        textView.setText(title);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(context, FullView.class);


                intent.putExtra("image",image);
                intent.putExtra("title",title);
                intent.putExtra("material",material);
                intent.putExtra("recipe",recipe);
                intent.putExtra("condition",condition);

                context.startActivity(intent);

            }
        });

        return view;
    }
}
