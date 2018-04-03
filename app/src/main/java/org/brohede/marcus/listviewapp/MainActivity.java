package org.brohede.marcus.listviewapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import android.graphics.Color;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.id.list;
import static org.brohede.marcus.listviewapp.R.id.list_view;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Create an array
        String[] rawData = {"Jacob", "Olle", "Adam", "Rasmus"};
        // 2. Create a List object with your array from step 1 as in-data
        List<String> listData = new ArrayList<String>(Arrays.asList(rawData));
        // 3. Create an ArrayAdapter object that connects
        final ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.list_item_textview, R.id.my_item_textview, listData);

        ListView myListView = (ListView)findViewById(list_view);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Tjena "+ adapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

        myListView.setAdapter(adapter);

        adapter.add("Rolf");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
