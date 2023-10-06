package com.example.gridviewcoban;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> convatAdapter;
    GridView gvConVat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();


    }

    private void addEvents() {
        gvConVat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Con vật: "+convatAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControls() {
        gvConVat = (GridView) findViewById(R.id.gvConVat);
        convatAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1
        );
        gvConVat.setAdapter(convatAdapter); //set adapter
        ArrayList<String> dsConVat = new ArrayList<>();
        dsConVat.add("Chó");
        dsConVat.add("Mèo");
        dsConVat.add("Gà");
        dsConVat.add("Vịt");
        dsConVat.add("Heo");
        dsConVat.add("Rắn");
        dsConVat.add("Cua");
        dsConVat.add("Cá sấu");
        dsConVat.add("Hổ");
        dsConVat.add("Sư tử");
        convatAdapter.addAll(dsConVat); //đưa dữ liệu danh sách con vật vào adapter

    }
}