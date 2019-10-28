package com.example.listviewimages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListData extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

//        textView=findViewById(R.id.display_text_view);
//        imageView=findViewById(R.id.display_image_view);
//
//        Intent intent = getIntent();
//
//        textView.setText(intent.getStringExtra("name"));
//        imageView.setImageResource(intent.getIntExtra("image",0));

    }
}
