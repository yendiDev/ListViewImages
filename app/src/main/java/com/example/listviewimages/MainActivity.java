package com.example.listviewimages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int[] images={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,
            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7,
            R.drawable.pic8, R.drawable.pic9, R.drawable.pic10};

    public String[] names={"hellow","hellow", "hellow","hellow",
            "hellow","hellow","hellow",
            "hellow","hellow","hellow"};

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                Intent intent = new Intent(getApplicationContext(),ListData.class);
//                intent.putExtra("name",names[i]);
//                intent.putExtra("image",images[i]);
//                startActivity(intent);
            }
        });



    }

    private class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

             View view1=getLayoutInflater().inflate(R.layout.show_items,null);

            TextView textView=findViewById(R.id.item_text_view);
            ImageView imageView=findViewById(R.id.item_image_view);


            textView.setText(names[i]);
            imageView.setImageResource(images[i]);


            return view1;
        }
    }
}
