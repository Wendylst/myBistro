package ie.app.bistro.mybistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import Adapters.OrdersViewAdapter;
import Adapters.RecyclerViewAdapter;
import Models.FireBaseSnap;
import Models.ListItemMain;
import Models.NewOrderModel;

public class ViewOrders extends AppCompatActivity/*implements View.OnClickListener*/ {

    private static final String TAG = "View Orders Activity";
    private RecyclerView.Adapter adapter;
    private RecyclerView recView;
    private FirebaseDatabase database;
    private DatabaseReference myRef;
    private List<NewOrderModel> listItems;
    DatabaseReference myDb = FirebaseDatabase.getInstance().getReference();

    //FirebaseRecyclerAdapter<NewOrderModel, OrdersViewAdapter> adapterSomething;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);
        //listItems = new ArrayList<>();
        recView = findViewById(R.id.ordersView);
        recView.setHasFixedSize(true);
        recView.setLayoutManager(new LinearLayoutManager(this));
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child("My Bistro").child("Orders");


       // listItems = new ArrayList<>();
        //NewOrderModel object = new NewOrderModel();
        //NewOrderModel object1 = new NewOrderModel("View Orders");
        //listItems.add(object);
        //listItems.add(object1);
        //onStart();



    }

   // @Override
    public void onStart() {

        super.onStart();
        myDb.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                    NewOrderModel snap = dataSnapshot.getValue(NewOrderModel.class);

                //listItems.add(snap);
                //listItems.add(snap);
                Log.d(TAG, "Value is: " + snap);

                //recView.
                adapter = new OrdersViewAdapter(this, listItems);
                recView.setAdapter(adapter);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "Failed to read value.", databaseError.toException());
            }
        });

    }

}
