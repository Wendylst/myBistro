package ie.app.bistro.mybistro;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Adapters.RecyclerViewAdapter;
import Models.ListItemMain;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItemMain> listItems;

    DatabaseReference myDb = FirebaseDatabase.getInstance().getReference();


    public void newOrder(View view){

        Intent startNewActivity = new Intent(this,NewOrder.class);
        startActivity(startNewActivity);
        Toast.makeText(getApplicationContext(),"Who you are tomorrow begins with what you do today.", Toast.LENGTH_SHORT).show();
    }

    public void viewOrder(View view){

        Intent startNewActivity = new Intent(this, ViewOrders.class);
        startActivity(startNewActivity);
        Toast.makeText(getApplicationContext(),"Who you are tomorrow begins with what you do today.", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerViewMain);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        ListItemMain object = new ListItemMain("New Order");
        ListItemMain object1 = new ListItemMain("View Orders");
        listItems.add(object);
        listItems.add(object1);

        adapter = new RecyclerViewAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }



    public void NewOrderButton(View view) {

        Intent startNewActivity = new Intent(this, NewOrder.class);
        startActivity(startNewActivity);
        Toast.makeText(getApplicationContext(), "New Order", Toast.LENGTH_SHORT).show();
    }

    public void ViewOrderButton(View view) {

        Intent startNewActivity = new Intent(this, ViewOrders.class);
        startActivity(startNewActivity);
        Toast.makeText(getApplicationContext(), "View Order", Toast.LENGTH_SHORT).show();
    }

}