package com.example.listviewtask;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayList<Integer> imageList;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listv);
        imageView = (ImageView)findViewById(R.id.imageView);
        ArrayList<String> sp = new ArrayList<String>();
        sp.add("Banana");
        sp.add("Apple");
        sp.add("Kiwi");
        sp.add("Orange");
        sp.add("strawberry");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,sp);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        imageList = new ArrayList<>();
        imageList.add(R.drawable.bascketball);
        imageList.add(R.drawable.football);
        imageList.add(R.drawable.swimball);
        imageList.add(R.drawable.socer);
        imageList.add(R.drawable.tennis);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        imageView.setImageResource(imageList.get(i));

    }
}