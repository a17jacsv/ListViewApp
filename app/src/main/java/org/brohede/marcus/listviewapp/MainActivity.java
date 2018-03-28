package org.brohede.marcus.listviewapp;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Let the static raw data that you use in your ListView be created here as a
    // member variable to the MainActivity class.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The onCreate method is run when the app is created.
        // Before you can implement this you need to create the layout xml files that
        // will hold/show your data created here. You need three create things:
        // * my_listview - the ID to the actual layout element that is our ListView.
        //                 This my_listview element is created in the activity_main.xml file
        // * list_item_textview - This is a new layout xml file that holds the layout for an
        //                        individual item in the ListView we are creating
        // * my_item_textview - This is the ID to the actual TextView that will contain the text for
        //                      an individual item in the ListView we are creating.
        // Here you should enter your code that fills the ListView


        // 1. Create an array
        String[] rawData = {"Jacob", "Olle", "Adam"};

        // 2. Create a List object with your array from step 1 as in-data

        List<String> listData = new ArrayList<String>(Arrays.asList(rawData));

        // 3. Create an ArrayAdapter object that connects
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),R.layout.list_item_textview, R.id.my_item_textview, listData);
        //ArrayAdapter adapter = new ArrayAdapter(GetApplicationContext(),R.Layout.list_item_textview, R.id.my_item_textview, listdata);

        ListView myListView = (ListView)findViewById(R.id.list_view);
        //mylistView.setAdapter(adapter);
        //myListView.setAdapter(adapter);
        //mylistView.setAdapter(adapter);

        myListView.setAdapter(adapter);
        adapter.add("Rolf");
       // adapter.add("Rolf");



        //    * list_item_textview
        //    * my_item_textview
        //    * List object created in step 2
        // 4. Find the ListView layout element "my_listview" and create an object instance
        // 5. Connect the ArrayAdapter from step 3 with ListView object created in step 4
        // 6. Style the ListView items according to Material Design
        //    See: https://material.io/guidelines/components/lists.html#lists-specs
        //    Look for "singel line specs" for "text only" lists and modify the list_item_textview
        //    accordingly
    }
}
